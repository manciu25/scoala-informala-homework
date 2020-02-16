package com.hw.student;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Student {
    private static Logger logger = Logger.getLogger(Student.class.getName());
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String CNP;

    /**
     * -Setter with the exception: first name should not be empty
     */
    public void setFirstName(String firstName) throws InvalidStudentException {
        if (firstName.isEmpty()) {
            System.out.println("The first name can not be empty");
            logger.log(Level.SEVERE, "The first name can not be empty");
            throw new InvalidStudentException("The first name can not be empty");
        }
        this.firstName = firstName;
    }

    /**
     * -Setter with the exception: last name should not be empty
     */
    public void setLastName(String lastName) throws InvalidStudentException {
        if (lastName.isEmpty()) {
            System.out.println("The last name can not be empty");
            logger.log(Level.SEVERE, "The last name can not be empty");
            throw new InvalidStudentException("The last name can not be empty");
        }
        this.lastName = lastName;
    }

    /**
     * -Setter with exception : date of birth between 1900 and current year - 18
     */
    public void setDateOfBirth(LocalDate dateOfBirth) throws InvalidStudentException {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear() - 18;
        if (dateOfBirth.getYear() < 1900 || dateOfBirth.getYear() > currentYear) {
            logger.log(Level.SEVERE, "The date of birth must be between 1900 and teh current year && the age must be < 18");
            System.out.println("The date of birth must be between 1900 and teh current year && the age must be < 18");
            throw new InvalidStudentException("The date of birth must be between 1900 and teh current year && the age must be < 18");
        }

        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Setter with the exception: gender should be male or female (or M and F), upper/lower case should both be accepted
     */
    public void setGender(String gender) throws InvalidStudentException {
        if (!gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("F")) {

            logger.log(Level.SEVERE, "The gender is NIO");
            System.out.println("The gender is NIO");
            throw new InvalidStudentException("The gender is NIO ");
        }
        this.gender = gender;
    }

    /**
     * Setter with the exception: ID should not be empty
     */
    public void setCNP(String CNP) throws InvalidStudentException {
        if (CNP == null || CNP.length() == 0) {
            logger.log(Level.SEVERE, "The CNP can not be empty or null");
            System.out.println("The CNP can not be empty or null");
            throw new InvalidStudentException("The CNP can not be empty");
        }
        this.CNP = CNP;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getCNP() {
        return CNP;
    }

    /**
     * Constructor that throws exceptions when a Student is created.
     */
    public Student(String firstName, String lastName, LocalDate dateOfBirth, String gender, String CNP) throws InvalidStudentException {
        logger.log(Level.INFO, "Attemting to create student with " + firstName + ", " + lastName + ", " + dateOfBirth + ", " + gender + ", " + CNP);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setDateOfBirth(dateOfBirth);
        this.setGender(gender);
        this.setCNP(CNP);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", CNP='" + CNP + '\'' +
                '}';
    }
}
