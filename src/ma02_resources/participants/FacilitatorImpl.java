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

public class FacilitatorImpl extends Participant implements Facilitator {
    private String areaOfExpertise;

    public FacilitatorImpl(String name, String email, Contact contact, Institution institution, String areaOfExpertise) {
        super(name, email, contact, institution);
        this.areaOfExpertise = areaOfExpertise;
    }

    public String getAreaOfExpertise() {
        return areaOfExpertise;
    }

    public void setAreaOfExpertise(String areaOfExpertise) {
        this.areaOfExpertise = areaOfExpertise;
    }
}
