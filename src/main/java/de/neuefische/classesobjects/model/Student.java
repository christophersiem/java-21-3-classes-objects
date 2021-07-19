package de.neuefische.classesobjects.model;

public class Student {
    private String firstName;
    private int matriculationNumber;

    public Student(String firstName, int matriculationNumber){
        this.firstName = firstName;
        this.matriculationNumber = matriculationNumber;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(int matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

    public String toString(){
        return "Student: " + firstName + ", ID: " + matriculationNumber;
    }
}
