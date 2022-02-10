package com.example.springexample;

public class StockPosition {

    private final String ticker;
    private final double price;
    private final double amount;

    public StockPosition(String ticker, double price, double amount) {
        this.ticker = ticker;
        this.price = price;
        this.amount = amount;
    }

    public String getTicker() {
        return ticker;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }
}
