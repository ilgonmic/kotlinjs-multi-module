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
    target {
        browser {
            dceTask {
                keep += "kotlinjs-multi-module-app.foo"
                dceOptions {
                    outputDirectory = "$buildDir/js/packages/${project.name}/kotlin-dce-2"
                }
            }
        }
    }
}