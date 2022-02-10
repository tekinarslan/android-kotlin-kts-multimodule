import extensions.applyDefaultRepos

// Top-level build file where you can add configuration options common to all sub-projects/modules.
allprojects {
    repositories.applyDefaultRepos()
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

