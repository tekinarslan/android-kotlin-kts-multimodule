package commons

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = Versions.compileSdkVersion
    defaultConfig {
        minSdk = Versions.minSdkVersion
        targetSdk = Versions.targetSdkVersion

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        create("staging") {
            initWith(getByName("debug"))
        }
    }
    buildFeatures{
        dataBinding = true
    }
    compileOptions {
        sourceCompatibility(JavaLanguageVersion.of(Versions.javaVersion))
        targetCompatibility(JavaLanguageVersion.of(Versions.javaVersion))
    }
    kotlinOptions {
        jvmTarget = Versions.javaVersion.toString()
    }
}

dependencies {
    implementation(Kotlin.kotlin_stdlib)
    implementation(Kotlin.kotlin_coroutines_android)
}