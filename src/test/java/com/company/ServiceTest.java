package com.company;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ServiceTest {
    private static Service service;

    @BeforeClass
    public static void init() {
        service = new ServiceImpl();
    }

    @Test
    public void firstMethod() {
        int a = 5;
        int b = 6;

        Assert.assertEquals(a * b, service.firstMethod(a, b));
    }

    @Test
    public void secondMethod() {
        int a = 5;
        int b = 6;

        Assert.assertEquals(a - b, service.secondMethod(a, b));
    }

    @Test
    public void thirdMethod() {
        int a = 5;
        int b = 6;

        Assert.assertEquals(a + b, service.thirdMethod(a, b));
    }

    @Test
    public void fourthMethod() {
        int a = 5;
        int b = 6;

        Assert.assertEquals(a / b, service.fourthMethod(a, b));
    }
}
