plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
//    id("com.didi.dokit")
}

buildscript {
    repositories {
    }

    dependencies {
        classpath("io.github.didi.dokit:dokitx-plugin:3.5.0")
//        classpath("org.mockito:mockito-core:3.9.0")
    }
}


android {
    namespace = "com.crash2333.wanandroid"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.crash2333.wanandroid"
        minSdk = 30
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        compose = true
        dataBinding = true //打开dataBinding支持
        buildConfig = true //启用buildConfig
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
        debug {
            isMinifyEnabled = false
            proguardFiles("proguard-android-optimize.txt", "proguard-rules.pro")
        }
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    val dokit_version = "3.5.0"
    val xpopup_version = "2.9.19"
    val utilcodex_version = "1.31.1"

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.0")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    val lifecycle_version = "2.2.0"
    val nav_version = "2.5.3"
    val retrofit_version = "2.9.0"
    val coil_version = "2.4.0"


    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")

    // Jetpack Compose Integration
    implementation("androidx.navigation:navigation-compose:$nav_version")

    testImplementation("com.squareup.okhttp3:mockwebserver:4.3.1")
    //调试工具
    debugImplementation("io.github.didi.dokit:dokitx:${dokit_version}")
    releaseImplementation("io.github.didi.dokit:dokitx-no-op:${dokit_version}")
    //弹框库
    implementation("com.github.li-xiaojun:XPopup:$xpopup_version")
    //工具类库
    implementation("com.blankj:utilcodex:$utilcodex_version")
    //网络请求
    // Retrofit 库
    implementation("com.squareup.retrofit2:retrofit:$retrofit_version")
    implementation("com.squareup.retrofit2:converter-gson:$retrofit_version")
    //拦截器
    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")
    //图片加载
    implementation("io.coil-kt:coil:$coil_version")
}