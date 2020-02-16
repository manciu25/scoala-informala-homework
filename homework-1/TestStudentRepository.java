package com.hw.student;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;


/**
 * Class that tests the StudentRepository
 */
public class TestStudentRepository {

    @Test(expected = NullPointerException.class)
    public void testAddStudentThrowsException() throws InvalidArgumentException {
        StudentRepository test = new StudentRepository();
        test.addStudent(null);
    }

    @Test
    public void testAddStudent() throws InvalidArgumentException, InvalidStudentException {
        Student student = new Student("Liza1", "Manciu4", LocalDate.of(1993, 9, 25), "f", "2930925420011");
        StudentRepository testStudentRepository = new StudentRepository();
        testStudentRepository.addStudent(student);
        Assert.assertEquals(1, testStudentRepository.getStudentHashMap().size());
    }

    @Test
    public void testDeleteStudent() throws InvalidStudentException, InvalidArgumentException {
        Student student = new Student("Liza1", "Manciu4", LocalDate.of(1993, 9, 25), "f", "2930925420011");
        Student student1 = new Student("Liza1", "Manciu4", LocalDate.of(1993, 9, 25), "f", "2930925420091");
        StudentRepository testDeteleStudent = new StudentRepository();
        testDeteleStudent.addStudent(student);
        testDeteleStudent.addStudent(student1);
        testDeteleStudent.deleteStudentByCNP(student1.getCNP());
        Assert.assertEquals(1, testDeteleStudent.getStudentHashMap().size());
    }

}
