plugins {
    application
    checkstyle
    id("org.sonarqube") version "7.1.0.6387"
}

application {
    mainClass.set("hexlet.code.App")
}

repositories {
    mavenCentral()
}

checkstyle {
    toolVersion = "10.12.5"
    configFile = file("${project.rootDir}/config/checkstyle/checkstyle.xml")
}

sonar {
    properties {
        property("sonar.projectKey", "Mercer241_java-project-61")
        property("sonar.organization", "mercer241")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.scanner.skipJreProvisioning", "true")
    }
}