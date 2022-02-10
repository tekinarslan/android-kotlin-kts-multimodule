package signing

import org.gradle.kotlin.dsl.extra
import java.io.FileInputStream
import java.util.*

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    val keystorePropertiesFile =
        rootProject.file(projectDir.parent + "/build-secrets/keystore.properties")
    val keystoreProperties = Properties()
    keystoreProperties.load(FileInputStream(keystorePropertiesFile))

    signingConfigs {
        named("debug").configure {
            storeFile = File(projectDir.parent + keystoreProperties["storeFileDebug"] as String)
            keyAlias = keystoreProperties["keyAliasDebug"] as String
            keyPassword = keystoreProperties["keyPasswordDebug"] as String
            storePassword = keystoreProperties["storePasswordDebug"] as String
        }
        create("release") {
            /* The same with debug */
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            signingConfig = signingConfigs.getByName("debug")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("debug") {
            extra.set("applicationIdSuffix", ".debug")
            signingConfig = signingConfigs.getByName("release")
        }
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_11)
        targetCompatibility(JavaVersion.VERSION_11)
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
}
