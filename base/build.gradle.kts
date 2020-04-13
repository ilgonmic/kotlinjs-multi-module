plugins {
    kotlin("js")
    id("maven-publish")
}

group = "com.ilgonmic"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

//dependencies {
//    implementation(kotlin("stdlib-js"))
//    implementation(npm(projectDir.resolve("src/my")))
//
//    testImplementation(kotlin("test-js"))
//}

kotlin {
    js {
        useCommonJs()
//        moduleName = "base2"
        browser {
//            testTask {
//                useKarma {
////                    useIe()
////                    useOpera()
//                }
//            }
        }
        nodejs()

    }

    sourceSets {
        val main by getting {
            kotlin.srcDir("src/main/kotlin")

            dependencies {
                implementation(kotlin("stdlib-js"))
//                implementation(npm(projectDir.resolve("src/my")))
            }
        }

        val test by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])
        }
    }
}