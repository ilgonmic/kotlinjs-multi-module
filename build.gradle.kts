plugins {
    kotlin("js") version "1.4.255-SNAPSHOT" apply false
}

group = "com.ilgonmic"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
        maven("https://dl.bintray.com/kotlin/kotlin-dev")

        mavenCentral()
        mavenLocal()
    }
}
//rootProject.plugins.withType<org.jetbrains.kotlin.gradle.targets.js.yarn.YarnPlugin> {
//    println("HELLO FROM ROOT")
//    rootProject.the<org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootExtension>()
//        .disableGranularWorkspaces()
//}
