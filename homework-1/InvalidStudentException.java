package com.hw.student;

/**
 * Exception used in case of students with invalid attributes
 */
public class InvalidStudentException extends Exception {
    public InvalidStudentException(String message) {
        super(message);
    }
}
