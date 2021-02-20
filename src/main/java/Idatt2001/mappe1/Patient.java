package Idatt2001.mappe1;

public class Patient extends Person implements Diagnosable{
    String diagnosis = "";

    public Patient(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    String getDiagnose(){
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
