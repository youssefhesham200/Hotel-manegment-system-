package com.company;
import java.util.ArrayList;
import java.util.*;


public class rooms {
    private final ArrayList<room> listOfrooms ;
    Scanner input= new Scanner(System.in);

    public rooms() {
        listOfrooms = new ArrayList<>();
    }

    public ArrayList<room> getrooms(int numrooms){
        room room;
        for (int i = 1; i <= numrooms; i++) {
            System.out.println("enter type of room");
            String type = input.next();
            System.out.println("enter view of room and cost of room");
            if(type.equalsIgnoreCase("Suite")){
                 room = new Suite(i, input.next(), input.nextFloat());
            }
            else if(type.equalsIgnoreCase("King")){
                 room = new King(i, input.next(), input.nextFloat());
            }
            else if(type.equalsIgnoreCase("Twin_bed")){
                room = new Twin_bed(i, input.next(), input.nextFloat());
            }
            else{
                room = new Single(i, input.next(), input.nextFloat());
            }
            listOfrooms.add(room);
        }

        return listOfrooms;
    }
}
