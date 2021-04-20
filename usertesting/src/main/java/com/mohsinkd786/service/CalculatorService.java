package com.mohsinkd786.service;

public class CalculatorService {

    private Operation operation;

    public CalculatorService(Operation operation){
        this.operation = operation;
    }

    public float execute(int i,int j){
        return operation.operate(i,j);
    }
}
