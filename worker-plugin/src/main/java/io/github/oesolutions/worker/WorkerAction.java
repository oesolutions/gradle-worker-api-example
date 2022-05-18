package io.github.oesolutions.worker;

import org.gradle.workers.WorkAction;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class WorkerAction implements WorkAction<WorkerActionParams> {
    @Override
    public void execute() {
        String className = getParameters().getClassName().get();
        try {
            Class<?> c = Thread.currentThread().getContextClassLoader().loadClass(className);
            Method greetingMethod = c.getMethod("getGreeting");
            Object o = c.newInstance();
            System.out.println(greetingMethod.invoke(o));
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
