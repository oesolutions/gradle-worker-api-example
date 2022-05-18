package io.github.oesolutions.worker;

import org.gradle.api.provider.Property;
import org.gradle.workers.WorkParameters;

public interface WorkerActionParams extends WorkParameters {
    Property<String> getClassName();
}
