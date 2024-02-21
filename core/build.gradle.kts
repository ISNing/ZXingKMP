plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
}

group = "cn.isning.zxingkmp"
version = "unspecified"


kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = libs.versions.kotlin.jvmTarget.get()
            }
        }
    }

//    listOf(
//        iosX64(),
//        iosArm64(),
//        iosSimulatorArm64()
//    ).forEach {
//        it.binaries.framework {
//            isStatic = true
//        }
//    }
    jvm()

    js {
        browser()
    }

//    @OptIn(org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl::class)
//    wasmJs {
//        browser()
//    }

    sourceSets {
        commonMain.dependencies {
            //put your multiplatform dependencies here
        }
        jvmMain.dependencies {
            implementation(libs.zxing.core.jvm)
        }
        nativeMain.dependencies {
            implementation(libs.zxing.cpp.kn)
        }
        jsMain.dependencies {
            implementation(npm("@zxing/library", libs.versions.zxing.js.get()))
        }
    }
}

android {
    namespace = "cn.isning.zxingkmp"
    compileSdk = 34
    defaultConfig {
        minSdk = 21
    }
    compileOptions {
        sourceCompatibility = JavaVersion.valueOf(libs.versions.jvm.capability.source.get())
        targetCompatibility = JavaVersion.valueOf(libs.versions.jvm.capability.target.get())
    }
}
