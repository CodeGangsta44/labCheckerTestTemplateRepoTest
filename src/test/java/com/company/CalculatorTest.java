package com.company;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
    private static Calculator calculator;

    @BeforeClass
    public static void init() {
        calculator = new CalculatorImpl();
    }

    @Test
    public void sum() {
        int a = 5;
        int b = 6;

        Assert.assertEquals(a + b, calculator.add(a, b));
    }

    @Test
    public void diff() {
        int a = 5;
        int b = 6;

        Assert.assertEquals(a - b, calculator.diff(a, b));
    }

    @Test
    public void sum() {
        int a = 5;
        int b = 6;

        Assert.assertEquals(a * b, calculator.multi(a, b));
    }

    @Test
    public void sum() {
        int a = 5;
        int b = 6;

        Assert.assertEquals(a / b, calculator.div(a, b));
    }
}
