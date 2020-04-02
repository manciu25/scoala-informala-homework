package com.ioconcurrency;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

/**Main class that checks the functionality of the program */

public class Main {

    public static void main(String[] args) throws IOException {

        String outputFile = "output.txt";
        new PersonThread("first_thread", "file1.txt", outputFile);
        new PersonThread("second_thread", "file2.txt", outputFile);

        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));

        ArrayList<Person> people = ReadingPerson.readFromFile("file1.txt");
        ArrayList<Person> people2 = ReadingPerson.readFromFile("file2.txt");
        for (Person q : people) {
            if (q.getBirthDate().equals(String.valueOf(LocalDate.now())) && q.getSex() == Gender.female) {
                String message = "Happy birthday, " + q.getName() + "! (" + q.getBirthDate() + ")";
                System.out.println(message);
                writer.write(message);
                writer.newLine();
            }
        }

        for (Person q : people2) {
            if (q.getBirthDate().equals(String.valueOf(LocalDate.now())) && q.getSex() == Gender.female) {
                String message = "Happy birthday, " + q.getName() + "! (" + q.getBirthDate() + ")";
                System.out.println(message);
                writer.write(message);
                writer.newLine();
            }
        }
        writer.close();

    }

}