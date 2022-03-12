package com.example.midtermexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingController {

    @GetMapping("/shipping-info")
    public ShippingResponse getShippingDetails(@RequestParam double weight,
                                     @RequestParam double height,
                                     @RequestParam double width,
                                     @RequestParam double length) {
        if (height <= 10 && width <= 10 && length <= 10 && weight < 50) {
            return new ShippingResponse("Envelope", 0.50);
        } else if (height <= 10 && width <= 10 && length <= 10 && weight >= 50 && weight <= 500) {
            return new ShippingResponse("Small Boc", 3.5);
        } else {
            return new ShippingResponse("Large Box", height * width * length * 0.01 + weight *0.1);
        }
    }
}
