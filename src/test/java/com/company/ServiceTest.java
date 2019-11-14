package com.company;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceTest {
    private static Service service;
    private static final Logger logger = LoggerFactory.getLogger(ServiceTest.class);

    @BeforeClass
    public static void init() {
        service = new ServiceImpl();
    }

    @Test
    public void firstMethod() {
        int a = 5;
        int b = 6;

        logger.info("Tests run: firstMethod - 1 - " + (a + b == service.firstMethod(a, b)));
        Assert.assertEquals(a + b, service.firstMethod(a, b));
    }

    @Test
    public void secondMethod() {
        int a = 5;
        int b = 6;

        logger.info("Tests run: secondMethod - 1 - " + (a - b == service.secondMethod(a, b)));
        Assert.assertEquals(a - b, service.secondMethod(a, b));
    }

    @Test
    public void thirdMethod() {
        int a = 5;
        int b = 6;

        logger.info("Tests run: thirdMethod - 1 - " + (a * b == service.thirdMethod(a, b)));
        Assert.assertEquals(a * b, service.thirdMethod(a, b));
    }

    @Test
    public void fourthMethod() {
        int a = 5;
        int b = 6;

        logger.info("Tests run: fourthMethod - 1 - " + (a / b == service.fourthMethod(a, b)));
        Assert.assertEquals(a / b, service.fourthMethod(a, b));
    }
}
