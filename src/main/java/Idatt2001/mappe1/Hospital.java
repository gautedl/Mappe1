package Idatt2001.mappe1;

import java.util.ArrayList;

public class Hospital {
    String hospitalName;
    private ArrayList<Department> departments;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department newDepartment){
        if(!getDepartments().contains(newDepartment)){
            departments.add(newDepartment);
        }
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", departments=" + departments +
                '}';
    }
}
