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

import ma02_resources.participants.Student;

import java.time.LocalDateTime;

public interface SubmissionInterface extends Comparable<SubmissionInterface> {
    LocalDateTime getDate();

    Student getStudent();

    String getText();

    int compareTo(SubmissionInterface var1);
}
