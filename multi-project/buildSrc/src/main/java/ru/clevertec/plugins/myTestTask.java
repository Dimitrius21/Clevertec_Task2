package ru.clevertec.plugins;

import org.gradle.api.DefaultTask;
import org.gradle.api.Project;
import org.gradle.api.logging.LoggingManager;
import org.gradle.api.tasks.TaskAction;

import javax.inject.Inject;
import java.io.File;

public class myTestTask extends DefaultTask {
    private Project project;

    @Inject
    public myTestTask(Project project) {
        this.project = project;
    }

    @TaskAction
    public void myTask() {
        //System.out.println("my Task");

        //Project projectCore =

        //.filter(project1 -> project1.getName().equals("core")).findFirst().orElse(null);*/

        System.out.println("Project - " + project.getName());
        File root = project.getRootDir();
        File rootProj = project.getProjectDir();
        String rootDir = root.getAbsolutePath() + File.separator + rootProj.getName();
        System.out.println("Path - " + rootDir);
        System.out.println("List of tasks:");
        project.getTasks().forEach(task -> System.out.println(task.getName()));
    }
}
