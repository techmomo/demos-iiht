package com.mohsinkd786.services;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        calculatorService.setI(10);
        calculatorService.setJ(2);
        int result = calculatorService.add();
        System.out.println("SUM IS "+result);
        result =calculatorService.sub();
        System.out.println("DIFF IS "+result);
        result = calculatorService.mul();
        System.out.println("MUL IS "+result);
        result = calculatorService.div();
        System.out.println("DIV IS "+result);
    }
}
