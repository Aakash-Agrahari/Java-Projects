package com.company;
import java.util.*;

class Game{
    public int inputNumber;            //Need to make it for boolean isCorrectNumber
    public int randomNumber;          //Need to make it for boolean isCorrectNumber
    public int noOfGuesses = 0;      //Need to make in order to start the no of guesses.

    public int getNoOfGuesses(){    //Getters and Setters for getting no of guesses we made.
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }

    Game() {              //Making constructor for generating random number.
        Random rand = new Random();
        this.randomNumber = rand.nextInt(100); // Here must be this.randomNumber so that random number will generate.
    }

    public void takeUserInput () { //It is made in order to take input from the user.
        Scanner takingInput = new Scanner(System.in);
        System.out.println("\nGuess the number between 1 to 100:");
        inputNumber = takingInput.nextInt();
    }


    boolean isCorrectNumber () {
        noOfGuesses++; //Need to do this so that no. of guesses increases.
        if (inputNumber == randomNumber) {
            System.out.format("Yes, you are right! The number was %d\n. You guessed it in %d attempt/s.", randomNumber, noOfGuesses);
        }
        else if (inputNumber > randomNumber) {
            System.out.println("Too High...........");
        }
        else if (inputNumber < randomNumber) {
            System.out.println("Too Low...........");
        }
        return false; //when using boolean there must be 'return' and there should be 'false' in this case.
    }
}

public class Guess_The_Number_Game {
    public static void main(String[] args) {
        Game Play = new Game();
        boolean b = false;   // Here should be initializing from false as per this loop.
        while(!b){          // Here we are using this loop so that program runs until we guessed it correct.
            Play.takeUserInput();
            b = Play.isCorrectNumber();

        }
    }
}
