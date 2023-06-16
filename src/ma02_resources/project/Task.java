/*
 * Nome: Pedro Marques
 * Número: 8190750
 * Turma: <LSIRC12T2>
 *
 * Nome: Francisco Faria
 * Número: 8180335
 * Turma: <Turma do colega de grupo>
 */

package ma02_resources.project;

public class Task {
    private String title;
    private String description;
    private int startAt;
    private int duration;

    public Task(String title, String description, int startAt, int duration) {
        this.title = title;
        this.description = description;
        this.startAt = startAt;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getStartAt() {
        return startAt;
    }

    public int getDuration() {
        return duration;
    }
}
