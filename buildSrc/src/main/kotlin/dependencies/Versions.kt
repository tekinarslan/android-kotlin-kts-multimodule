/**
 * Shared file between builds so that they can all use the same dependencies and
 * maven repositories.
 **/

object AppVersion{
    const val major = 4
    const val minor = 3
    const val patch = 0
    const val build = 1 // bump for builds, public betas, etc.
}

object Versions {
    // Sdk and tools
    const val minSdkVersion = 21
    const val targetSdkVersion = 31
    const val compileSdkVersion = 31
    const val javaVersion = 11

    const val kotlin = "1.6.10"
    const val ktx = "1.6.0"
    const val activity = "1.3.1"
    const val fragment = "1.3.6"
    const val preference = "1.1.1"
    const val material = "1.4.0"
    const val appcompat = "1.3.1"
    const val annotation = "1.2.0"
    const val recyclerview = "1.2.1"
    const val viewpager2 = "1.0.0"
    const val swiperefresh = "1.1.0"
    const val livedata = "2.3.1"
    const val lifecycle = "2.3.1"
    const val navigation = "2.4.0"
    const val coroutines = "1.5.2"
    const val serialization = "1.3.0"
    const val webkit = "1.4.0"
    const val room = "2.4.1"
    const val constraint_layout = "2.1.1"

    //testing
    const val core_testing = "2.1.0"
    const val espresso = "3.1.0"
    const val androidx_junit = "1.1.3"
    const val junit = "4.13.2"
    const val mockito = "4.0.0"
    const val runner = "1.0.2"
}