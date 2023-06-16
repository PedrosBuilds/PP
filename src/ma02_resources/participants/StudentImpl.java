/*
 * Nome: Pedro Marques
 * Número: 8190750
 * Turma: <LSIRC12T2>
 *
 * Nome: Francisco Faria
 * Número: 8180335
 * Turma: <Turma do colega de grupo>
 */

package ma02_resources.participants;

public class StudentImpl extends Participant implements StudentInterface {
    private String major;
    private String linkedIn;

    public StudentImpl(String name, String email, Contact contact, Institution institution, String major, String linkedIn) {
        super(name, email, contact, institution);
        this.major = major;
        this.linkedIn = linkedIn;
    }

    @Override
    public String getMajor() {
        return major;
    }

    @Override
    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String getLinkedIn() {
        return linkedIn;
    }

    @Override
    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }
}
