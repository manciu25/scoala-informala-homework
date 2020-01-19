package com.hm4ex2.main;

import java.net.SocketOption;
import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Read the value you want to convert from Fahrenheit to Celsius ");
        double value = sc.nextDouble();
        double celsius = convertFahrenheitToCelsius(value);

        System.out.println("Your body temperature in Celsius degrees is:" + celsius);
        if (celsius > 37) {
            System.out.println("You are ill!");
        }

    }

    /**
     * The function converts Fahrenheit to Celsius degrees
     * @param f The read value in Fahrenheit
     * @return The converted value from Fahrenheit to Celsius
     */
    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;

    }

}
