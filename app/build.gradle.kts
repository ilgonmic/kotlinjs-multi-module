//import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackCssRule

plugins {
    kotlin("js")
}

group = "com.ilgonmic"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

//dependencies {
//    implementation(kotlin("stdlib-js"))
//    implementation(project(":lib"))
//}

kotlin {
    js {

//        binaries.executable()

        browser {
            dceTask {
                keep("kotlinjs-multi-module-app.foo")
            }
        }
    }

    sourceSets {
        val main by getting {
            kotlin.srcDir("src/main/kotlin")
            dependencies {
                implementation(kotlin("stdlib-js"))
                implementation(project(":lib"))
//                implementation(npm(projectDir.resolve("src/main/my")))
            }
        }
    }
}

//tasks.register("myCopy", Sync::class.java) {
//    println("HELLO 0")
//}

//tasks.withType<org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile>().configureEach {
//    kotlinOptions {
//        println(moduleKind)
//        require(moduleKind == "commonjs")
//    }
//}