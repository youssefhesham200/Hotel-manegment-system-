package com.company;

import java.util.ArrayList;
import java.util.Scanner;

abstract class packaging extends room{
    public abstract String getDescription();
}

class All_inclusive extends packaging{
    private room room ;
    static float pak_cost;

    public static void setPak_cost(float pak_cost) {
        All_inclusive.pak_cost = pak_cost;
    }

    public All_inclusive(room room) {
        this.room = room;
    }

    @Override
    public String getDescription() {
        return room.getDescription() + " and package is All_inclusive";
    }

    @Override
    float getCost() {
        return pak_cost + room.getCost();
    }
}


class Half_board extends packaging{
    private room room;
    static float pak_cost;

    public Half_board(room room) {
        this.room = room;
    }

    public static void setPak_cost(float pak_cost) {
        Half_board.pak_cost = pak_cost;
    }

    @Override
    public String getDescription() {
        return room.getDescription() + " and package is Half_board";
    }

    @Override
    float getCost() {
        return pak_cost + room.getCost();
    }
}

class Breakfast extends packaging{
    private  room room;
    static float pak_cost;

    public Breakfast(room room) {
        this.room = room;
    }

    public static void setPak_cost(float pak_cost) {
        Breakfast.pak_cost = pak_cost;
    }

    @Override
    public String getDescription() {
        return room.getDescription() + " and package is Breakfast";
    }


    @Override
    float getCost() {
        return  pak_cost + room.getCost();
    }
}


