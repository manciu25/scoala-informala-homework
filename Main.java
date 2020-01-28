package com.calculator;

import org.junit.Assert;
import org.junit.Test;

public class Main {

    /**
     * Print the result of the folowing methods:
     * getMax (returns max value from a, b and c)
     * getMin  (returns max value from a, b and c)
     * getSum  (returns sum a, b and c)
     * getAvg (returns average of a, b and c)
     * areAllPositive (returns true if a,b and c are all positive numbers and false otherwise)
     * isAEven (returns true if a is even and false otherwise)
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator(2, -1, 5);
        System.out.println(calc.getA());
        System.out.println(calc.getMax());
        System.out.println(calc.getAvg());
        System.out.println(calc.getMin());
        System.out.println(calc.getSum());
        System.out.println(calc.isAEven());
        System.out.println(calc.areAllPositive());

    }

}
