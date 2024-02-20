package com.mission.mission9.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Students {

    String fullName;
    @Autowired
    Street street;

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public  Students(){
        System.out.println("scope prototype object created");
    }

    public String getFullName() {
        return fullName;
    }

    @Value("sarfaraz")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Students{" +
                "fullName='" + fullName + '\'' +
                ", street=" + street +
                '}';
    }
}
