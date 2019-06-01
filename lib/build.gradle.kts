plugins {
    id("kotlin2js")
}

group = "com.ilgonmic"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

tasks {
    compileKotlin2Js {
        kotlinOptions {
            moduleKind = "commonjs"
        }
    }
}
