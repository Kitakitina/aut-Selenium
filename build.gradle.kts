plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    testImplementation("io.cucumber:cucumber-java:8.0.3")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:8.0.3")

    testImplementation("org.seleniumhq.selenium:selenium-java:4.49.0")
    testImplementation("com.titusfortner:selenium-logger:2.4.0")
}

tasks.test {
    useJUnitPlatform()
}