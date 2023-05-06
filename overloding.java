package com.company;

//this is showing method overloading.

public class overloding {
    private static void display(int a){
        System.out.println("Argument1 is: "+a);

    }
    private static void display(int a, int b){
        System.out.println("Argument1 is: "+a+" and Argument2 is: "+b);
    }
    public static void main(String[] args){

        display(1);
        display(1,4);
    }
}
