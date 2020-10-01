pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "kotlin-dce-js") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
            if (requested.id.id == "kotlinx-serialization") {
                useModule("org.jetbrains.kotlin:kotlin-serialization:${requested.version}")
            }
        }
    }
    repositories {
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
        mavenLocal()
        gradlePluginPortal()
        mavenCentral()
        maven("https://dl.bintray.com/kotlin/kotlin-dev")
    }
}


rootProject.name = "kotlinjs-multi-module"
include("base")
include("lib")
include("kotlin-gradle-plugin-npm-versions-codegen")
include("app")
