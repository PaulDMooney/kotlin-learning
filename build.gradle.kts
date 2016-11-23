import org.jetbrains.kotlin.gradle.plugin.KotlinPlugin

buildscript {
    repositories {
        gradleScriptKotlin()
    }

    dependencies {
        classpath(kotlinModule("gradle-plugin"))
    }
}

allprojects {


    group="ca.mooney"

    version="1.0-SNAPSHOT"

    configure(listOf(repositories, buildscript.repositories)) {
        gradleScriptKotlin()
    }

}

apply {
    plugin("base")
}


subprojects {

    apply {
        plugin("kotlin")
    }

    dependencies {
        compile("ch.qos.logback:logback-classic:1.1.7")
        compile(kotlinModule("stdlib"))
    }
}



