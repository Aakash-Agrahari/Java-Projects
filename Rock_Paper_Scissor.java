package com.company;
import java.util.*;
// 0 for Rock
// 1 for Paper
// 2 for Scissor

        // Code for errorless Rock-Paper-Scissor Game.
public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        try {
            System.out.println("*****Welcome to the game*****");
            Scanner Gaming = new Scanner(System.in);
            System.out.println("Enter 0 for Rock, 1 for Paper and 2 for Scissor:");
            int User = Gaming.nextInt();

            Random randomInput = new Random();
            int ComputerInput = randomInput.nextInt(3); // Here must be '3' so that it chooses no. from 0 to 2.

            if (User >= 3) {
                System.out.println("Entered number is invalid. You can only enter number from 0 to 2.");
                System.exit(0); // It is used to exit from the program in if statement.
            }

            if (User == ComputerInput) {
                System.out.println("Draw!");
            }
            else if (User == 0 && ComputerInput == 1 || User == 0 && ComputerInput == 2 || User == 2 && ComputerInput == 1) {
                System.out.println("Congratulations, You won the game!");
            } else {
                System.out.println("Computer Wins!");
            }

            System.out.println("Computer has chosen " + ComputerInput);
            if (ComputerInput == 0) {
                System.out.println("Rock");
            }
            if (ComputerInput == 1) {
                System.out.println("Paper");
            }
            if (ComputerInput == 2) {
                System.out.println("Scissor");
            }
        }

        catch(Exception e){
            //System.out.println(e);
            System.out.println("Please input legal value as asked in the game.");
        }




    }
}
