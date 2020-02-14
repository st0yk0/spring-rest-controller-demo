package com.spring.rest.demo.impl;

import com.spring.rest.demo.services.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double extract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return (double)(a/b);
    }
}
