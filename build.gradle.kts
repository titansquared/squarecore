plugins {
    kotlin("jvm") version "1.8.0"
    id("net.minecrell.plugin-yml.bukkit") version "0.5.1"
}

group = "net.titanreborn"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.19.3-R0.1-SNAPSHOT")
}

bukkit {
    main = "net.titanreborn.squared.core.SquareCore"
    apiVersion = "1.19"
}