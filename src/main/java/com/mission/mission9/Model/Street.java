package com.mission.mission9.Model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Street {
    String streetName;

    public Street(){
        System.out.println("filed injection object");

    }

    public String getStreetName() {
        return streetName;
    }

    @Value("jalan puchong")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "Street{" +
                "streetName='" + streetName + '\'' +
                '}';
    }
}
