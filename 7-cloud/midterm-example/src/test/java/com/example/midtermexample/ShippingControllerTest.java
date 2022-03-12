package com.example.midtermexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShippingControllerTest {

    @Test
    void getShippingDetails() {
        ShippingController controller = new ShippingController();
        var result = controller.getShippingDetails(49, 10, 10, 10);
        assertEquals("Envelope", result.getShippingType());
    }
}