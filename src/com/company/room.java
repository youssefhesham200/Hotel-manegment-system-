package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

abstract class room
{
    private int number;
    float cost;
    private String view;
    String description ;
    ArrayList<reservation> reservations = new ArrayList<>();

    public room(){}

    public room(int number, String view, float cost)
    {
        this.number = number;
        this.view = view;
        this.cost = cost;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    abstract float getCost();

     void setCost(float cost){
         this.cost = cost;
     }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    String getDescription(){
       return description;
     }

}

class Suite extends room{

    public Suite(int number, String view, float cost) {
        super(number, view, cost);
        description = "the type of room is Suite ";
    }

    @Override
    float getCost() {
        return cost;
    }


}

class King extends room{

    public King(int number, String view, float cost) {
        super(number, view, cost);
        description = "the type of room is King ";
    }

    @Override
    float getCost() {
        return cost;
    }

}


class Twin_bed extends room{

    public Twin_bed(int number,  String view, float cost) {
        super(number,  view, cost);
        description = "the type of room is Twin_bed ";
    }

    @Override
    float getCost() {
        return cost;
    }
}


class Single extends room{

    public Single(int number, String view, float cost) {
        super(number,  view, cost);
        description = "the type of room is Single ";
    }

    @Override
    float getCost() {
        return cost;
    }

}
