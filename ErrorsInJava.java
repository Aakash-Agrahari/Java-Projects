package com.company;
import java.util.*;

// This is the program where you try up to 5 times and if it exceeds then it shows error.

public class ErrorsInJava {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 45;
        marks[1] = 67;
        marks[2] = 64;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        boolean flag = true;
        while (flag & i<5){
            try{
                System.out.println("Enter the value of index:");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is:" + marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
        if (i>5){
            System.out.println("Error");
        }
        }
    }
}
