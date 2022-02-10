package com.example.springexample;

import java.util.List;

public class FakeProfileFetcher implements ProfileFetcher {

    private final List<StockPosition> hardcodedPositions;

    public FakeProfileFetcher(List<StockPosition> hardcodedPositions) {
        this.hardcodedPositions = hardcodedPositions;
    }

    @Override
    public List<StockPosition> fetchProfile(String userId) {
        return this.hardcodedPositions;
    }
}
