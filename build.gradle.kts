plugins {
    id("kotlin2js") version "1.3.31" apply false
    kotlin("frontend") version "0.0.45" apply false
}

group = "com.ilgonmic"
version = "1.0-SNAPSHOT"

tasks {
    wrapper {
        distributionType = Wrapper.DistributionType.ALL
        gradleVersion = "5.4.1"
    }
}