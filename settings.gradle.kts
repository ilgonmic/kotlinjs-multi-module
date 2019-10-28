pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
    }
}

rootProject.name = "kotlinjs-multi-module"
include("lib")
include("app")
