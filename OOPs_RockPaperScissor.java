package com.company;
import java.util.*;
//0 means Rock
//1 means Paper
//2 means Scissor


class Game1{
    public int userInput;
    public int computerInput;

    public void userMakingInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper and 2 for Scissor: ");
        userInput = sc.nextInt();
    }

    Game1(){
        Random rand = new Random();
        computerInput = rand.nextInt(3);
    }


    boolean gamePlayingRule () {

        if(userInput>=3){
            System.out.println("Please input the number among 0,1 and 2.");
            System.exit(0);
        }

        if(userInput==computerInput){
            System.out.println("Game Draw!");
        }
        else if(userInput == 0 && computerInput == 1 || userInput == 0 && computerInput == 2 || userInput == 2 && computerInput == 1){
            System.out.println("Congratulations! You won the game.");
        }
        else{
            System.out.println("You lose the game!");
        }
    return false;
    }

    void showComputerInput(){
        System.out.println("Computer has chosen "+ computerInput);
        if(computerInput==0){
            System.out.println("Rock");
        }
        if(computerInput==1){
            System.out.println("Paper");
        }
        if(computerInput==2){
            System.out.println("Scissor");
        }
    }

}

public class OOPs_RockPaperScissor {
    public static void main(String[] args)  {
        Game1 playNow = new Game1();
        playNow.userMakingInput();
        playNow.gamePlayingRule();
        playNow.showComputerInput();

    }
}
