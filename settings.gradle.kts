pluginManagement {
    resolutionStrategy {
        repositories {
            mavenCentral()
            maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
        }
        eachPlugin {
            when (requested.id.id) {
                "org.jetbrains.kotlin.js" -> useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
        }
    }
}
rootProject.name = "kotlinjs-multi-module"
include("lib")
include("app")
