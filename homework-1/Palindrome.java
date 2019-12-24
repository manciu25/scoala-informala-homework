package com.hm2.ex2;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        int x;
        int y;
        int reverse = 0;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y=x;
        while (y != 0) {
            reverse = calculateReverse(reverse) + calculateModulo(y);
            y =  divideY(y);
        }
        if( x ==  reverse) {
            System.out.println("The number is palindrome");
        }
        else {
            System.out.println("the number is not palindrome");
        }
    }

    public static int calculateReverse(int reverse) {
        return reverse * 10;
    }

    public static int calculateModulo(int y) {
        return y % 10;
    }

    public static int divideY(int y) {
        return y = y / 10;
    }


}

