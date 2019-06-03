plugins {
    id("org.jetbrains.kotlin.js")
}

group = "com.ilgonmic"
version = "1.0-SNAPSHOT"

repositories {
    maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(project(":lib"))
}

kotlin {
    target {
        browser()
        nodejs()
    }
}