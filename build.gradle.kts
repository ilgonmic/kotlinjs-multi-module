plugins {
    kotlin("js") version "1.3-SNAPSHOT" apply false
}

group = "com.ilgonmic"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
    }
}

tasks {
    wrapper {
        distributionType = Wrapper.DistributionType.ALL
        gradleVersion = "5.4.1"
    }
}