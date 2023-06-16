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

import com.google.gson.annotations.Expose;
import ma02_resources.participants.Student;
import java.time.LocalDateTime;
import java.util.UUID;

public class Submission implements SubmissionInterface {
    @Expose
    private LocalDateTime date;
    @Expose
    private Student student;
    @Expose
    private String text;
    @Expose
    private UUID id;

    // construtor privado sem argumentos para o Gson
    private Submission() {}

    public Submission(LocalDateTime date, Student student, String text) {
        this.date = date;
        this.student = student;
        this.text = text;
        this.id = UUID.randomUUID();
    }

    @Override
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public int compareTo(SubmissionInterface other) {
        return this.getDate().compareTo(other.getDate());
    }
}
