plugins {
    kotlin("js")
    id("kotlin-dce-js")
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
        browser {}
    }
}

tasks {
    runDceKotlin {
        dceOptions {
            outputDirectory = "${rootProject.buildDir}/js/packages/${rootProject.name}-${project.name}/kotlin-dce"
            keep += "kotlinjs-multi-module-app.notDelete"
        }

        getByName("browserWebpack").dependsOn(this)

        // It should be improved, DCE and optimize.js is not necessary to use with run task
        getByName("browserRun").dependsOn(this)
    }
}