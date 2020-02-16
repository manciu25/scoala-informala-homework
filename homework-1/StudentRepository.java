package com.hw.student;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class that adds students, deletes students and reteives the all students with age x
 */
public class StudentRepository {
    private static Logger logger = Logger.getLogger(StudentRepository.class.getName());

    public Map<String, Student> getStudentHashMap() {
        return studentHashMap;
    }

    private Map<String, Student> studentHashMap = new HashMap<String, Student>();

    /**
     * Method that adds students in the HashMap
     */

    public void addStudent(Student student) throws InvalidArgumentException {
        logger.log(Level.INFO, "Adding a student" + student.toString());
        if (student == null) {
            logger.log(Level.SEVERE, "The student can not be null");
            System.out.println("The student can not be null");
            throw new InvalidArgumentException("The student can not be null");
        }
        studentHashMap.put(student.getCNP(), student);
    }

    /**
     * Method that deletes students by ID, if the ID is empty, throws an exception that the student does not exists
     */
    public void deleteStudentByCNP(String cnp) throws InvalidArgumentException {
        logger.log(Level.INFO, "Deleting student with CNP: " + cnp);
        if (cnp.length() == 0 || !studentHashMap.containsKey(cnp)) {
            System.out.println("The student does not exists");
            logger.log(Level.SEVERE, "The student does not exists");
            throw new InvalidArgumentException("The student does not exists");
        }
        studentHashMap.remove(cnp);
    }

    /*** Method- retrieve all students with Age X (for each student the age must be calculated, not stored in a field).
     * exceptions: age must be a number, as the type is integer, age is negative*/

    public List<Student> retrieveAllStudentsWithAgeX(Integer age) throws InvalidArgumentException {
        logger.log(Level.INFO, "Retriving the students with age" + age);
        if (age < 0) {
            System.out.println("The age has to be positive");
            logger.log(Level.SEVERE, "The age has to be positive");
            throw new InvalidArgumentException("The age has to be positive");
        }
        List<Student> studentswithageX = new ArrayList<Student>();

        for (Student q : studentHashMap.values()) {
            LocalDate dateOfBirth = q.getDateOfBirth();
            Period period = Period.between(LocalDate.now(), dateOfBirth);
            Integer age1 = period.getYears();

            if (age == age1) {
                studentswithageX.add(q);
            }
        }
        for (Student q : studentswithageX) {
            System.out.println(q);
        }
        return studentswithageX;
    }

}
