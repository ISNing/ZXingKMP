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

    androidNativeArm32()
    androidNativeArm64()
    androidNativeX86()
    androidNativeX64()
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    macosX64()
    macosArm64()
    watchosX64()
    watchosArm32()
    watchosArm64()
    watchosSimulatorArm64()
    tvosX64()
    tvosArm64()
    tvosSimulatorArm64()
    linuxX64()
    linuxArm64()
    // TODO: Upstream is not ready for mingwX64 yet: https://github.com/ISNing/ZXingKMP/issues/10
//    mingwX64()

    jvm {
        compilations.all {
            kotlinOptions {
                jvmTarget = libs.versions.kotlin.jvmTarget.get()
            }
        }
    }

    js {
        browser {
            testTask {
                useMocha()
            }
        }
        nodejs()
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
        commonTest.dependencies {
            implementation(kotlin("test"))
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
