package ca.solostudios.adventure.kotlin.dsl

import net.kyori.adventure.key.InvalidKeyException
import net.kyori.adventure.key.Key
import net.kyori.adventure.key.KeyPattern
import net.kyori.adventure.key.Namespaced


/**
 * Creates a key.
 *
 *
 * This will parse `string` as a key, using `character` as a separator between the namespace and the value.
 *
 *
 * The namespace is optional. If you do not provide one (for example, if you provide `player` or `character + "player"`
 * as the string) then [Key.MINECRAFT_NAMESPACE] will be used as a namespace and `string` will be used as the value,
 * removing the provided separator character if necessary.
 *
 * @param string The string
 * @param character The character that separates the namespace from the value
 * @return The key
 */
@Throws(InvalidKeyException::class)
fun key(string: String, character: Char = Key.DEFAULT_SEPARATOR): Key {
    return Key.key(string, character)
}

/**
 * Creates a key.
 *
 *
 * This will parse `string` as a key, using `character` as a separator between the namespace and the value.
 *
 *
 * The namespace is optional. If you do not provide one (for example, if you provide `player` or `character + "player"`
 * as the string) then [Key.MINECRAFT_NAMESPACE] will be used as a namespace and `string` will be used as the value,
 * removing the provided separator character if necessary.
 *
 * @receiver The string
 * @param character The character that separates the namespace from the value
 * @return The key
 */
fun String.toKey(character: Char = Key.DEFAULT_SEPARATOR) {
    Key.key(this, character)
}

/**
 * Creates a key.
 *
 * @param namespaced The namespace source
 * @param value The value
 * @return The key
 */
@Throws(InvalidKeyException::class)
fun key(namespaced: Namespaced, @KeyPattern.Value value: String): Key {
    return Key.key(namespaced, value)
}

/**
 * Creates a key.
 *
 * @param namespace The namespace
 * @param value The value
 * @return The key
 */
@Throws(InvalidKeyException::class)
fun key(@KeyPattern.Namespace namespace: String, @KeyPattern.Value value: String): Key {
    return Key.key(namespace, value)
}
