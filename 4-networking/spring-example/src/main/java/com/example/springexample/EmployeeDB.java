package com.example.springexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeDB {

    private Integer lastId = 1;
    private final List<Person> personDb = new ArrayList<>();

    @PostMapping("/employees")
    public Person storeEmployee(@RequestBody Person person) {
        person.setId(lastId);
        lastId ++;
        this.personDb.add(person);
        return person;
    }

    @GetMapping("/employees/{employeeId}")
    public Person fetchEmployee(@PathVariable Integer employeeId) {
        for(Person person: this.personDb) {
            if(person.getId().equals(employeeId)) {
                return person;
            }
        }
        return null;
    }
}
