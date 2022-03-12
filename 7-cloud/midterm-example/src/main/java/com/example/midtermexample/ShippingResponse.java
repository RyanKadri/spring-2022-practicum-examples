package com.example.midtermexample;

public class ShippingResponse {

    private final String shippingType;
    private final Double price;

    public ShippingResponse(String shippingType, Double price) {
        this.shippingType = shippingType;
        this.price = price;
    }

    public String getShippingType() {
        return shippingType;
    }

    public Double getPrice() {
        return price;
    }
}
