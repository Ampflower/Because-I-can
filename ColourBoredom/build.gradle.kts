plugins {
    java
}

group = "gay.ampflower.bic"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit", "junit", "4.12")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
}