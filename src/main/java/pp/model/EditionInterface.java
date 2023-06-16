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

public interface EditionInterface {
    String getName();
    LocalDate getStart();
    String getProjectTemplate();
    Status getStatus();
    void setStatus(Status status);
    void addProject(String projectName, String projectDescription, String[] projectTags) throws IOException, ParseException;
    void removeProject(String projectId);
    Project getProject(String projectId);
    Project[] getProjects();
    Project[] getProjectsByTag(String tag);
    Project[] getProjectsOf(String participantId);
    int getNumberOfProjects();
    LocalDate getEnd();
    boolean equals(Object obj);
}
