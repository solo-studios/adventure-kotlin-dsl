package ca.solostudios.adventure.kotlin.dsl

import net.kyori.adventure.audience.Audience
import net.kyori.adventure.audience.ForwardingAudience

/**
 * Creates an audience that does nothing.
 *
 * @return A do-nothing audience
 */
fun audienceOf(): Audience = Audience.empty()

/**
 * Creates an audience that forwards to many other audiences.
 *
 * @param audiences An array of audiences, can be empty
 * @return An audience
 * @see ForwardingAudience
 */
fun audienceOf(vararg audiences: Audience): Audience = Audience.audience(*audiences)

/**
 * Creates an audience that forwards to many other audiences.
 *
 * The underlying `Iterable` is not copied, therefore any changes
 * made will be reflected in `Audience`.
 *
 * @param audiences An iterable of audiences, can be empty
 * @return An audience
 * @see ForwardingAudience
 */
fun audienceOf(audiences: List<Audience>): Audience = Audience.audience(audiences)
