package com.hm4ex1.main;

import java.util.Scanner;

public class GetMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Read the first value ");
        int x = sc.nextInt();
        System.out.println("Read the second value ");
        int y = sc.nextInt();
        System.out.println("Read the third value ");
        int z = sc.nextInt();

        int max = getMax(z, getMax(x, y));
        System.out.println("The max value is ");
        System.out.println(max);
    }


    public static int getMax(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}

