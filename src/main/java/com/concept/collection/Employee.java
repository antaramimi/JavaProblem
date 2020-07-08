package com.concept.collection;

public class Employee {
    String name;
    int age;
    String deparment;

    Employee(String name, int age, String deparment) {
        this.name = name;
        this.age = age;
        this.deparment = deparment;
    }

    @Override
    public String toString() {
        return name+" "+age+" "+deparment;
    }
}