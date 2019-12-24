package com.hm2ex2.main;

import java.util.Scanner;

public class Dimensions {

    public static void main(String[] args) {

        int area;
        int perimeter;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            area = calculateArea (x,y);
            perimeter = calculatePerimeter (x,y);
            System.out.println("The area is"+area);
            System.out.println("The perimeter is"+perimeter);

        } else {
            System.out.println("The dates you introduced are n/a. Please check again. Thank you :)");
        }
    }
    public static int calculateArea(int x, int y) {
        return x*y;
    }

    public static int calculatePerimeter(int x, int y) {
        return x * x + y * y;
    }
}
