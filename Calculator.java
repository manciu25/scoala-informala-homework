package com.calculator;

/**
 * Calculator class that has 3 Integer fields a,b and c with the following methods:
 * getMax (returns max value from a, b and c)
 * getMin  (returns max value from a, b and c)
 * getSum  (returns sum a, b and c)
 * getAvg (returns average of a, b and c)
 * areAllPositive (returns true if a,b and c are all positive numbers and false otherwise)
 * isAEven (returns true if a is even and false otherwise)
 */

public class Calculator {

    private Integer a;
    private Integer b;
    private Integer c;


    public Calculator(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Calculator() {
    }

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    public Integer getC() {
        return c;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    /**
     * getMax (returns max value from a, b and c)
     */
    public Integer getMax() {

        Integer max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    /**
     * getMin  (returns max value from a, b and c)
     */
    public Integer getMin() {

        Integer min = 0;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    /**
     * getSum  (returns sum a, b and c)
     */
    public Integer getSum() {
        return a + b + c;
    }

    /**
     * getAvg (returns average of a, b and c)
     */
    public double getAvg() {
        return (double) (a + b + c) / 3;
    }


    /**
     * reAllPositive (returns true if a,b and c are all positive numbers and false otherwise)
     */

    public boolean areAllPositive() {
        if (a > 0 && b > 0 && c > 0) return true;
        return false;
    }

    /**
     * isAEven (returns true if a is even and false otherwise)
     */

    public boolean isAEven() {
        if (a % 2 == 0) return true;
        return false;
    }

}
