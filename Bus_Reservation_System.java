package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Bus{
    int enterService;
    int Bus1 = 50;
    int Bus2 = 50;
    int Bus3 = 50;
    int Bus4 = 50;
    int Bus5 = 50;
    int seat;
    String bus;
    String name;
    String date;
    int seat_Bus1;
    int seat_Bus2;
    int seat_Bus3;
    int seat_Bus4;
    int seat_Bus5;


    public void processForBooking(){
        System.out.println("*********Welcome to the Bus Reservation System of Sky Bus Services*********");
        System.out.println("Enter 1 for Checking details of bus and its services.");
        System.out.println("Enter 2 for Checking availability of buses and seats inside it.");
        System.out.println("Enter 3 for Booking the seat.");
        System.out.println("Enter 4 for Choosing your payment method.");
        System.out.println("Enter 5 for Existing from the system.");
    }

    public void enteringDetails(){
        Scanner es = new Scanner(System.in);
        System.out.print("Enter the number as per your required service: ");
        enterService = es.nextInt();
    }

    public void serviceProvider1(){
        if(enterService==1){
            File myFile = new File("servicees1.txt");
            try {
                Scanner mf = new Scanner(myFile);
                while(mf.hasNextLine()){
                    String line = mf.nextLine();
                    System.out.println(line);
                }
                mf.close();
            } catch (FileNotFoundException e) {
                System.out.println("Unable to process your request!");
                e.printStackTrace();
            }

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number as per your required service: ");
            enterService = sc.nextInt();
            if(enterService==5){
                System.out.println("Thank you for using our service!!");
                System.exit(0);
            }
        }
    }

    public void serviceProvider2(){

        if(enterService==2){
            System.out.println("Available no of seats on Bus1 is: " +Bus1);
            System.out.println("Available no of seats on Bus2 is: " +Bus2);
            System.out.println("Available no of seats on Bus3 is: " +Bus3);
            System.out.println("Available no of seats on Bus4 is: " +Bus4);
            System.out.println("Available no of seats on Bus5 is: " +Bus5);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number as per your required service: ");
        enterService = sc.nextInt();
        if(enterService==5){
            System.out.println("Thank you for using our service!!");
            System.exit(0);
        }


    }

    public void serviceProvider3(){
        if(enterService==3) {
            System.out.println("Thank you for believing in us. You can book your seat by providing necessary data below!");
            Scanner nm = new Scanner(System.in);
            System.out.println("Enter your name: ");
            name = nm.nextLine();
            Scanner ns = new Scanner(System.in);
            System.out.println("Enter your required number of seat/s: ");
            seat = ns.nextInt();
            Scanner dd = new Scanner(System.in);
            System.out.println("Enter your date of departure: ");
            date = dd.nextLine();
            Scanner bn = new Scanner(System.in);
            System.out.println("Enter your bus name: ");
            bus = bn.nextLine();
            seat_Bus1 = Bus1 - seat;
            seat_Bus2 = Bus2 - seat;
            seat_Bus3 = Bus3 - seat;
            seat_Bus4 = Bus4 - seat;
            seat_Bus5 = Bus5 - seat;

            switch (bus) {
                case "KathmanduS" -> {
                    System.out.println("You have booked Bus1 for seat/s " + seat);
                    System.out.println("The seat is booked in the name of " + name);
                    System.out.println("Date of departure is: "+date);
                    System.out.println("You can go for further payment process for the conformation.");
                    System.out.println("Left number of seat/s in this bus is: " + seat_Bus1);
                }
                case "KathmanduP" -> {
                    System.out.println("You have booked Bus2 for seat/s " + seat);
                    System.out.println("The seat is booked in the name of " + name);
                    System.out.println("Date of departure is: "+date);
                    System.out.println("You can go further for payment process for the conformation.");
                    System.out.println("Left number of seat/s in this bus is: " + seat_Bus2);
                }
                case "PokharaS" -> {
                    System.out.println("You have booked Bus3 for seat/s " + seat);
                    System.out.println("The seat is booked in the name of " + name);
                    System.out.println("Date of departure is: "+date);
                    System.out.println("You can go further for payment process for the conformation.");
                    System.out.println("Left number of seat/s in this bus is: " + seat_Bus3);
                }
                case "JanakpurP" -> {
                    System.out.println("You have booked Bus4 for seat/s " + seat);
                    System.out.println("The seat is booked in the name of " + name);
                    System.out.println("Date of departure is: "+date);
                    System.out.println("You can go further for payment process and seat conformation.");
                    System.out.println("Left number of seat/s in this bus is: " + seat_Bus4);
                }
                case "IllamS" -> {
                    System.out.println("You have booked Bus5 for seat/s ." +seat);
                    System.out.println("The seat is booked in the name of " + name);
                    System.out.println("Date of departure is: "+date);
                    System.out.println("You can go further for payment process for the conformation.");
                    System.out.println("Left number of seat/s in this bus is: " + seat_Bus5);
                }
                default -> System.out.println("Something went wrong. Please re-start your booking process.");
            }

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number as per your required service: ");
            enterService = sc.nextInt();
            if (enterService == 5) {
                System.out.println("Your booking process has been cancelled. Re-start the program to book you tickets.");
                System.exit(0);
            }
        }

    }

    public void serviceProvider4() {
        if(enterService==4){
            File myPrice = new File("ticketdetails.txt");
            try {
                Scanner mp = new Scanner(myPrice);
                while(mp.hasNextLine()){
                    String Pricing = mp.nextLine();
                    System.out.println(Pricing);
                }
                mp.close();
            } catch (FileNotFoundException e) {
                System.out.println("System seems to be down. Unable to process your request!");
                e.printStackTrace();
            }
            System.out.println("Name of the booked bus is: "+bus);
            System.out.println("Number of seat/s booked is: "+seat);

            switch (bus) {
                case "KathmanduS" -> System.out.println("The total price for your selected number of seat/s on this bus is: " + seat * 1050);
                case "KathmanduP" -> System.out.println("The total price for your selected number of seat/s on this bus is: " + seat * 1100);
                case "PokharaS" -> System.out.println("The total price for your selected number of seat/s on this bus is: " + seat * 1000);
                case "JanakpurP" -> System.out.println("The total price for your selected number of seat/s on this bus is: " + seat * 1350);
                case "IllamS" -> System.out.println("The total price for your selected number of seat/s on this bus is: " + seat * 1500);
                default -> System.out.println("You have not processed in correct manner. Please re-start the booking process.");
            }
        }
        System.out.println("Thank you for choosing our service. You must be here half an hour before your departure time.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 to exit from the system: ");
        enterService = sc.nextInt();
        if(enterService==5){
            System.out.println("*****Visit Again*****");
        }
    }
}




public class Bus_Reservation_System {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        b1.processForBooking();
        b1.enteringDetails();
        b1.serviceProvider1();
        b1.serviceProvider2();
        b1.serviceProvider3();
        b1.serviceProvider4();
    }
}
