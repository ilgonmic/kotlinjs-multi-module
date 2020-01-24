pluginManagement {
    repositories {
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
        gradlePluginPortal()
        mavenCentral()
    }
}


rootProject.name = "kotlinjs-multi-module"
include("base")
include("lib")
include("app")
