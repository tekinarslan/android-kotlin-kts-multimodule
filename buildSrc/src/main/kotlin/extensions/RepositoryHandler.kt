package extensions

import org.gradle.api.artifacts.dsl.RepositoryHandler

/**
 * Adds all default repositories used to access the different declared dependencies
 */
fun RepositoryHandler.applyDefaultRepos() {
    google()
    mavenCentral()
    jcenter()
    maven {
        setUrl("https://jitpack.io")
    }
}