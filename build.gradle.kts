plugins {
    alias(libs.plugins.axion.release)

    adventurekt.repositories
    adventurekt.compilation
    adventurekt.tasks
    adventurekt.dokka
    adventurekt.publishing
}

group = "ca.solo-studios"
//version = rootProject.scmVersion.version

dependencies {
    implementation(libs.adventure.api)

    testImplementation(libs.bundles.junit)
    testImplementation(libs.kotlin.test)
}
