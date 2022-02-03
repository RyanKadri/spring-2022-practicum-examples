package com.example.springexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable(value = "name") String name) {
        return "Hello " + name;
    }

    @GetMapping("/add")
    public int add(@RequestParam(name = "first") Integer first, @RequestParam(name = "second") Integer second) {
        return first + second;
    }

}
