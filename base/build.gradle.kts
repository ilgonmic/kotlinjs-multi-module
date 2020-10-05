import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin

//import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnResolution
//import org.jetbrains.kotlin.gradle.targets.js.yarn.yarn

plugins {
    kotlin("js")
    id("maven-publish")
}

group = "com.ilgonmic"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

val attr = Attribute.of(
    "my.attr",
    String::class.java
)

//rootProject.plugins.withType(org.jetbrains.kotlin.gradle.targets.js.yarn.YarnPlugin::class.java) {
//    rootProject.the<org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootExtension>().apply {
//        resolutions.add(
//            YarnResolution("lodash").apply {
//                include("^1.0.0")
//                exclude("~1.2.1", "1.3.0 - 1.4.0")
//            }
//        )
//    }
//}

dependencies {
//    implementation(npm(projectDir.resolve("src/my")))

    testImplementation(kotlin("test-js"))
    implementation(npm("decamelize", "*", true))

//    constraints {
//        implementation(org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependencyConstraint(project, "lodash", "^1.0.0")) {
//            version {
//               reject("~1.2.1", "1.3.0 - 1.4.0")
//            }
//        }
//    }
}

rootProject.plugins.withType(NodeJsRootPlugin::class.java) {
    rootProject.the<NodeJsRootExtension>().versions.dukat.version = "0.5.8-rc.1"
}

kotlin {
    js {
//    js {
        nodejs()
//        useCommonJs()
//        browser {
//            testTask {
//                useKarma {
////                    useIe()
////                    useOpera()
//                }
//            }
//        }

//    }
    }

    sourceSets {
        val main by getting {
//            kotlin.srcDir("src/main/kotlin")

            dependencies {
                implementation(devNpm("date-arithmetic", "*"))
            }
        }

        val test by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}

//tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile>().named("compileKotlinJs") {
//    kotlinOptions {
//        outputFile = rootProject.buildDir.resolve("js-$name/build.js").canonicalPath
//    }
//}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])
        }
    }
}