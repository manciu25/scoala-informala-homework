package com.hm2.ex4.main;

import java.util.Scanner;

public class Biggest {

    int x,y,z;
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please insert first number:");
        int x=readValue(sc);
        System.out.println("Please insert second number:");
        int y=readValue(sc);
        System.out.println("Please insert third number:");
        int z=readValue(sc);

        if (x > y && x > z) {
            System.out.println("The biggest no is " + x);
        } else if (y > x && y > z) {
            System.out.println("The biggest no is " + y);
        } else if (z > x && z > y) {
            System.out.println("The biggest no is " + z);
        }

    }

    public static int readValue(Scanner scanner){
        return scanner.nextInt();
    }

}
