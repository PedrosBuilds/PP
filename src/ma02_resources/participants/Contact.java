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

public class Contact {
    private String address;
    private String phone;

    public Contact(String address, String phone) {
        this.address = address;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
