package com.company;

import java.util.Date;

public class Receptionist {

    void Occupy(int no_of_room, Date start1, Date end1, String package_type){
        for(room room : Hotel.rooms1){
            if(room.getNumber() == no_of_room){
                boolean g = true;
                for(reservation r : room.reservations){
                    if((start1.equals(r.start) || start1.after(r.start)) && (r.end.after(end1) || r.end.equals(end1))){
                        g = false;
                        System.out.println("this date not available");
                        break;
                    }
                }

                if(g){
                    reservation s = new reservation();
                    s.create_reserve(package_type,start1, end1, room);
                    room.reservations.add(s);
                }
            }
        }
    }


    void release(int no_of_room, Date start1, Date end1){
        for(room f : Hotel.rooms1){
            if(f.getNumber() == no_of_room){
                boolean g = true;
                for(reservation r : f.reservations){
                    if(start1.equals(r.start) && r.end.equals(end1)){
                        f.reservations.remove(r);
                        System.out.println("room released");
                        break;
                    }
                }
            }
        }
    }

    void available_rooms(Date start1, Date end1){
        boolean d = true;
        for(room f : Hotel.rooms1){
            boolean g = true;
            for(reservation r : f.reservations){
                if((start1.equals(r.start) || start1.after(r.start)) && (r.end.after(end1) || r.end.equals(end1))){
                    g = false;
                    break;
                }
            }

            if(g){
                d = false;
                System.out.println("room number is " + f.getNumber() + "\n");
            }
        }
        if(d){
            System.out.println("no rooms is available\n");
        }
    }

    void room_details(int no_of_room){
        for(room f : Hotel.rooms1){
            if(f.getNumber() == no_of_room){
                System.out.println(
                        "\nnumber of room :" + f.getNumber() + " view :" + f.getView() + " cost :" + f.getCost() + "\n"
                );
            }
        }
    }

    void recorded_guests(){
        for(Guest g: guests.listOfguests.values()){
            System.out.println("\nname :" + g.getName() + " and id :" + g.getNational_identification_number() + "\n");
        }
    }

    void print_receipt(int no_of_room, Date start1, Date end1){
        for(room f : Hotel.rooms1){
            if(f.getNumber() == no_of_room){
                boolean g = true;
                for(reservation r : f.reservations){
                    if(start1.equals(r.start) && r.end.equals(end1)){
                        System.out.println(r);
                        break;
                    }
                }
            }
        }
    }

}
