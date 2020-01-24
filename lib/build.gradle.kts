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

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(project(":base"))

    testImplementation(kotlin("test-js"))
}

kotlin {
    target {
        browser {
            useCommonJs()
//            produceKotlinLibrary()
        }
    }
}

(project.extensions.getByName("kotlin") as org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension).apply {
    sourceSets.all {
        println("SOURCE SET $this")
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])
        }
    }
}