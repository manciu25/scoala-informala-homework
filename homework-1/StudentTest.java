package com.hw.student;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Class that tests the Student class
 */
public class StudentTest {

    @Test(expected = InvalidStudentException.class)
    public void testLastNameIsEmpty() throws InvalidStudentException {
        Student student = new Student("Liza1", "", LocalDate.of(1993, 9, 25), "F", "2930925420011");
    }


    @Test(expected = InvalidStudentException.class)
    public void testFirstNameIsEmpty() throws InvalidStudentException {
        Student student = new Student("", "Manciu2", LocalDate.of(1993, 9, 25), "F", "2930925420011");
    }


    @Test(expected = InvalidStudentException.class)
    public void testCNPisNIO() throws InvalidStudentException {
        Student student = new Student("Liza1", "Manciu3", LocalDate.of(1993, 9, 25), "F", null);
    }

    @Test(expected = InvalidStudentException.class)
    public void testGenderNIO() throws InvalidStudentException {
        Student student = new Student("Liza1", "Manciu4", LocalDate.of(1993, 9, 25), "x", "2930925420011");
    }
}
