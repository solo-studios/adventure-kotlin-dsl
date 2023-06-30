import org.jetbrains.dokka.gradle.DokkaTask
import java.time.Year

plugins {
    id("org.jetbrains.dokka")
}

tasks {
    val processDokkaIncludes by register("processDokkaIncludes", ProcessResources::class) {
        from(rootProject.projectDir.resolve("dokka/includes")) {
            doFirst {
                val projectInfo = ProjectInfo(project.groupString, project.name, project.versionString)
                expand(
                    "project" to projectInfo,
                )
            }
        }
        destinationDir = buildDir.resolve("dokka-include")
        group = JavaBasePlugin.DOCUMENTATION_GROUP
    }

    withType<DokkaTask>().configureEach {
        dependsOn(processDokkaIncludes)

        val dokkaBaseConfiguration = """
            {
                "footerMessage": "© ${Year.now()} Copyright solo-studios",
                "separateInheritedMembers": true
            }
        """.trimIndent()
        pluginsMapConfiguration.set(mapOf("org.jetbrains.dokka.base.DokkaBase" to dokkaBaseConfiguration))

        moduleName.set(project.name)
        moduleVersion.set(project.versionString)

        dokkaSourceSets.configureEach {
            includes.from(processDokkaIncludes.destinationDir.listFiles())

            jdkVersion.set(8)
            reportUndocumented.set(true)

            // displayName.set(project.fullName)
        }

        group = JavaBasePlugin.DOCUMENTATION_GROUP
    }
}
