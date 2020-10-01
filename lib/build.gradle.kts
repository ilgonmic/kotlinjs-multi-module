
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
    target {
        browser {
//            testTask {
//                useKarma {
//                    useChromeHeadless()
////                    webpackConfig.cssSupport.enabled = true
//                }
//            }
        }
    }

    sourceSets {
        val main by getting {
            dependencies {
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

//tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile>().named("compileKotlinJs") {
//    kotlinOptions {
//        outputFile = rootProject.buildDir.resolve("js-$name/build.js").canonicalPath
//    }
//}

val attr = Attribute.of(
    "my.attr",
    String::class.java
)

dependencies {
//    implementation(kotlin("stdlib-js"))
//    implementation(project(":base"))
//
//    testImplementation(kotlin("test-js"))
    constraints {
//        implementation(org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependencyConstraint(
//            project = project,
//            name = "decamelize",
//            version = "1.0.0"
//        ))
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])
        }
    }
}