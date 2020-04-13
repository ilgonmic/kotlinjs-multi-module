
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
    js {
        browser {
        }
    }

    sourceSets {
        val main by getting {
            kotlin.srcDir("src/main/kotlin")

            dependencies {
                implementation(kotlin("stdlib-js"))
                implementation(project(":base"))
            }
        }

        val test by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}

//dependencies {
//    implementation(kotlin("stdlib-js"))
//    implementation(project(":base"))
//
//    testImplementation(kotlin("test-js"))
//}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])
        }
    }
}