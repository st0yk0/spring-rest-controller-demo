package com.spring.rest.demo.controllers;

import com.spring.rest.demo.impl.CalculatorServiceImpl;
import com.spring.rest.demo.services.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CalculatorController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/add")
    public double addService(@RequestParam(value = "number1") double a, @RequestParam(value = "number2") double b){
        return new CalculatorServiceImpl().add(a,b);
    }
    @GetMapping("/extract")
    public double extractService(@RequestParam(value = "number1") double a, @RequestParam(value = "number2") double b){
        return new CalculatorServiceImpl().extract(a,b);
    }
    @GetMapping("/multiply")
    public double calculateService(@RequestParam(value = "number1") double a, @RequestParam(value = "number2") double b){
        return new CalculatorServiceImpl().multiply(a,b);
    }
    @GetMapping("/divide")
    public double divideService(@RequestParam(value = "number1") double a, @RequestParam(value = "number2") double b){
        return new CalculatorServiceImpl().divide(a,b);
    }
}
