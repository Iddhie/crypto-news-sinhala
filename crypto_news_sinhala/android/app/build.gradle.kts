plugins {
    id("com.android.application")
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
    id("com.google.gms.google-services") // Firebase Google Services Plugin
}

android {
    namespace = "com.example.crypto_news_sinhala"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    defaultConfig {
        applicationId = "com.example.crypto_news_sinhala" // Ensure this matches Firebase
        minSdk = 21 // Minimum SDK for Firebase
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
        multiDexEnabled = true // Enable multidex for large apps
    }

    buildTypes {
        release {
            // Add your own signing config for the release build.
            signingConfig signingConfigs.getByName("debug") // Use debug keys for now
            minifyEnabled false
            shrinkResources false
            proguardFiles getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
        }
    }

    signingConfigs {
        release {
            // Update these values with your release key configuration
            storeFile file("key.jks")
            storePassword "your_store_password"
            keyAlias "your_key_alias"
            keyPassword "your_key_password"
        }
    }

    lintOptions {
        checkReleaseBuilds false
    }
}

dependencies {
    implementation platform('com.google.firebase:firebase-bom:32.2.0') // Firebase BOM
    implementation 'com.google.firebase:firebase-analytics'
    implementation 'com.google.firebase:firebase-auth'
    implementation 'com.google.firebase:firebase-firestore'
    implementation 'com.google.firebase:firebase-storage'

    // Other dependencies
    implementation 'androidx.multidex:multidex:2.0.1' // Multidex support
}

flutter {
    source = "../.."
}
