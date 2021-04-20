package com.mohsinkd786.service;

public class Addition implements Operation {
    @Override
    public float operate(int i, int j) {
        return i + j;
    }
}
