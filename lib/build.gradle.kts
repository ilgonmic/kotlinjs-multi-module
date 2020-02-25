import org.jetbrains.kotlin.gradle.plugin.KotlinJsCompilerType.BOTH
import org.jetbrains.kotlin.gradle.plugin.KotlinJsCompilerType.IR

plugins {
    kotlin("js")
    id("maven-publish")
}

group = "com.ilgonmic"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

kotlin {
    js(BOTH) {
        useCommonJs()
        browser {
        }
        produceExecutable()
    }
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(project(":base"))

    testImplementation(kotlin("test-js"))
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])
        }
    }
}