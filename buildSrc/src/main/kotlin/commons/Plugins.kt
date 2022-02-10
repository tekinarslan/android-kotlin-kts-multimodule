import org.gradle.api.JavaVersion

/**
 * Configuration of all gradle build plugins
 */
object Plugins {
    const val ANDROID_APPLICATION = "com.android.application"
    const val ANDROID_LIBRARY = "com.android.library"
    const val ANDROID = "android"

    const val COMMON_ANDROID_LIBRARY = "commons.android-library"
    const val SIGNER_GRADLE = "signing.signer"

    const val KOTLIN_KAPT = "kapt"
    const val SAFE_ARGS = "androidx.navigation.safeargs.kotlin"
    const val KOTLIN_SERIALIZATION = "kotlinx-serialization"
    const val KOTLIN_PARCELIZE = "kotlin-parcelize"
}