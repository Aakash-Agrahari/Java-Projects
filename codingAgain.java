package com.company;

import java.util.Scanner;

class abc {
    /*public static void swapValueUsingThirdVariable(int m, int n){  //swapping value using third variable
        int temp = m;
        m = n;
        n = temp;
        System.out.println("Reversed value of m is "+m + " and Reversed value of n is "+n);

    }
    */


    /*public static String add_Binary(String x, String y){
         String res = ""; //to initialize result
         int d = 0; //to initialize digit sum
         int k = x.length() - 1, l = y.length() -1; // Transversing both the strings starting from the last character
         while(k>=0 || l>=0 || d==1){
             d+=((k>=0) ? x.charAt(k) - '0' : 0);//Computing the sum of last digits and the carry
             d+=((l>=0) ? y.charAt(l) - '0' : 0);
             res = (char) (d % 2 + '0') +res; //when the current digit's sum is either 1 or 3 then add 1 to the result
             d /= 2;     //Computing carry
             k--;//moving to next digit
             l--;//moving to last digit
         }
         return res;
     }
      */


    /*int year;
    public void isLeapYear(){
            Scanner ac = new Scanner(System.in);
            System.out.println("Enter the year to check whether it is leap year or not: ");
            year = ac.nextInt();
        }

        boolean checkLeapYear(){
            if (year % 4 == 0 ){                               //(year % 100 == 0)- For Century Year
                System.out.println("This is a leap year.");    //(year % 400 == 0)- For Century Leap Year
            }
            else{
                System.out.println("This is not leap year.");
            }
            return false;
        }
        */

    int age;
    public void takingAge(){
        Scanner ac = new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        age = ac.nextInt();
    }

    public void checkingEligibility(){
        if(age<18){
            System.out.println("You are not eligible to vote.");
        }

        else if(age>=18 && age<=124){  //This tells that age must be 18 or more but not greater than 125 or more.
            System.out.println("You are eligible to vote.");
        }
        else if(age>=125){
            System.out.println("This age group is not valid.");
        }


    }
}
public class codingAgain {
    public static void main(String[] args){
        abc a1 = new abc();
        //a1.swapValueUsingThirdVariable(3,5); //swapped value will be presented
        //String x = "011011" , y = "1010111";
        //System.out.println(abc.add_Binary(x,y));
        //a1.isLeapYear();
        //a1.checkLeapYear();
        a1.takingAge();
        a1.checkingEligibility();

    }
}
