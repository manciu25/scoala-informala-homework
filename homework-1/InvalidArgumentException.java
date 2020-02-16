package com.hw.student;

/**
 * Exception used in case of students with invalid attributes
 */
public class InvalidArgumentException extends Exception {
    public InvalidArgumentException(String message) {
        super(message);
    }
}
