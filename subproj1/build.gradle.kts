dependencies {
    compile(project(":html"))
    file("dependencies.txt").readLines().forEach { compile(it) }
}

apply {
    plugin<ApplicationPlugin>()
}

configure<ApplicationPluginConvention> {
    mainClassName = "example.RenderHTMLKt"
}
