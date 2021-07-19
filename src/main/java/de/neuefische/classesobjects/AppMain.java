package de.neuefische.classesobjects;

import de.neuefische.classesobjects.model.Student;

public class AppMain {
    public static void main(String[] args) {
        Student myFirstStudent = new Student("Klara", 123);
        Student mySecondStudent = new Student("Klara", 123);

        System.out.println(myFirstStudent.equals(mySecondStudent));
    }
}
