plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("kotlin-parcelize")
    id("kotlin-android")
}

android {
    namespace = "com.dicoding.asclepius"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.dicoding.asclepius"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
        buildConfig = true
        mlModelBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.activity:activity-ktx:1.9.2")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")


    // TODO: Tambahkan Library TensorFlow Lite
    implementation("org.tensorflow:tensorflow-lite-support:0.4.4")
    implementation("org.tensorflow:tensorflow-lite-metadata:0.4.4")
    implementation("org.tensorflow:tensorflow-lite-task-vision:0.4.4")

    // Image crop
    implementation("com.github.yalantis:ucrop:2.2.8")

    // Camera
    // implementation("androidx.camera:camera-camera2:1.3.4")
    // implementation("androidx.camera:camera-lifecycle:1.3.4")
    // implementation("androidx.camera:camera-view:1.3.4")

    // Navigation
    implementation("androidx.navigation:navigation-fragment-ktx:2.8.2")
    implementation("androidx.navigation:navigation-ui-ktx:2.8.2")

    // Retrofit + okhttp
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    // implementation("com.squareup.retrofit2:adapter-coroutines:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")

    // Room
    implementation("androidx.room:room-ktx:2.6.1")
    implementation("androidx.room:room-runtime:2.6.1")
    ksp("androidx.room:room-compiler:2.6.1")

    // Coroutines
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.6") // ViewModelScope
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.6") // LiveData
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.6") // LifecycleScope

    // Glide
    implementation("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.15.1")

    // Shimmer
    implementation("com.facebook.shimmer:shimmer:0.5.0")

    // Browser
    implementation("androidx.browser:browser:1.8.0")

}