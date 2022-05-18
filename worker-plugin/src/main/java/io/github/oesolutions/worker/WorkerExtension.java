package io.github.oesolutions.worker;

import org.gradle.api.provider.Property;

public interface WorkerExtension {
    Property<String> getClassName();
}
