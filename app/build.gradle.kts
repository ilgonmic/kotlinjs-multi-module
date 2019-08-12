plugins {
    kotlin("js")
    id("kotlin-dce-js")
}

group = "com.ilgonmic"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(project(":lib"))
}

// Bin is WA for Windows
kotlin {
    target {
        browser {
            webpackTask {
                sourceMaps = false
            }

            runTask {
                sourceMaps = false
            }
        }
    }
}