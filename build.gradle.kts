plugins {
    java
}

buildscript {
    repositories{
        gradlePluginPortal()
        mavenLocal()
    }
}

repositories {
    jcenter()
    maven(url = "https://mvnrepository.com/artifact")
    maven(url = "https://jitpack.io")

    mavenLocal()
}

dependencies {
    annotationProcessor(Libraries.lombok)

    compileOnly(Libraries.javax)
    compileOnly(Libraries.lombok)

    implementation(Libraries.javaWebsockets)
    implementation(Libraries.logback)
    implementation(Libraries.gson)
    implementation(Libraries.slf4jApi)
}

apply<JavaLibraryPlugin>()

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks {

    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
}