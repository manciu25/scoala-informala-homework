package com.hm4ex3main;

import java.util.Scanner;

public class DataValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What time is it?");
        System.out.println("Read value for hours");
        int hour = sc.nextInt();
        System.out.println("Read value for minutes");
        int minutes = sc.nextInt();

        if (dataValidation(hour, minutes)) {
            System.out.println("The time is " + hour + ":" + minutes + "now");
        } else {
            System.out.println("Incorrect time!");
        }
    }

    /**
     * The function validates if the input values are valid
     * @param hour Input value for hour
     * @param minutes Input value for minutes
     * @return Returns false if the data is invalid and true if the data is valid
     */
    public static boolean dataValidation(int hour, int minutes) {
        if (hour < 0 || hour > 24) {
            return false;
        }
        if (minutes < 0 || minutes > 60) {
            return false;
        }
        return true;
    }


}
