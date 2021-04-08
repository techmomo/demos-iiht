package com.mohsinkd786.services;

public class CalculatorService {

    private int i;
    private int j;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }


    public int add(){
        return i + j;
    }

    public int sub(){
        return i - j;
    }

    public int mul(){
        return i * j;
    }

    public int div(){
        return i / j;
    }
}
