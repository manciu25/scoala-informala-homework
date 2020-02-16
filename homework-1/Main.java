package com.hw.student;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        StudentRepository studentRepository = new StudentRepository();

        try {
            studentRepository.addStudent(new Student("Liza1", "Manciu1", LocalDate.of(1993, 9, 25), "F", "2930925420011"));
            studentRepository.addStudent(new Student("Liza2", "Manciu2", LocalDate.of(1992, 9, 25), "F", "2920925420011"));
            studentRepository.addStudent(new Student("Liza3", "Manciu3", LocalDate.of(1990, 9, 25), "F", "2900925420011"));

        } catch (InvalidStudentException e) {
            logger.log(Level.SEVERE, e.getMessage());
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }

        for (Map.Entry<String, Student> entry : studentRepository.getStudentHashMap().entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
    }
}
