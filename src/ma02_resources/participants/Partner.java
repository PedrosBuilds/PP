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

public class Partner extends Participant implements PartnerInterface {
    private String vat;
    private String website;

    public Partner(String name, String email, Contact contact, Institution institution, String vat, String website) {
        super(name, email, contact, institution);
        this.vat = vat;
        this.website = website;
    }

    @Override
    public String getVat() {
        return vat;
    }

    @Override
    public void setVat(String vat) {
        this.vat = vat;
    }

    @Override
    public String getWebsite() {
        return website;
    }

    @Override
    public void setWebsite(String website) {
        this.website = website;
    }
}
