package ca.solostudios.adventure.kotlin.dsl

import ca.solostudios.adventure.kotlin.dsl.annotation.ComponentDSLMarker
import net.kyori.adventure.inventory.Book
import net.kyori.adventure.sound.Sound

/**
 * Builds a new [Sound] from the specified [builder].
 *
 * @param builder The builder to apply values from
 * @return A new [Sound] component
 */
@ComponentDSLMarker
fun book(builder: Book.Builder.() -> Unit): Book {
    return Book.builder().apply(builder).build()
}
