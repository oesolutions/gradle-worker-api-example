plugins {
    `java-gradle-plugin`
}

gradlePlugin {
    plugins {
        create("worker") {
            id = "io.github.oesolutions.worker"
            implementationClass = "io.github.oesolutions.worker.WorkerPlugin"
        }
    }
}
