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

import com.google.gson.annotations.SerializedName;

public class Task {
    @SerializedName("title")
    private String title;

    @SerializedName("description")
    private String description;

    @SerializedName("start_at")
    private int startAt;

    @SerializedName("duration")
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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStartAt() {
        return startAt;
    }

    public void setStartAt(int startAt) {
        this.startAt = startAt;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
