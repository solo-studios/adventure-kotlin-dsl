package ca.solostudios.adventure.kotlin.dsl

import net.kyori.adventure.identity.Identity
import java.util.UUID

/**
 * Creates an identity.
 *
 * @receiver The uuid
 * @return An identity
 */
fun UUID.toIdentity(): Identity = Identity.identity(this)
