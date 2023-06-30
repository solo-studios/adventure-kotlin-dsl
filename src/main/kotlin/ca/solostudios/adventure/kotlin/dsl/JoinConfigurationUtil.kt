package ca.solostudios.adventure.kotlin.dsl

import net.kyori.adventure.text.JoinConfiguration

/**
 * Builds a new join configuration from the provided [builder].
 *
 * @param builder The builder to configure the resulting join configuration
 * @return A new join configuration
 */
fun joinConfiguration(builder: JoinConfiguration.Builder.() -> Unit): JoinConfiguration {
    return JoinConfiguration.builder().also(builder).build()
}
