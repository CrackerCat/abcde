
plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
}

group = "me.yricky"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
//    google()
}

//dependencies {
//    testImplementation ("junit:junit:4.13.1")
//    api("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.17.1")
//
//    // Note, if you develop a library, you should use compose.desktop.common.
//    // compose.desktop.currentOs should be used in launcher-sourceSet
//    // (in a separate module for demo project and in testMain).
//    // With compose.desktop.common you will also lose @Preview functionality
//}

kotlin {
    jvm{
        withJava()
    }
    jvmToolchain(17)


    sourceSets {
//        val desktopMain by getting

        val commonMain by getting{
            dependencies{
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.6.3")
            }
        }

        macosArm64 {
            binaries {
                sharedLib {
                    baseName = "abcde" // on Linux and macOS
                    // baseName = "libnative" // on Windows
                }
            }
        }

        val jvmMain by getting{
            dependencies {
                api("com.charleskorn.kaml:kaml:0.58.0")
                api("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.17.1")
            }
        }

        val jvmTest by getting{
            dependencies {
                implementation("junit:junit:4.13.1")
            }
        }
    }
}
