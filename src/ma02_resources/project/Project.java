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

import ma02_resources.participants.Facilitator;
import ma02_resources.participants.PartnerInterface;
import ma02_resources.participants.Student;
import ma02_resources.project.exceptions.*;

import java.util.HashSet;
import java.util.Set;

public class Project {
    private Set<Facilitator> facilitators = new HashSet<>();
    private Set<Student> students = new HashSet<>();
    private Set<PartnerInterface> partnerInterfaces = new HashSet<>();
    private Set<Task> tasks = new HashSet<>();

    public void addFacilitator(Facilitator facilitator) throws ParticipantAlreadyInProject, IllegalNumberOfParticipantType {
        if(facilitators.contains(facilitator)) {
            throw new ParticipantAlreadyInProject("This facilitator is already in the project.");
        }
        if(facilitators.size() >= 2) {
            throw new IllegalNumberOfParticipantType("The number of facilitators cannot exceed 2.");
        }
        facilitators.add(facilitator);
    }

    public void addStudent(Student student) throws ParticipantAlreadyInProject, IllegalNumberOfParticipantType {
        if(students.contains(student)) {
            throw new ParticipantAlreadyInProject("This student is already in the project.");
        }
        if(students.size() >= 4) {
            throw new IllegalNumberOfParticipantType("The number of students cannot exceed 4.");
        }
        students.add(student);
    }

    public void addPartner(PartnerInterface partnerInterface) throws ParticipantAlreadyInProject, InstituitionAlreadyExistException {
        if(partnerInterfaces.contains(partnerInterface)) {
            throw new ParticipantAlreadyInProject("This partner is already in the project.");
        }
        for(PartnerInterface existingPartnerInterface : partnerInterfaces) {
            if(existingPartnerInterface.getInstitution().getName().equals(partnerInterface.getInstitution().getName())) {
                throw new InstituitionAlreadyExistException("This institution is already a partner in the project.");
            }
        }
        partnerInterfaces.add(partnerInterface);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }
}
