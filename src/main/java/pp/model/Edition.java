/*
 * Nome: Pedro Marques
 * Número: 8190750
 * Turma: <LSIRC12T2>
 *
 * Nome: Francisco Faria
 * Número: 8180335
 * Turma: <Turma do colega de grupo>
 */

package main.java.pp.model;

import ma02_resources.project.*;

import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Edition implements EditionInterface {
    private final String name;
    private final LocalDate start;
    private final String projectTemplate;
    private Status status;
    private final List<Project> projects = new ArrayList<>();

    public Edition(String name, LocalDate start, String projectTemplate, Status status) {
        this.name = name;
        this.start = start;
        this.projectTemplate = projectTemplate;
        this.status = status;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public LocalDate getStart() {
        return start;
    }

    @Override
    public String getProjectTemplate() {
        return projectTemplate;
    }

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public void addProject(String projectName, String projectDescription, String[] projectTags) throws IOException, ParseException {
        // Add code to create a new Project and add it to the projects List.
        // You will need to parse and process the projectTags as per your project requirements.
    }

    @Override
    public void removeProject(String projectId) {
        // Add code to find and remove a Project from the projects List based on projectId.
    }

    @Override
    public Project getProject(String projectId) {
        // Add code to find and return a Project from the projects List based on projectId.
        return null;
    }

    @Override
    public Project[] getProjects() {
        return projects.toArray(new Project[0]);
    }

    @Override
    public Project[] getProjectsByTag(String tag) {
        // Add code to filter projects by tag and return them.
        return null;
    }

    @Override
    public Project[] getProjectsOf(String participantId) {
        // Add code to filter projects by participantId and return them.
        return null;
    }

    @Override
    public int getNumberOfProjects() {
        return projects.size();
    }

    @Override
    public LocalDate getEnd() {
        // Add code to calculate and return the end date.
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Edition edition = (Edition) obj;
        return name.equals(edition.name);
    }
}
