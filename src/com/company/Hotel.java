package com.company;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Hotel {
    private static Hotel hotel;
    int no_of_rooms;
    static ArrayList<room> rooms1;
    rooms rooms = new rooms();
    Scanner input = new Scanner(System.in);

    private Hotel(){}

    public static Hotel getInstance(){

        // create object if it's not already created
        if(hotel == null) {
            hotel = new Hotel();
        }

        // returns the singleton object
        return hotel;
    }


    void init(int num_rooms){
        rooms1 = new ArrayList<>();
        this.no_of_rooms  = num_rooms;
        rooms1 =  rooms.getrooms(num_rooms);
    }
}
