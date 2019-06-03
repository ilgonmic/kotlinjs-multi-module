plugins {
    id("org.jetbrains.kotlin.js") version "1.3.40-eap-67" apply false
}

group = "com.ilgonmic"
version = "1.0-SNAPSHOT"

tasks {
    wrapper {
        distributionType = Wrapper.DistributionType.ALL
        gradleVersion = "5.4.1"
    }
}