package ca.solostudios.adventure.kotlin.dsl

import net.kyori.adventure.sound.Sound

/**
 * Builds a new [Sound] from the specified [builder].
 *
 * @param builder The builder to apply values from
 * @return A new [Sound] component
 */
fun sound(builder: Sound.Builder.() -> Unit): Sound {
    return Sound.sound(builder)
}
