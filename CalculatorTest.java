package com.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the methods below:
 * getMax (returns max value from a, b and c)
 * getMin  (returns max value from a, b and c)
 * getSum  (returns sum a, b and c)
 * getAvg (returns average of a, b and c)
 * areAllPositive (returns true if a,b and c are all positive numbers and false otherwise)
 * isAEven (returns true if a is even and false otherwise)
 */
public class CalculatorTest {
/**Tests getMax */
    @Test
    public void testMax1() {
        Calculator calc = new Calculator(1, 2, 3);
        Integer max = 3;
        Assert.assertEquals(max, calc.getMax());
    }
    /**Tests getMax */
    @Test
    public void testMax2() {
        Calculator calc = new Calculator(-1, 0, 5);
        Integer max = -1;
        Assert.assertNotEquals(max, calc.getMax());
    }
    /**Tests getMax */
    @Test
    public void testMax3() {
        Calculator calc = new Calculator(4, 5, 6);
        Integer max = 6;
        Assert.assertEquals(max, calc.getMax());
    }

    /**Tests getMin*/
    @Test
    public void testMin1() {
        Calculator calc = new Calculator(-1, 2, 3);
        Integer min = -1;
        Assert.assertEquals(min, calc.getMin());
    }
    /**Tests getMin*/
    @Test
    public void testMin2() {
        Calculator calc = new Calculator(-1, -2, 3);
        Integer min = -2;
        Assert.assertEquals(min, calc.getMin());
    }
    /**Tests getMin*/
    @Test
    public void testMin3() {

        Calculator calc = new Calculator(-2, -2, 3);
        Integer min = -2;
        Assert.assertEquals(min, calc.getMin());
    }
    /**Tests getSum*/
    @Test
    public void testSum1() {

        Calculator calc = new Calculator(-2, -2, 3);
        Integer sum = -1;
        Assert.assertEquals(sum, calc.getSum());
    }
    /**Tests getSum*/
    @Test
    public void testSum2() {

        Calculator calc = new Calculator(2, -2, 3);
        Integer sum = -1;
        Assert.assertNotEquals(sum, calc.getSum());
    }
    /**Tests getSum*/
    @Test
    public void testSum3() {

        Calculator calc = new Calculator(12, -2, 3);
        Integer sum = 13;
        Assert.assertEquals(sum, calc.getSum());
    }
    /**Tests getAvg*/
    @Test
    public void testAvg1() {

        Calculator calc = new Calculator(1, 1, 1);
        double avg = 1;
        Assert.assertEquals(avg, calc.getAvg(), 0.1);
    }
    /**Tests getAvg*/
    @Test
    public void testAvg2() {

        Calculator calc = new Calculator(2, 2, 2);
        double avg = 2;
        Assert.assertEquals(avg, calc.getAvg(), 0.1);
    }
    /**Tests getAvg*/
    @Test
    public void testAvg3() {

        Calculator calc = new Calculator(-1, 1, 3);
        double avg = 1;
        Assert.assertEquals(avg, calc.getAvg(), 0.1);
    }
    /**Tests areAllPositive*/
    @Test
    public void testAllPositive1() {

        Calculator calc = new Calculator(1, 2, 3);
        boolean isPositive = true;
        Assert.assertEquals(isPositive, calc.areAllPositive());
    }
    /**Tests areAllPositive*/
    @Test
    public void testAllPositive2() {

        Calculator calc = new Calculator(1, 15, 3);
        boolean isPositive = true;
        Assert.assertEquals(isPositive, calc.areAllPositive());
    }
    /**Tests areAllPositive*/
    @Test
    public void testAllPositive3() {

        Calculator calc = new Calculator(-1, 2, 3);
        boolean isPositive = false;
        Assert.assertEquals(isPositive, calc.areAllPositive());
    }
    /**Tests isAEven*/
    @Test
    public void testisAEven1() {

        Calculator calc = new Calculator(4, 2, 3);
        boolean isAEven = true;
        Assert.assertEquals(isAEven, calc.isAEven());
    }
    /**Tests isAEven*/
    @Test
    public void testisAEven2() {

        Calculator calc = new Calculator(6, 2, 3);
        boolean isAEven = true;
        Assert.assertEquals(isAEven, calc.isAEven());
    }
    /**Tests isAEven*/
    @Test
    public void testisAEven3() {

        Calculator calc = new Calculator(3, 2, 3);
        boolean isAEven = false;
        Assert.assertEquals(isAEven, calc.isAEven());
    }
}


