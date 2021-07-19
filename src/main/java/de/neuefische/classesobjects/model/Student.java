package de.neuefische.classesobjects.model;

import java.util.Objects;

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

    @Override
    public String toString(){
        return "Student: " + firstName + ", ID: " + matriculationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matriculationNumber == student.matriculationNumber && Objects.equals(firstName, student.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, matriculationNumber);
    }
}
