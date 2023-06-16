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

public class Submission implements SubmissionInterface {
    private final LocalDateTime date;
    private final Student student;
    private final String text;

    public Submission(LocalDateTime date, Student student, String text) {
        this.date = date;
        this.student = student;
        this.text = text;
    }

    @Override
    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public Student getStudent() {
        return student;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public int compareTo(SubmissionInterface other) {
        return this.getDate().compareTo(other.getDate());
    }
}