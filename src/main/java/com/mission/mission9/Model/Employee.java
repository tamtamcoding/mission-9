package com.mission.mission9.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    String name;
    @Autowired
    Street street;

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public Employee() {
        System.out.println("singleton one object created");
    }

    public String getName() {
        return name;
    }

    @Value("Raju")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", street=" + street +
                '}';
    }
}
