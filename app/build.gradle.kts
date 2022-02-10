import AppVersion.build
import AppVersion.major
import AppVersion.minor
import AppVersion.patch
import Versions.javaVersion
import dependencies.*

plugins {
    id(Plugins.ANDROID_APPLICATION)
    kotlin(Plugins.ANDROID)
    kotlin(Plugins.KOTLIN_KAPT)
    id(Plugins.SAFE_ARGS)
}

android {
    compileSdk = Versions.compileSdkVersion
    defaultConfig {
        minSdk = Versions.minSdkVersion
        targetSdk = Versions.targetSdkVersion
        versionCode = (major * 10000 + minor * 1000 + patch * 100 + build)
        versionName = "${major}.${minor}.${patch}"
        vectorDrawables.useSupportLibrary = true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        multiDexEnabled = true
    }

    buildTypes {
        getByName("debug") {
            extra.set("enableCrashlytics", false)
            applicationIdSuffix = ".debug"
            signingConfig = signingConfigs.getByName("debug")
        }
        create("staging") {
            initWith(getByName("debug"))
        }
    }
    compileOptions {
        sourceCompatibility(JavaLanguageVersion.of(javaVersion))
        targetCompatibility(JavaLanguageVersion.of(javaVersion))
    }
    kotlinOptions {
        jvmTarget = javaVersion.toString()
    }
}

dependencies {
    addCoreModule()
    addUserModule()

    // AndroidX
    addAndroidXDependencies()

    // Navigation & Fragments
    addNavigationDependencies()
}
