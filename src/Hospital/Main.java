package Hospital;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        patient1.setName("Dora");
        patient1.setAilment("Malaria");
        patient1.setAge(12);
        patient1.setSex("Female");

        Doctor doc1 = new Doctor();
        doc1.setName("Joel");
        doc1.setField("Flu");

        Ward ward = new Ward();
        ward.setRoomnumber(176);
        ward.setBed("Mouka");
        ward.setSize("Queen sized");
        ward.setNoOfBeds(2);

        patient1.setAssigneddoctor(doc1);
        System.out.println(patient1.getName() + " is assigned to " + "Dr. " + patient1.getAssigneddoctor().getName());

        patient1.setAssignedward(ward);
        System.out.println(patient1.getName() + " is to lodge in Ward " + patient1.getAssignedward().getRoomnumber() +
                " with a " + patient1.getAssignedward().getSize() + " " + patient1.getAssignedward().getBed());

        Patient patient2= new Patient();
        patient2.setName("Jomiloju");
        patient2.setAilment("Flu");
        patient2.setAge(19);
        patient2.setSex("male");

        Doctor doc2 = new Doctor();
        doc2.setName("Derrick");
        doc2.setField("Malaria");

        Patient patient3 = new Patient();
        patient3.setName("Tolani");
        patient3.setAilment("High blood pressure");
        patient3.setAge(56);
        patient3.setSex("Male");

        Doctor doc3 = new Doctor();
        doc3.setName("Sophie");
        doc3.setField("High blood pressure");



    }
}
