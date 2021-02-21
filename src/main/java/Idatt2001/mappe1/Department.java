package Idatt2001.mappe1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Department{
    String departmentName;
    private ArrayList<Employee> employees;
    private ArrayList<Patient> patients;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployees(){
        return employees;
    }

    public void addEmployee(Employee newEmployee){
        if (!getEmployees().contains(newEmployee)){
            employees.add(newEmployee);
        }
    }

    public List<Patient> getPatients(){
        return patients;
    }

    public void addPatient(Patient newPatient){
        if (!getPatients().contains(newPatient)){
            patients.add(newPatient);
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName, employees, patients);
    }

    public void remove(Person removePerson){
        if (getPatients().contains(removePerson)){
            patients.remove(removePerson);
        } else if (getEmployees().contains(removePerson)){
            employees.remove(removePerson);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(departmentName, that.departmentName) &&
                Objects.equals(employees, that.employees) &&
                Objects.equals(patients, that.patients);
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", employees=" + employees +
                ", patients=" + patients +
                '}';
    }
}
