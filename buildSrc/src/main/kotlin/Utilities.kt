import org.gradle.api.Project

val Project.nameFormatted: String
    get() = "Adventure Kotlin DSL"

val Project.isSnapshot: Boolean
    get() = version.toString().endsWith("-SNAPSHOT")

val Project.versionString: String
    get() = project.version as? String ?: project.version.toString()

val Project.groupString: String
    get() = project.group as? String ?: project.group.toString()

object Repository {
    val projectUser = "solo-studios"
    val projectRepo = "adventure-kotlin-dsl"
    val projectBaseUri = "github.com/$projectUser/$projectRepo"
    val projectUrl = "https://$projectBaseUri"
}

/**
 * Project info class for the `processDokkaIncludes` task.
 */
data class ProjectInfo(val group: String, val module: String, val version: String)
