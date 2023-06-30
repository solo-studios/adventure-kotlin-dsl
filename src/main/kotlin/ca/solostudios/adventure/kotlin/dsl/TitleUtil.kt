package ca.solostudios.adventure.kotlin.dsl

import net.kyori.adventure.text.Component
import net.kyori.adventure.title.Title
import java.time.Duration
import kotlin.time.toKotlinDuration

/**
 * The fade in component of this title times.
 *
 * Allows for destructuring into `(fadeIn, stay, fadeOut)`.
 *
 * @return The fade in component
 */
operator fun Title.Times.component1(): kotlin.time.Duration = fadeIn().toKotlinDuration()

/**
 * The stay component of this title times.
 *
 * Allows for destructuring into `(fadeIn, stay, fadeOut)`.
 *
 * @return The stay component
 */
operator fun Title.Times.component2(): kotlin.time.Duration = stay().toKotlinDuration()

/**
 * The fade out component of this title times.
 *
 * Allows for destructuring into `(fadeIn, stay, fadeOut)`.
 *
 * @return The fade out component
 */
operator fun Title.Times.component3(): kotlin.time.Duration = fadeOut().toKotlinDuration()

/**
 * Creates a title.
 *
 * @param title The title
 * @param subtitle The subtitle
 * @param times The times
 * @return The title
 */
fun title(
    title: Component,
    subtitle: Component,
    times: Title.Times = Title.DEFAULT_TIMES,
): Title {
    return Title.title(title, subtitle, times)
}

/**
 * Creates times.
 *
 * @param fadeIn The fade-in time
 * @param stay The stay time
 * @param fadeOut The fade-out time
 * @return Times
 */
fun times(
    fadeIn: Duration = Title.DEFAULT_TIMES.fadeIn(),
    stay: Duration = Title.DEFAULT_TIMES.stay(),
    fadeOut: Duration = Title.DEFAULT_TIMES.fadeOut(),
): Title.Times {
    return Title.Times.times(fadeIn, stay, fadeOut)
}
