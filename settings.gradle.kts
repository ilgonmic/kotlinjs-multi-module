pluginManagement {
    repositories {
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
        mavenCentral()
    }
}

rootProject.name = "kotlinjs-multi-module"
include("lib")
include("app")
