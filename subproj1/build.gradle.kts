dependencies {
    file("dependencies.txt").readLines().forEach { compile(it) }
}
apply {
    plugin<ApplicationPlugin>()
}

configure<ApplicationPluginConvention> {
    mainClassName = "example.MyMainKt"
}
