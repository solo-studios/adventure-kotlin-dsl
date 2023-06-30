import kotlin.math.max

plugins {
    java
}

val ext = the<ExtraPropertiesExtension>()
val base = the<BasePluginExtension>()

tasks {
    withType<Test>().configureEach {
        useJUnitPlatform()

        failFast = false
        maxParallelForks = max(Runtime.getRuntime().availableProcessors() - 1, 1)
    }

    withType<AbstractArchiveTask>().configureEach {
        archiveBaseName.set(project.name)
    }

    withType<Javadoc>().configureEach {
        options {
            encoding = "UTF-8"
        }
    }

    withType<Jar>().configureEach {
        from(rootProject.file("LICENSE"))
    }

    named<DefaultTask>("build") {
        dependsOn(withType<Jar>())
    }
}
