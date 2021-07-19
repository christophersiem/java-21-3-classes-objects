package de.neuefische.classesobjects;

import de.neuefische.classesobjects.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    public void getFirstNameShouldReturnFirstName() {
        //GIVEN
        Student student = new Student("Klaus",1);
        String firstName = "Paul";

        //WHEN
        student.setFirstName(firstName);

        //THEN
        assertEquals("Paul", student.getFirstName());
    }

    @Test
    public void getMatriculationNumberShouldReturnMatriculationNumber() {
        //GIVEN
        Student student = new Student("Klaus",1);
        int matriculationNumber = 123;

        //WHEN
        student.setMatriculationNumber(matriculationNumber);

        //THEN
        assertEquals(123, student.getMatriculationNumber());
    }

    @Test
    public void toStringShouldReturnStringOfStudentObject(){
        //GIVEN
        Student student = new Student("Klaus",1);
        String expected = "Student: Klaus, ID: 1";

        //WHEN
        String actual = student.toString();

        //THEN
        assertEquals(expected, actual);

    }


}
