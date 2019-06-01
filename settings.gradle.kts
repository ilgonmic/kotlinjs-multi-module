pluginManagement {
    resolutionStrategy {
        repositories {
            mavenCentral()
            maven {
                url = uri("https://dl.bintray.com/kotlin/kotlin-eap")
            }
        }
        eachPlugin {
            when (requested.id.id) {
                "kotlin2js" -> useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
                "org.jetbrains.kotlin.frontend" -> useModule("org.jetbrains.kotlin:kotlin-frontend-plugin:${requested.version}")
            }
        }
    }
}
rootProject.name = "kotlinjs-multi-module"
include("lib")
include("app")
