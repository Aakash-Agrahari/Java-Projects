package com.company;

import java.util.Scanner;

class Bank {

    int accountNo;
    int pinCode;

    public void startMachine(){
        System.out.println("*****Welcome to the ATM center*****");
        Scanner an = new Scanner(System.in);
        System.out.print("Enter your account number: ");
        accountNo = an.nextInt();
        Scanner pc = new Scanner(System.in);
        System.out.print("Enter you pin code: ");
        pinCode = pc.nextInt();
    }

    boolean accountVerify (){


        if(accountNo==100000546 && pinCode==7639){
            System.out.println("Hello! You are welcome Mr.Ram Bahadur.");
            System.out.println("Your current balance is Rs.34,65,234");
        }
        else if(accountNo==200000674 && pinCode==8923){
            System.out.println("Hello! You are welcome Mr.Shyam Mohan.");
            System.out.println("Your current balance is Rs.82,423");
        }
        else if(accountNo==300000317 && pinCode==9145){
            System.out.println("Hello! You are welcome Mr.Raju Rama.");
            System.out.println("Your current balance is Rs.78,65,235");
        }
        else if(accountNo==400000123 && pinCode==5145){
            System.out.println("Hello! You are welcome Mr.Ven Mahesh");
            System.out.println("Your balance is Rs.54,673");
        }
        else{
            System.out.println("You have entered invalid credentials. Please enter valid credentials!");
        }
        return false;
    }

}

public class ATM_Machine {
    public static void main(String[] args) {
        Bank bk = new Bank();
        bk.startMachine();
        bk.accountVerify();
    }
}
