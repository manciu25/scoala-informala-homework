package com.hm4ex4main;

import java.util.Scanner;

public class ComputeAverage {

    public static void main(String[] args) {

        System.out.println("Read the array");
        int[] array = readArray();
        double avg = computeAverage(array);
        System.out.println("The average of the data of the array is:" + avg);
    }

    /**
     * The function reads the array
     * @return The array
     */
    public static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: n = ");
        int length = sc.nextInt();
        int array[] = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter the " + i + " element: ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    /**
     * The function computes the average of the data of the array
     * @param array The input array
     * @return Returns the average of the data of the array
     */
    public static double computeAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;
    }

}
