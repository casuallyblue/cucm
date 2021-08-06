plugins {
    id("java-library")
    id("com.github.bjornvester.wsdl2java") version "1.2"
    id("maven-publish")
    id("signing")
}

group = "io.github.casually-blue"
version = "1.5"


repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.cxf:cxf:3.4.4")
    implementation("org.apache.cxf:cxf-rt-frontend-jaxrs:3.4.4")
}

wsdl2java{
    cxfVersion.set("3.4.4")

    generatedSourceDir.set(layout.projectDirectory.dir("src/main/java/"))
    packageName.set("com.github.casuallyblue.cucm")
}

java {
    withJavadocJar()
}



tasks {
    register<Jar>("sourcesJar") {
        dependsOn("wsdl2java")
        duplicatesStrategy = DuplicatesStrategy.INCLUDE
        archiveClassifier.set("sources")

    }
}

publishing {
    repositories {
        maven {
            url = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            credentials {
                username = project.property("ossrhUsername") as String?
                password = project.property("ossrhPassword") as String?
            }
        }
    }

    publications {
        create<MavenPublication>("mavenJava") {
            pom {

                groupId = "io.github.casually-blue"
                name.set("cucm")
                description.set("Example Project to learn how to deploy to OSSRH")
                url.set("https://github.com/casually-blue/com.github.casually-blue.cucm")

                from(components["java"])

                licenses {
                    license {
                        name.set("GPL Version 3.0")
                        url.set("https://www.gnu.org/licenses/gpl-3.0.txt")
                    }
                }
                scm {
                    connection.set("scm:git:git@github.com:casually-blue/com.github.casually-blue.cucm.git")
                    developerConnection.set("scm:git:git@github.com:casually-blue/com.github.casually-blue.cucm.git")
                    url.set("https://casually-blue/com.github.casually-blue.cucm.git")
                }

                developers {
                    developer {
                        id.set("tterry")
                        name.set("Thomas Terry")
                        email.set("darkforestsilence@gmail.com")
                        url.set("https://github.com/casually-blue")
                    }
                }
            }
        }
    }
}

signing {
    sign(publishing.publications)
}