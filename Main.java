package com.ski.biathlons;

import java.io.*;
import java.util.*;

/**
 * Main class, that tests the functionality of the program
 */

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<String> array = ReadingResults.readFromFile();
        List<Athlete> athletes = new ArrayList<Athlete>();

        for (String linie : array) {

            System.out.println("array de i" + linie);
            String[] splitArray = linie.split(",");
            String[] array2 = splitArray[3].split(":");
            SkiTimeResult result = new SkiTimeResult(Integer.parseInt(array2[0]), Integer.parseInt(array2[1]));
            Athlete a = new Athlete(Integer.parseInt(splitArray[0]), splitArray[1], splitArray[2], result, splitArray[4], splitArray[5], splitArray[6]);
            long result1 = a.getSkiTimeResult().getMinutes() * 60 + a.getSkiTimeResult().getSeconds() + (Util.shooting(a.getFirstShooting()) + Util.shooting(a.getSecondShooting()) + Util.shooting(a.getThirdShooting())) * 10;
            int min = (int) result1 / 60;
            int sec = (int) result1 - min * 60;
            System.out.println(min + " " + sec);
            SkiTimeResult q = new SkiTimeResult(min, sec);
            a.setSkiTimeResult(q);

            athletes.add(a);
        }

        Collections.sort(athletes, new Athlete.AthletesResultsComparator());
        for (Athlete q : athletes) {
            System.out.println(q.toString());
        }

    }
}