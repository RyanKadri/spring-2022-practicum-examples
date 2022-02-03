package com.example.springexample;

public class Person {

    private Integer id;
    private final String name;
    private final int age;
    private final boolean professor;

    public Person(String name, int age, boolean isProfessor) {
        this.name = name;
        this.age = age;
        this.professor = isProfessor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isProfessor() {
        return professor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
