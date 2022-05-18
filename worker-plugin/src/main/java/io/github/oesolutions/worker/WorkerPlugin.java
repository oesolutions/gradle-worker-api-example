package io.github.oesolutions.worker;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.artifacts.Configuration;

public class WorkerPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        Configuration conf = project.getConfigurations().create("workerClasspath");
        WorkerExtension ext = project.getExtensions().create("worker", WorkerExtension.class);
        project.getTasks().register("doWork", WorkerTask.class, t -> {
            t.getClasspath().from(conf);
            t.getClassName().convention(ext.getClassName());
        });
    }
}
