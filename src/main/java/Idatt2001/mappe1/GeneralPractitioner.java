package Idatt2001.mappe1;

public class GeneralPractitioner extends Doctor{
    public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public void setDiagnosis(Patient p, String diagnose) {
        super.setDiagnosis(p, diagnose);
    }
}
