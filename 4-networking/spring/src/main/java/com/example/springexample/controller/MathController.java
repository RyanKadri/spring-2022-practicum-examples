package com.example.springexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/add/{first}/{second}")
    public MathResponse doAddition(@PathVariable Double first, @PathVariable Double second){
        return new MathResponse(first + second);
    }
}

record MathResponse(Double result) {}
