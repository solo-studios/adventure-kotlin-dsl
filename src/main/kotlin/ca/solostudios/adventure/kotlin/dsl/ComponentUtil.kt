package ca.solostudios.adventure.kotlin.dsl

import ca.solostudios.adventure.kotlin.dsl.annotation.ComponentDSLMarker
import net.kyori.adventure.text.BlockNBTComponent
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.ComponentBuilder
import net.kyori.adventure.text.ComponentLike
import net.kyori.adventure.text.EntityNBTComponent
import net.kyori.adventure.text.JoinConfiguration
import net.kyori.adventure.text.KeybindComponent
import net.kyori.adventure.text.ScoreComponent
import net.kyori.adventure.text.SelectorComponent
import net.kyori.adventure.text.StorageNBTComponent
import net.kyori.adventure.text.TextComponent
import net.kyori.adventure.text.TranslatableComponent
import net.kyori.adventure.text.format.Style

/**
 * Adds [that] as a child component.
 *
 * @return A component
 */
operator fun Component.plus(that: ComponentLike): Component {
    return append(that)
}

/**
 * Joins this array of components using the provided [config].
 *
 * @param config The join configuration
 * @return The resulting component
 */
fun Array<out ComponentLike>.join(config: JoinConfiguration = JoinConfiguration.noSeparators()): Component {
    return Component.join(config, *this)
}

/**
 * Joins this iterable of components using the provided [config].
 *
 * @param config The join configuration
 * @return The resulting component
 */
fun Iterable<ComponentLike>.join(config: JoinConfiguration = JoinConfiguration.noSeparators()): Component {
    return Component.join(config, this)
}

/**
 * The X component of this world position.
 *
 * Allows for destructuring into `(x, y, z)`.
 *
 * @return The X component
 */
operator fun BlockNBTComponent.WorldPos.component1(): BlockNBTComponent.WorldPos.Coordinate = x()

/**
 * The Y component of this world position.
 *
 * Allows for destructuring into `(x, y, z)`.
 *
 * @return The Y component
 */
operator fun BlockNBTComponent.WorldPos.component2(): BlockNBTComponent.WorldPos.Coordinate = y()

/**
 * The Z component of this world position.
 *
 * Allows for destructuring into `(x, y, z)`.
 *
 * @return The Z component
 */
operator fun BlockNBTComponent.WorldPos.component3(): BlockNBTComponent.WorldPos.Coordinate = z()

/**
 * Builds a new [BlockNBTComponent] from the specified [builder].
 *
 * @param builder The builder to apply values from
 * @return A new [BlockNBTComponent] component
 */
@ComponentDSLMarker
fun blockNBT(builder: BlockNBTComponent.Builder.() -> Unit): BlockNBTComponent {
    return Component.blockNBT(builder)
}

/**
 * Builds a new [BlockNBTComponent] from the specified [builder] and appends it to a [ComponentBuilder].
 *
 * @receiver The builder to append it to
 * @param builder The builder to apply values from
 * @return A new [BlockNBTComponent] component
 */
@ComponentDSLMarker
fun ComponentBuilder<*, *>.blockNBT(builder: BlockNBTComponent.Builder.() -> Unit): BlockNBTComponent {
    return Component.blockNBT(builder).also { component ->
        append(component)
    }
}

/**
 * Builds a new [EntityNBTComponent] from the specified [builder].
 *
 * @param builder The builder to apply values from
 * @return A new [EntityNBTComponent] component
 */
@ComponentDSLMarker
fun entityNBT(builder: EntityNBTComponent.Builder.() -> Unit): EntityNBTComponent {
    return Component.entityNBT(builder)
}

/**
 * Builds a new [EntityNBTComponent] from the specified [builder] and appends it to a [ComponentBuilder].
 *
 * @receiver The builder to append it to
 * @param builder The builder to apply values from
 * @return A new [EntityNBTComponent] component
 */
@ComponentDSLMarker
fun ComponentBuilder<*, *>.entityNBT(builder: EntityNBTComponent.Builder.() -> Unit): EntityNBTComponent {
    return Component.entityNBT(builder).also { component ->
        append(component)
    }
}

/**
 * Builds a new [KeybindComponent] from the specified [builder].
 *
 * @param builder The builder to apply values from
 * @return A new [KeybindComponent] component
 */
@ComponentDSLMarker
fun keybind(builder: KeybindComponent.Builder.() -> Unit): KeybindComponent {
    return Component.keybind(builder)
}

/**
 * Builds a new [KeybindComponent] from the specified [builder] and appends it to a [ComponentBuilder].
 *
 * @receiver The builder to append it to
 * @param builder The builder to apply values from
 * @return A new [KeybindComponent] component
 */
@ComponentDSLMarker
fun ComponentBuilder<*, *>.keybind(builder: KeybindComponent.Builder.() -> Unit): KeybindComponent {
    return Component.keybind(builder).also { component ->
        append(component)
    }
}

/**
 * Builds a new [ScoreComponent] from the specified [builder].
 *
 * @param builder The builder to apply values from
 * @return A new [ScoreComponent] component
 */
@ComponentDSLMarker
fun score(builder: ScoreComponent.Builder.() -> Unit): ScoreComponent {
    return Component.score(builder)
}

/**
 * Builds a new [ScoreComponent] from the specified [builder] and appends it to a [ComponentBuilder].
 *
 * @receiver The builder to append it to
 * @param builder The builder to apply values from
 * @return A new [ScoreComponent] component
 */
@ComponentDSLMarker
fun ComponentBuilder<*, *>.score(builder: ScoreComponent.Builder.() -> Unit): ScoreComponent {
    return Component.score(builder).also { component ->
        append(component)
    }
}

/**
 * Builds a new [SelectorComponent] from the specified [builder].
 *
 * @param builder The builder to apply values from
 * @return A new [SelectorComponent] component
 */
@ComponentDSLMarker
fun selector(builder: SelectorComponent.Builder.() -> Unit): SelectorComponent {
    return Component.selector(builder)
}

/**
 * Builds a new [SelectorComponent] from the specified [builder] and appends it to a [ComponentBuilder].
 *
 * @receiver The builder to append it to
 * @param builder The builder to apply values from
 * @return A new [SelectorComponent] component
 */
@ComponentDSLMarker
fun ComponentBuilder<*, *>.selector(builder: SelectorComponent.Builder.() -> Unit): SelectorComponent {
    return Component.selector(builder).also { component ->
        append(component)
    }
}

/**
 * Builds a new [StorageNBTComponent] from the specified [builder].
 *
 * @param builder The builder to apply values from
 * @return A new [StorageNBTComponent] component
 */
@ComponentDSLMarker
fun storageNBT(builder: StorageNBTComponent.Builder.() -> Unit): StorageNBTComponent {
    return Component.storageNBT(builder)
}

/**
 * Builds a new [StorageNBTComponent] from the specified [builder] and appends it to a [ComponentBuilder].
 *
 * @receiver The builder to append it to
 * @param builder The builder to apply values from
 * @return A new [StorageNBTComponent] component
 */
@ComponentDSLMarker
fun ComponentBuilder<*, *>.storageNBT(builder: StorageNBTComponent.Builder.() -> Unit): StorageNBTComponent {
    return Component.storageNBT(builder).also { component ->
        append(component)
    }
}

/**
 * Builds a new [TextComponent] from the specified [builder].
 *
 * @param builder The builder to apply values from
 * @return A new [TextComponent] component
 */
@ComponentDSLMarker
fun text(builder: TextComponent.Builder.() -> Unit): TextComponent {
    return Component.text(builder)
}

/**
 * Builds a new [TextComponent] from the specified [builder] and appends it to a [ComponentBuilder].
 *
 * @receiver The builder to append it to
 * @param builder The builder to apply values from
 * @return A new [TextComponent] component
 */
@ComponentDSLMarker
fun ComponentBuilder<*, *>.text(builder: TextComponent.Builder.() -> Unit): TextComponent {
    return Component.text(builder).also { component ->
        append(component)
    }
}

/**
 * Builds a new [TranslatableComponent] from the specified [builder].
 *
 * @param builder The builder to apply values from
 * @return A new [TranslatableComponent] component
 */
@ComponentDSLMarker
fun translatable(builder: TranslatableComponent.Builder.() -> Unit): TranslatableComponent {
    return Component.translatable(builder)
}

/**
 * Builds a new [TranslatableComponent] from the specified [builder] and appends it to a [ComponentBuilder].
 *
 * @receiver The builder to append it to
 * @param builder The builder to apply values from
 * @return A new [TranslatableComponent] component
 */
@ComponentDSLMarker
fun ComponentBuilder<*, *>.translatable(builder: TranslatableComponent.Builder.() -> Unit): TranslatableComponent {
    return Component.translatable(builder).also { component ->
        append(component)
    }
}

/**
 * Allows editing using [Style.Builder] as the receiver parameter.
 *
 * @param consumer The consumer to edit this style with
 * @return A new style, with the changes applied from this builder
 */
@ComponentDSLMarker
fun Style.edit(consumer: Style.Builder.() -> Unit): Style {
    return edit(consumer)
}

/**
 * Builds a new [Style] from the specified [builder].
 *
 * @param builder The builder to apply values from
 * @return A new [Style]
 */
@ComponentDSLMarker
fun style(builder: Style.Builder.() -> Unit): Style {
    return Style.style(builder)
}

/**
 * Builds a new [Style] from the specified [builder] and appends it to a [ComponentBuilder].
 *
 * @receiver The builder to append it to
 * @param builder The builder to apply values from
 * @return A new [Style]
 */
@ComponentDSLMarker
fun ComponentBuilder<*, *>.style(builder: Style.Builder.() -> Unit): Style {
    return Style.style(builder).apply {
        style(this)
    }
}
