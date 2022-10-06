package com.company;
import java.util.*;
import java.util.Calendar;


class print{
    static void print(){
        System.out.println("what do you want");
        System.out.println("""
                choose number of selected option :
                 1 - Occupy room\s
                 2-  release room\s
                 3-  search room by number\s
                 4-  available_rooms by dates\s
                 5-  recorded_guests\s
                 6 - print_receipt\s
                 7 - exit\s""");
    }
}

class Admin{
    static void admin(){
        Scanner input = new Scanner(System.in);
        //set types of packages
        System.out.println("enter price for All_inclusive");
        All_inclusive.setPak_cost(input.nextFloat());
        System.out.println("enter price for Half_board");
        Half_board.setPak_cost(input.nextFloat());
        System.out.println("enter price for Breakfast");
        Breakfast.setPak_cost(input.nextFloat());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //singleton hotel
        Hotel hotel;
        // refers to the only object of hotel
        hotel = Hotel.getInstance();

        System.out.println("enter number of rooms");

        hotel.init(input.nextInt());
        Admin.admin();

        Receptionist receptionist = new Receptionist();

        String choose;

        input.nextLine();
        while (true){
            print.print();
            choose = input.nextLine();
            if(Objects.equals(choose, "1")){
                System.out.println("enter no_of_room you want");
                int no_room = input.nextInt();
                System.out.println("enter start date you want in year month day in numbers");
                Date s = new Date(input.nextInt(),input.nextInt(),input.nextInt());
                System.out.println("enter end date you want in year month day in numbers");
                Date e = new Date(input.nextInt(),input.nextInt(),input.nextInt());
                input.nextLine();
                System.out.println("enter package type you want");
                receptionist.Occupy(no_room,s,e,input.nextLine());
                System.out.println("Occupied done");
          }

            else if(Objects.equals(choose, "2")){
                System.out.println("enter no_of_room you want");
                int no_room = input.nextInt();
                System.out.println("enter start date you want in year month day in numbers");
                Date s = new Date(input.nextInt(),input.nextInt(),input.nextInt());
                System.out.println("enter end date you want in year month day in numbers");
                Date e = new Date(input.nextInt(),input.nextInt(),input.nextInt());
                input.nextLine();
                receptionist.release(no_room,s,e);
            }
            else if(Objects.equals(choose, "3")){
                System.out.println("enter no_of_room you want");
                int no_room = input.nextInt();
                input.nextLine();
                receptionist.room_details(no_room);
            }
            else if(Objects.equals(choose, "4")){
                System.out.println("enter start date you want to search in year month day in numbers");
                Date s = new Date(input.nextInt(),input.nextInt(),input.nextInt());
                System.out.println("enter end date you want to search in year month day in numbers");
                Date e = new Date(input.nextInt(),input.nextInt(),input.nextInt());
                input.nextLine();
                receptionist.available_rooms(s,e);
            }
            else if(Objects.equals(choose, "5")){
                receptionist.recorded_guests();
            }
            else if(Objects.equals(choose, "6")){
                System.out.println("enter no_of_room you want to  print receipt");
                int no_room = input.nextInt();
                System.out.println("enter start date you want in year month day in numbers");
                Date s = new Date(input.nextInt(),input.nextInt(),input.nextInt());
                System.out.println("enter end date you want in year month day in numbers");
                Date e = new Date(input.nextInt(),input.nextInt(),input.nextInt());
                input.nextLine();
                receptionist.print_receipt(no_room, s, e);
            }
            else {
                break;
            }
        }
}
}