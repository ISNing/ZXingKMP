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

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            isStatic = true
        }
    }
    jvm {
        compilations.all {
            kotlinOptions {
                jvmTarget = libs.versions.kotlin.jvmTarget.get()
            }
        }
    }

    js {
        browser()
    }

//    @OptIn(org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl::class)
//    wasmJs {
//        browser()
//    }

    applyDefaultHierarchyTemplate()

    sourceSets {
        commonMain.dependencies {
            //put your multiplatform dependencies here
        }
        androidMain.get().dependsOn(jvmMain.get())
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
