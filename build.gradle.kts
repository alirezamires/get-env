plugins {
    kotlin("jvm") version "2.0.20"
    id("maven-publish")
    id("signing")
}
val logback_version: String by project
group = "io.github.alirezamires"
version = "0.0.1RC1"

repositories {
    mavenCentral()
}
publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["kotlin"])

            groupId = "io.github.alirezamires"
            artifactId = "GetEnv"
            version = "0.0.1RC1"

            pom {
                name.set("Get Environment")
                description.set("A Kotlin library for Get Environment From System")
                url.set("https://github.com/alirezamires/get-env")
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }
                developers {
                    developer {
                        id.set("alirezamires")
                        name.set("Alireza Mires")
                        email.set("alirezamires@gmail.com")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/alirezamires/get-env.git")
                    developerConnection.set("scm:git:ssh://github.com/alirezamires/get-env.git")
                    url.set("https://github.com/alirezamires/get-env")
                }
            }
        }
    }
}
dependencies {
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
tasks.withType<Test> {
    environment("TEST_INT","10" )
    environment("TEST_DOUBLE", "20.5")
    environment("TEST_STRING","Hello" )
    environment("TEST_LONG", "123456789")
    environment("TEST_FLOAT", "3.14")
}