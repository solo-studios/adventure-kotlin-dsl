package ca.solostudios.adventure.kotlin.dsl

import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.util.HSVLike
import net.kyori.adventure.util.RGBLike
import org.jetbrains.annotations.Range


/**
 * The [RGBLike.red] component.
 *
 * Allows for destructuring into `(r, g, b)`.
 *
 * @return The [RGBLike.red] component
 */
operator fun RGBLike.component1(): Int = this.red()

/**
 * The [RGBLike.green] component.
 *
 * Allows for destructuring into `(r, g, b)`.
 *
 * @return The [RGBLike.green] component
 */
operator fun RGBLike.component2(): Int = this.green()

/**
 * The [RGBLike.blue] component.
 *
 * Allows for destructuring into `(r, g, b)`.
 *
 * @return The [RGBLike.blue] component
 */
operator fun RGBLike.component3(): Int = this.blue()

/**
 * The [HSVLike.h] component.
 *
 * Allows for destructuring into `(h, s, v)`.
 *
 * @return The [HSVLike.h] component
 */
operator fun HSVLike.component1(): Float = h()

/**
 * The [HSVLike.s] component.
 *
 * Allows for destructuring into `(h, s, v)`.
 *
 * @return The [HSVLike.s] component
 */
operator fun HSVLike.component2(): Float = s()

/**
 * The [HSVLike.v] component.
 *
 * Allows for destructuring into `(h, s, v)`.
 *
 * @return The [HSVLike.v] component
 */
operator fun HSVLike.component3(): Float = v()

/**
 * Creates a new text colour.
 *
 * @receiver The rgb value
 * @return A new text colour
 */
fun Int.toTextColor(): TextColor = TextColor.color(this)

/**
 * Creates a new text color, converting the provided [HSVLike] to the RGB color space.
 *
 * @receiver The hsv value
 * @return A new text color
 * @see [https://en.wikipedia.org/wiki/HSL_and_HSV](https://en.wikipedia.org/wiki/HSL_and_HSV)
 */
fun HSVLike.toTextColor(): TextColor = TextColor.color(this)

/**
 * Creates a new text colour.
 *
 * @receiver The rgb value
 * @return A new text colour
 */
fun RGBLike.toTextColor(): TextColor = TextColor.color(this)

/**
 * Creates a new colour from a hex string.
 *
 * @receiver The hex string
 * @return A new text colour
 */
fun String.toTextColor(): TextColor? {
    return TextColor.fromHexString(this)
}

/**
 * Create a color from a CSS hex string (#rrggbb or #rgb).
 *
 * @receiver The hex string
 * @return A new text colour
 */
fun String.toTextColorCSS(): TextColor? {
    return TextColor.fromCSSHexString(this)
}

/**
 * Find the colour nearest to the provided colour.
 *
 * @receiver The colours for matching
 * @param any Colour to match
 * @param C The color type
 * @return Nearest named colour. will always return a value
 */
fun <C : TextColor> List<C>.nearestColorTo(any: TextColor): C {
    return TextColor.nearestColorTo(this, any)
}

/**
 * Create a new text colour with the red, green, and blue components individually.
 *
 * @param red Red, as a value from 0 to 255
 * @param green Green, as a value from 0 to 255
 * @param blue Blue, as a value from 0 to 255
 * @return A new text colour
 */
fun textColorOf(
    red: @Range(from = 0x0, to = 0xff) Int,
    green: @Range(from = 0x0, to = 0xff) Int,
    blue: @Range(from = 0x0, to = 0xff) Int,
): TextColor {
    return TextColor.color(red, green, blue)
}

/**
 * Create a new color with the individual components as floats.
 *
 * @param red Red, from [0, 1]
 * @param green Green, within [0, 1]
 * @param blue Blue, within [0, 1]
 * @return A new text colour
 */
fun textColorOf(
    red: Float,
    green: Float,
    blue: Float,
): TextColor {
    return TextColor.color(red, green, blue)
}

