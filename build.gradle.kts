plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "net.hydrakecat"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation(group = "com.google.truth", name = "truth", version = "1.1.4")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}