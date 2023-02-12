package ru.clevertec.plugins;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

import java.io.File;

public class myTestPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getTasks().create("myTestTask", myTestTask.class, project);
    }


}
