package com.ioconcurrency;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

/**Class that reads a file and output the bithday of females with local date
 * */
class PersonThread implements Runnable {
    private String name;
    private Thread t;
    private String fileName;
    private String outputFile;

    PersonThread(String thread, String fileName, String outputFile) {
        this.name = thread;
        this.fileName = fileName;
        this.outputFile = outputFile;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
    }

    public void run() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile,true));
            System.out.println("Reding from file = " + fileName);
            ArrayList<Person> people = ReadingPerson.readFromFile(fileName);
            for (Person q : people) {
                if (q.getBirthDate().equals(String.valueOf(LocalDate.now())) && q.getSex() == Gender.female) {
                    String message = "Happy birthday, " + q.getName() + "! (" + q.getBirthDate() + ")";
                    System.out.println(message);
                        writer.write(message);
                        writer.newLine();
                }

            }
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}