package dependencies

import extensions.Dependency.AndroidTestImplementation
import extensions.Dependency.TestImplementation
import extensions.Dependency.Implementation
import extensions.Dependency.Kapt
import extensions.Dependency.ApiImplementation
import extensions.implementDependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

fun DependencyHandler.addKotlinDependencies() {
    implementDependency(Implementation(Kotlin.kotlin_coroutines_android))
    implementDependency(Implementation(Kotlin.kotlin_serialization_json))
}

fun DependencyHandler.addNavigationDependencies() {
    implementDependency(Implementation(Navigation.androidx_navigation_ui))
    implementDependency(Implementation(Navigation.androidx_navigation_fragment))
}

fun DependencyHandler.addAndroidXDependencies() {
    implementDependency(Implementation(AndroidX.androidx_appcompat))
    implementDependency(Implementation(AndroidX.androidx_constraint_layout))
    implementDependency(Implementation(AndroidX.androidx_fragment))
    implementDependency(Implementation(AndroidX.androidx_activity))
    implementDependency(Implementation(AndroidX.material))
    implementDependency(Implementation(AndroidX.androidx_viewmodel))
    implementDependency(Implementation(AndroidX.androidx_livedata))
    implementDependency(Implementation(AndroidX.androidx_core))
    implementDependency(Implementation(AndroidX.androidx_swiperefresh))
    implementDependency(Implementation(AndroidX.androidx_preference))
    implementDependency(Implementation(AndroidX.androidx_lifecycle_runtime))
    implementDependency(Implementation(AndroidX.androidx_viewpager2))
    implementDependency(Kapt(AndroidX.androidx_lifecycle_compiler))
}

fun DependencyHandler.addTestsDependencies() {
    implementDependency(Implementation(Testing.junit))
    implementDependency(AndroidTestImplementation(Testing.runner))
    implementDependency(AndroidTestImplementation(Testing.androidx_espresso_core))
}

fun DependencyHandler.addKotlinTestsDependencies() {
    implementDependency(TestImplementation(Testing.kotlin_test))
}

// modules
fun DependencyHandler.addCoreModule() {
    implementDependency(Implementation(project(":core")))
}

fun DependencyHandler.addUserModule() {
    implementDependency(Implementation(project(":user")))
}

