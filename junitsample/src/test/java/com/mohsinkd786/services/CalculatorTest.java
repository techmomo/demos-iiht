package com.mohsinkd786.services;

import static org.junit.jupiter.api.Assertions.*; // using static imports instead

import org.junit.jupiter.api.*;

public class CalculatorTest {

    CalculatorService service;
    int i =10;
    int j = 2;

    @BeforeAll
    public static void init(){
        System.out.println("Before All");
    }

    @BeforeEach
    public void setup(){
        service = new CalculatorService();
        System.out.println("Before Each");
    }

    @AfterEach
    public void tearDown(){
        service = null;
        System.out.println("After Each");
    }

    @Test
    @DisplayName("Should return the correct SUM for numbers")
    public void testAddition(){
        // we want to test calc service add method
        service.setI(i);
        service.setJ(j);

        // assert 1
        int actual = service.add();
        int expected = i + j;

        // assert 2
        service.setI(20);
        service.setJ(2);

        int actual1 = service.add();
        int expected1 = 20 + 2;

        assertEquals(expected,actual);
        assertEquals(expected1,actual1);

    }

    @Test
    @DisplayName("Should return the correct DIFF for numbers")
    public void testSubtraction(){
        // we want to test calc service diff method
        //CalculatorService service = new CalculatorService(i,j);
        service.setI(i);
        service.setJ(j);
        int actual = service.sub();
        int expected = i - j;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Should throw an Arithmetic Exception for Division by Zero")
    public void testDivisionByZero(){
        final CalculatorService service1 = new CalculatorService();
        service1.setI(i);
        service1.setJ(0);
        assertThrows(ArithmeticException.class,()-> service1.div());
    }

    @Test
    @DisplayName("Should return the correct DIV for numbers")
    public void testDivision(){
        service.setI(i);
        service.setJ(j);

        int actual = service.div();
        int expected = i / j;
        assertEquals(expected,actual);
    }
}
