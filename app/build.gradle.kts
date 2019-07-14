plugins {
    kotlin("js")
}

group = "com.ilgonmic"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(project(":lib"))
}

kotlin {
    target {
        browser {

            // This strange case only for test :)
            dceKeep.add("kotlinjs-multi-module-app.notDelete")

            webpackTask {
                dceEnabled = false
            }

            runTask {
                dceEnabled = true
            }
        }
    }
}