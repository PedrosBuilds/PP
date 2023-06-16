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

public abstract class Participant implements Cloneable {
    protected String name;
    protected String email;
    protected Contact contact;
    protected Institution institution;

    public Participant(String name, String email, Contact contact, Institution institution) {
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.institution = institution;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Contact getContact() {
        return contact;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Participant that = (Participant) o;

        if (!name.equals(that.name)) return false;
        if (!email.equals(that.email)) return false;
        if (!contact.equals(that.contact)) return false;
        return institution.equals(that.institution);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + contact.hashCode();
        result = 31 * result + institution.hashCode();
        return result;
    }
}
