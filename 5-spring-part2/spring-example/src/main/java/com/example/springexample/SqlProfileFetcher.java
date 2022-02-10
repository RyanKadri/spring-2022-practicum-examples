package com.example.springexample;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SqlProfileFetcher implements ProfileFetcher {

    public List<StockPosition> fetchProfile(String userId) {
        // Pretend SQL
        return List.of(
            new StockPosition("A", 100, 3),
            new StockPosition("TSLA", 500, 3)
        );
    }
}
