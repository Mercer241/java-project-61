plugins {
    application
    checkstyle  // ← ДОБАВЬ ЭТУ СТРОКУ
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
