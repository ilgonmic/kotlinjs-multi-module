import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackOutput.Target.COMMONJS
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackOutput.Target.COMMONJS2

//import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackCssRule

plugins {
    kotlin("js")
}

group = "com.ilgonmic"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
    maven("https://kotlin.bintray.com/kotlinx")
}

dependencies {
    implementation(project(":lib"))
}

kotlin {

    js {
        useCommonJs()
//        binaries.library()
        binaries.executable()

//        tasks.withType(KotlinJsCompile::class.java) {
//            kotlinOptions {
//                main = "noCall"
//            }
//        }

        browser {

            dceTask {
                keep("kotlinjs-multi-module-app.foo")
                keep("kotlinjs-multi-module-app.foo_za3lpa\$")
            }

            testTask {
                useKarma {
                    useChromeHeadless()
                }
            }
        }
    }

    sourceSets {
        val main by getting {
            dependencies {
                implementation(project(":lib"))
//                implementation(kotlin("test-js"))
//                implementation(npm(projectDir.resolve("src/main/my")))
            }
        }

        val test by getting {
            dependencies {
                implementation(devNpm("istanbul-instrumenter-loader", "3.0.1"))
                implementation(devNpm("karma-coverage-istanbul-reporter", "3.0.3"))
            }
        }
    }
}

//tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile>().named("compileKotlinJs") {
//    kotlinOptions {
//        outputFile = rootProject.buildDir.resolve("js-${name}/build.js").canonicalPath
//    }
//}

//tasks.withType<KotlinJsCompile> {
//    kotlinOptions.freeCompilerArgs += "-Xir-per-module"
//}

//tasks.register("syncCompileKotlinJs", Copy::class.java) {
//    val compile = tasks.withType(org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile::class.java).named("compileKotlinJs")
//    into("routes/node") {
//        from(
//            compile
//            .map {
//                it.outputFile.parentFile
//            }
//        )
//    }
//
//    into("$buildDir")
//
//    dependsOn(compile)
//}

//tasks.register("myCopy", Sync::class.java) {
//    println("HELLO 0")
//}

//tasks.withType<org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile>().configureEach {
//    kotlinOptions {
//        println(moduleKind)
//        require(moduleKind == "commonjs")
//    }
//}