import groovy.util.Node
import groovy.util.NodeList

plugins {
    kotlin("multiplatform")
    `maven-publish`
}

group = project.rootProject.group
version = project.rootProject.version


repositories {
    maven("https://maven.aliyun.com/repository/central")
    maven("https://maven.aliyun.com/repository/public/")
}

kotlin {
    jvm{
        withJava()
    }
    jvmToolchain(17)


    sourceSets {
        commonMain{

        }
        jvmMain{
            dependencies {
            }
        }

        jvmTest{
            dependencies {
                implementation("junit:junit:4.13.1")
            }
        }
    }
}
