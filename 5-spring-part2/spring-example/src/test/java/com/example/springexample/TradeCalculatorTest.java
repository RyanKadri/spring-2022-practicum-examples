package com.example.springexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TradeCalculatorTest {

    @Test
    void calculatesCorrectSum() {
        FakeProfileFetcher fetcher = new FakeProfileFetcher(List.of(
            new StockPosition("ABC", 123, 2)
        ));
        TradeCalculator calculator = new TradeCalculator(fetcher);
        double result = calculator.calculateTrade("123");
        Assertions.assertEquals(result, 246);
    }

    @Test
    void handlesNoPositions() {
        FakeProfileFetcher fetcher = new FakeProfileFetcher(List.of(
        ));
        TradeCalculator calculator = new TradeCalculator(fetcher);
        double result = calculator.calculateTrade("123");
        Assertions.assertEquals(result, 0);
    }
}