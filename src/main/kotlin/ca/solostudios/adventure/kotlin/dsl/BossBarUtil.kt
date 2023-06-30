package ca.solostudios.adventure.kotlin.dsl

import net.kyori.adventure.bossbar.BossBar
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.ComponentLike

/**
 * Creates a new bossbar.
 *
 * @param name The name
 * @param progress The progress, between 0 and 1
 * @param color The color
 * @param overlay The overlay
 * @param flags The flags
 * @return A bossbar
 */
@Throws(IllegalArgumentException::class)
fun bossBar(
    name: ComponentLike,
    progress: Float,
    color: BossBar.Color,
    overlay: BossBar.Overlay,
    flags: Set<BossBar.Flag> = setOf(),
): BossBar {
    return BossBar.bossBar(name, progress, color, overlay, flags)
}

/**
 * Creates a new bossbar.
 *
 * @param name The name
 * @param progress The progress, between 0 and 1
 * @param color The color
 * @param overlay The overlay
 * @param flags The flags
 * @return A bossbar
 */
@Throws(IllegalArgumentException::class)
fun bossBar(
    name: Component,
    progress: Float,
    color: BossBar.Color,
    overlay: BossBar.Overlay,
    flags: Set<BossBar.Flag> = emptySet(),
): BossBar {
    return BossBar.bossBar(name, progress, color, overlay, flags)
}
