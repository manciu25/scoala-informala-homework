package com.ski.biathlons;

import java.io.*;
import java.util.ArrayList;

/**Class that read data from txt file*/

public class ReadingResults {

    public static ArrayList<String> readFromFile() throws FileNotFoundException {
        ArrayList<String> arrayAthlete= new ArrayList<String>();

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream("r.txt")))) {
            String val="";
            while ((val = bf.readLine()) != null) {

                arrayAthlete.add(val);

                System.out.println("val "+val);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arrayAthlete;

    }
}
