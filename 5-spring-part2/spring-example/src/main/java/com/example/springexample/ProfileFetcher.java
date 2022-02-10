package com.example.springexample;

import java.util.List;

public interface ProfileFetcher {
    List<StockPosition> fetchProfile(String userId);
}
