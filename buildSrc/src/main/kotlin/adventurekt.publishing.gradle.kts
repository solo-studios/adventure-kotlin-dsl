plugins {
    signing
    `maven-publish`
}

afterEvaluate {
    publishing {
        publications {
            val projectName = project.nameFormatted
            val projectGroup = project.groupString
            val projectVersion = project.versionString
            val projectDescription = """
                A Kotlin DSL for adventure
            """.trimIndent()
            val projectUrl = Repository.projectUrl
            val projectBaseUri = Repository.projectBaseUri

            val licenseName = "MIT"
            val licenseUrl = "https://mit-license.org/"

            create<MavenPublication>("maven") {
                groupId = projectGroup
                artifactId = project.name
                version = projectVersion
                from(components["java"])

                pom {
                    name.set(projectName)
                    description.set(projectDescription)
                    url.set(projectUrl)

                    inceptionYear.set("2023")

                    licenses {
                        license {
                            name.set(licenseName)
                            url.set(licenseUrl)
                        }
                    }
                    developers {
                        developer {
                            id.set("solonovamax")
                            name.set("solonovamax")
                            email.set("solonovamax@12oclockpoint.com")
                            url.set("https://solonovamax.gay/")
                        }
                    }
                    issueManagement {
                        system.set("GitHub")
                        url.set("$projectUrl/issues")
                    }
                    scm {
                        connection.set("scm:git:$projectUrl.git")
                        developerConnection.set("scm:git:ssh://$projectBaseUri.git")
                        url.set(projectUrl)
                    }
                }
            }
        }
        repositories {
            maven {
                name = "Sonatype"

                val releasesUrl =
                    uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/") // releases repo
                val snapshotUrl = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/") // snapshot repo
                url = if (isSnapshot) snapshotUrl else releasesUrl

                credentials(PasswordCredentials::class)
            }
            maven {
                name = "SoloStudios"

                val releasesUrl = uri("https://maven.solo-studios.ca/releases/")
                val snapshotUrl = uri("https://maven.solo-studios.ca/snapshots/")
                url = if (isSnapshot) snapshotUrl else releasesUrl

                credentials(PasswordCredentials::class)
                authentication { // publishing doesn't work without this for some reason
                    create<BasicAuthentication>("basic")
                }
            }
        }
    }

    signing {
        useGpgCmd()
        sign(publishing.publications["maven"])
    }
}
