package ca.solostudios.adventure.kotlin.dsl

import net.kyori.adventure.text.TextReplacementConfig

/**
 * Builds a new text replacement config from the provided [builder].
 *
 * @param builder The builder to configure the resulting text replacement config
 * @return A new text replacement config
 */
fun textReplacementConfig(builder: TextReplacementConfig.Builder.() -> Unit): TextReplacementConfig {
    return TextReplacementConfig.builder().apply(builder).build()
}
