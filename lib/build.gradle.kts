plugins {
    kotlin("js")
}

group = "com.ilgonmic"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(project(":base"))

    testImplementation(kotlin("test-js"))
}

kotlin {
    target {
        browser {
            useCommonJs()
        }
    }
}