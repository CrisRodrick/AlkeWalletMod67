plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("dagger.hilt.android.plugin")
    id("kotlin-android")      //Room
    id("kotlin-kapt")		//room
}

android {
    namespace = "com.example.alkewalletandroid"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.alkewalletandroid"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures{
        viewBinding= true
        dataBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.core.ktx)
    implementation(libs.transport.runtime)
    implementation(libs.play.services.cast.framework)
    implementation(libs.firebase.auth.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    //libreria navigator
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.7")

    implementation("androidx.activity:activity-ktx:1.3.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")

    //Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")

    // Retrofit with Scalar Converter
    implementation( "com.squareup.retrofit2:converter-scalars:2.9.0")

    // Glide
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.16.0")

    // Room
    val room_version = "2.6.1"
    implementation("androidx.room:room-runtime:$room_version")
    implementation("androidx.room:room-ktx:$room_version")
    kapt("androidx.room:room-compiler:$room_version")

    // Fragment KTX
    implementation("androidx.fragment:fragment-ktx:1.7.1")

    // viewModel and LiveData
    val lifecycle_version = "2.8.0"
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1")

    // Hilt Core
    implementation("com.google.dagger:hilt-android:2.50")
    kapt("com.google.dagger:hilt-android-compiler:2.50")

    // Hilt ViewModel
    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03") // Asegúrate de usar la versión más reciente si está disponible
    kapt("androidx.hilt:hilt-compiler:1.0.0") // Esta es

    //otras
    implementation ("com.squareup.okhttp3:okhttp:4.9.3")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.9.3")
    implementation ("javax.inject:javax.inject:1")
}
kapt {
    correctErrorTypes = true       // Para asegurarte de que Hilt está correctamente configurado
}