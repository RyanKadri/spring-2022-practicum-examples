package com.example.springexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TradeCalculator {

    private final ProfileFetcher fetcher;

    @Autowired
    public TradeCalculator(ProfileFetcher fetcher) {
        this.fetcher = fetcher;
    }

    public double calculateTrade(String userId) {
        var profile = fetcher.fetchProfile(userId);
        double amount = 0;
        for(StockPosition pos: profile) {
            amount += pos.getAmount() * pos.getPrice();
        }
        return amount;
    }
}
