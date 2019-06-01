import org.jetbrains.kotlin.gradle.frontend.webpack.WebPackExtension

plugins {
    id("kotlin2js")
    kotlin("frontend")
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

kotlinFrontend {
    bundle<WebPackExtension>("webpack") {
        (this as WebPackExtension).apply {
            bundleName = "app"
            mode = "production"
        }
    }
}

