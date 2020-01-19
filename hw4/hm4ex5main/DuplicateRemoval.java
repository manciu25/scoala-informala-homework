package com.hm4ex5main;

import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateRemoval {

    public static void main(String[] args) {

        System.out.println("Read the array");
        int[] array = readArray();
        System.out.println("The array without duplicates is:"+ Arrays.toString(removeDuplicates(array)));

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
     * The function removes the duplicates
     * @param array The input array
     * @return The array without duplicates
     */
    public static int[] removeDuplicates(int[] array) {
        Arrays.sort(array);
        int[] temp = new int[array.length];
        int index = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[index++] = array[i];
            }
        }
        temp[index++] = array[array.length - 1];

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }
        return result;

    }


}
