plugins {
    kotlin("js") version "1.4-SNAPSHOT" apply false
}

group = "com.ilgonmic"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
        mavenCentral()
        mavenLocal()
    }
}

//subprojects {
////    plugins.withType<org.jetbrains.kotlin.gradle.plugin.KotlinMultiplatformPluginWrapper>().configureEach {
//        tasks.withType<org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile>().configureEach {
//            kotlinOptions {
//                moduleKind = "commonjs"
//            }
//        }
////    }
//
//    tasks.withType<Sync>().configureEach {
//        println("HELLO")
//    }
//}

tasks {
    wrapper {
        distributionType = Wrapper.DistributionType.ALL
        gradleVersion = "6.1.1"
    }
}

class MyTask : DefaultTask()