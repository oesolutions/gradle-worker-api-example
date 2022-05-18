# gradle-worker-api-example
Gradle plugin that uses the [Worker API](https://docs.gradle.org/current/userguide/custom_tasks.html#worker_api) with classloader isolation to load a class from a project dependency.

## Running
```shell
./gradlew doWork
```
The `doWork` task should output `"Hello"`.
