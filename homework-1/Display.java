package com.hm2ex5.main;

import java.util.Scanner;

public class Display {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert first number:");
        int x = sc.nextInt();
        System.out.println("Please insert second number:");
        int y = sc.nextInt();
        if (x <= y) {
            while (x <= y) {
                x = display1(x);
            }
        } else {
            while (y <= x){
                x = display2(x);
            }
        }

    }

    public static int display1(int x) {
        System.out.println(x);
        return ++x;
    }

    public static int display2 (int x) {
        System.out.println(x);
        return --x;
    }

}
