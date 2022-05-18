plugins {
    id("io.github.oesolutions.worker")
}

dependencies {
    workerClasspath(project(":lib"))
}

worker {
    className.set("io.github.oesolutions.lib.Hello")
}
