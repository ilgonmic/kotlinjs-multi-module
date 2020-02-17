//import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackOutput.Target

plugins {
    kotlin("js")
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

kotlin {
    target {
        produceExecutable()

        browser {
            dceTask {
                keep("kotlinjs-multi-module-app.foo")
            }

//            webpackTask {
//                output.libraryTarget = Target.COMMONJS
//                output.library = "app-my-2"
//            }
        }

        binaries {
            executable()
        }
    }
}