package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class guests {
    static HashMap<String,Guest> listOfguests ;
    Scanner input= new Scanner(System.in);

    public guests() {
        listOfguests = new HashMap<>();
    }

    Guest add_guest(String id){
        if(listOfguests.containsKey(id)){
            Guest g = listOfguests.get(id);
            g.increment_number();
            listOfguests.put(id, g);
        }
        else{
            System.out.println("add your name");
            Guest guest = new Guest(input.nextLine(),id);
            listOfguests.put(id, guest);
        }
        return listOfguests.get(id);
    }

    public HashMap<String,Guest> get_guests() {
        return listOfguests;
    }
}
