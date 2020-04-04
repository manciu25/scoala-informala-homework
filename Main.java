package com.java8.HW;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Main class that checks the functionality of the program
 */
public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Read the target month");
        Scanner sc = new Scanner(System.in);
        int targetMonth = sc.nextInt();

        List<Person> listPerson = ReadFromFile.readingUsingStream(" inputfilename.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter("outputfilename.txt", true));

        for (Person p : ReturnOutput.display(listPerson, targetMonth)) {
            String message = p.getFirstName() + " " + p.getLastName();
            System.out.println(message);
            writer.write(message);
            writer.newLine();
        }
        writer.close();
    }
}

