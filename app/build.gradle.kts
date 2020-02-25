import org.jetbrains.kotlin.gradle.plugin.KotlinJsCompilerType.IR
import org.jetbrains.kotlin.gradle.plugin.KotlinJsCompilerType.LEGACY

plugins {
    kotlin("js")
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

kotlin {
    js(IR) {
        produceExecutable()
        useCommonJs()

        browser {
            dceTask {
                keep("kotlinjs-multi-module-app.foo")
            }
        }
    }
}