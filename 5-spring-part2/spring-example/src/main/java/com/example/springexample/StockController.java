package com.example.springexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    private final TradeCalculator calculator;

    @Autowired
    public StockController(TradeCalculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/trades/{userId}")
    public double calculateTrades(@PathVariable String userId) {
        return this.calculator.calculateTrade(userId);
    }
}
