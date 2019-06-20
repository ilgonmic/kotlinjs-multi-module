plugins {
    kotlin("js") version "1.3.40" apply false
}

group = "com.ilgonmic"
version = "1.0-SNAPSHOT"

tasks {
    wrapper {
        distributionType = Wrapper.DistributionType.ALL
        gradleVersion = "5.4.1"
    }
}