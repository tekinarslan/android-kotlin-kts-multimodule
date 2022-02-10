plugins {
    `kotlin-dsl`
}
repositories {
    google()
    mavenCentral()
    jcenter()
    maven {
        setUrl("https://jitpack.io")
    }
}
dependencies {
    implementation("com.android.tools.build:gradle:7.1.1")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    implementation("org.jetbrains.kotlin:kotlin-serialization:1.6.10")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.0-alpha01")
}

