package com.company;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class reservation {
    guests guests = new guests();
    Scanner input= new Scanner(System.in);
    Date start;
    Date end;
    final ArrayList<Guest> list_of_guests = new ArrayList<>();
    room room_package;

    void create_reserve(String package_type, Date start, Date end, room room){
        //set_package to room
        if(package_type.equalsIgnoreCase("All inclusive")){
            this.room_package = new All_inclusive(room);
        }
        else if(package_type.equalsIgnoreCase("Half board")){
            this.room_package = new Half_board(room);
        }
        else {
            this.room_package = new Breakfast(room);
        }

        // set date range
        this.start = start;
        this.end = end;

        //set guests
        System.out.println("enter number of guests");
        int num = input.nextInt();
        for(int i=0; i<num; i++){
            System.out.println("add your national_identification_number");
            String national_identification_number = input.next();
            Guest g = guests.add_guest(national_identification_number);
            list_of_guests.add(g);
        }
    }

    //overriding the toString() method
    public String toString(){
        return "\nroom no :" + room_package.getNumber() + 1 +"\n"+ room_package.getDescription()  + "\nstart date : " + start + "\n end date : " + end +
                "\n total cost " + room_package.getCost() + "\n";
    }

}
