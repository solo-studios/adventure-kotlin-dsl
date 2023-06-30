# Module adventure-kotlin-dsl

A kotlin DSL for adventure

## Features

- Kotlin utilities for [Adventure](https://docs.advntr.dev/)
- Kotlin DSL for creating and appending components

## Including

You can include adventure-kotlin-dsl in your project by adding the following:

### Maven

```xml
<dependency>
  <groupId>${project.group}</groupId>
  <artifactId>${project.module}</artifactId>
  <version>${project.version}</version>
</dependency>
```

### Gradle Groovy DSL

```groovy
implementation '${project.group}:${project.module}:${project.version}'
```

### Gradle Kotlin DSL

```kotlin
implementation("${project.group}:${project.module}:${project.version}")
```

### Gradle Version Catalog

```toml
${project.module} = { group = "${project.group}", name = "${project.module}", version = "${project.version}" }
```

## Examples

### Kotlin-style DSL for Adventure

```kotlin
val text = text { // creates a new text component
    content("Test ")

    style { // this style is automatically applied to the text component
        color(NamedTextColor.GOLD)
        decorate(TextDecoration.BOLD)
    }

    text { // this text component is automatically added as a child component
        content("123")
        style { // this style is automatically applied to the text component
            color(NamedTextColor.RED)
        }
    }

    translatable { // this translatable component is automatically added as a child component
        key("whatever")
        args(
            text {
                content("arg1 content")
            },
            text {
                content("arg2 content")
            },
        )
    }
}
```
