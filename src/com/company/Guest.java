package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Guest {
    private String name;
    private String national_identification_number;
    private int  number_of_visits;

    Guest(String name, String national_identification_number){
        this.name = name;
        this.national_identification_number = national_identification_number;
        this.number_of_visits = 0;
    }

    public String getName() {
        return name;
    }

    public String getNational_identification_number() {
        return national_identification_number;
    }

    public int getNumber_of_visits() {
        return number_of_visits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNational_identification_number(String national_identification_number) {
        this.national_identification_number = national_identification_number;
    }

    public void increment_number() {
        this.number_of_visits += 1;
    }
}

