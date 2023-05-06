package com.company;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        // 1. Code for basic beginning!
        /*System.out.println("Hello World!");
        int sum,a,b;
        a = 6;
        b = 5;
        sum = a + b;

        if (a>5) {
            System.out.println("The sum of the number is:" + sum);
        }
          else {
            System.out.println("These numbers are not summable.");
        }
         */




        // 2. Exam Result Calculator which can handle any errors.
        /*
        double Physics = 0;
        double Chemistry = 0;
        double Mathematics = 0;
        double English = 0;
        double Nepali = 0;
        try {
            double Percentage;
            System.out.println("****You can calculate your marks by using below marks calculator:****");
            Scanner marks = new Scanner(System.in);
            System.out.println("Enter your marks in Physics:");
            Physics = marks.nextDouble();
            System.out.println("Enter your marks in Chemistry:");
            Chemistry = marks.nextDouble();
            System.out.println("Enter your marks in Mathematics:");
            Mathematics = marks.nextDouble();
            System.out.println("Enter your marks in English:");
            English = marks.nextDouble();
            System.out.println(" Enter your marks in Nepali:");
            Nepali = marks.nextDouble();
            if (Physics > 100 || Chemistry > 100 || Mathematics > 100 || English > 100 || Nepali > 100) {
                System.out.println("Numbers can't be greater than 100.");
            } else {
                Percentage = ((Physics + Chemistry + Mathematics + English + Nepali) / 500) * 100;
                System.out.println(" Total percentage of your given marks is:" + Percentage);
            }


        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
            System.out.println("Please input numbers not any alphabets.");
        }

         */

    // 3. Program to show various functions of String.
       /*
        String name = "Aakash";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim()); // Cuts space besides written string.
        System.out.println(name.substring(3)); // shows string up to 3rd index like from Aakash it shows ash.
        System.out.println(name.substring(2,5));
        System.out.println(name.replace('a','e')); //changes all 'a' into 'e' & its case sensitive.
        System.out.println(name.startsWith("Aak")); // Case Sensitive.
        System.out.println(name.endsWith("ash")); // Case Sensitive.
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf('h'));
        System.out.println(name.indexOf('s',6)); //shows -1 as 's' is not on 6th index.
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.lastIndexOf('a',2));
        System.out.println(name.equals("Aakash"));
        System.out.println(name.equalsIgnoreCase("aakash")); // ignore case sensitive.

        */
        
        // 4. switch case
        /*
        int WhatsYourAge;

        Scanner age  = new Scanner(System.in);
        System.out.println("Enter your age:");
        WhatsYourAge = age.nextInt();
        switch (WhatsYourAge) {
            case 18:
                System.out.println("You are now young enough to vote.");
                break;
            case 25:
                System.out.println("You are now youth");
                break;
            case 32:
                System.out.println("You are now adult");
                break;
            case 42:
                System.out.println("You are now getting old");
                break;
            case 53:
                System.out.println("You are now getting older");
                break;
            case 60:
                System.out.println("You are now old and ready for taking pension.");
                break;
            default:
                System.out.println("You are not of this planet.");

         }
             */


        
        // 5. Another way of switch case:
        /*
        String name;
        Scanner naming = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = naming.nextLine();
        switch (name){
            case "Aakash" -> System.out.println("He studies in btech Computer Science Engineering");
            case "Ram" -> System.out.println("He studies in btech CSE IOT");
            case "Sam" -> System.out.println("He studies in CSE AI");
            case "Sita" -> System.out.println("She studies in CSE data science.");
            default -> System.out.println("This person doesn't study any course.");

        }
          */
                         // Note: When the loop is true then it becomes infinite.
        // 6. While loop
        /*int a = 4;
        while (a>5);
        {
            System.out.println("Number is not used");
            a++;
        }

         */

        // 7. do while loop
        /*
        int b = 8;
        do{
            System.out.println("Number is accessible");
        }while(b>7);

         */

        // 8. for loop
        /*
        int i;
        for (i=1; i<=10; i+=2){
            System.out.println(i);
        }
         */



        // 9. Printing **** in decrementing pattern upto *
        /*int n=4;
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

         */

        // 10. Printing * in increasing order upto *****
        /*int m=5;
        for(int k=0; k<m; k++){
            for(int l=0; l<=k; l++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

         */

        // 11. Multiplication table
        /*
        int mul = 5;
        for(int i=1; i<=10; i++){ // i=1 is there to start program from i=1 and i<=10 to go up to i=10.
            System.out.printf("%d X %d = %d\n", mul, i, mul*i); // first %d=mul then X then %d=n and then mul*i.
        }

         */


        // 12. Multiplication table in reverse order
          /*
           int n=7;
           for(int j=10; j>=1; j--){ // Starting from j=10 it goes to j=1 as it is decrementing table
               System.out.printf("%d X %d = %d\n", n, j, n*j);
           }

           */

        // 13. Factorial of a number
        /*
        int n=5;
        int factorial=1;
        for(int i=1; i<=n; i++){
            factorial *= i; // means factorial = factorial * i
        }
        System.out.println(factorial);

         */

        // 14. To add a multiplication table of a number upto 10th
        /*
        int n=7;
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum += n*i;
        }
        System.out.println(sum);

         */

        // 15. Arrays
        /*
        int[] marks = new int[5];
        marks[0] = 54;
        marks[1] = 344;
        marks[2] = 66;
        marks[3] = 43;
        marks[4] = 87;
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        //System.out.println(marks[3]);
        //System.out.println(marks[4]);
        //System.out.println(marks.length); // Shows the length of the array.

        //for(int i =0; i<marks.length; i++){  // Another way to print the data of an array.
        //    System.out.println(marks[i]);
        //}

        for(int a:marks){ // One more way to print the data of an array.
            System.out.println(a);
        }

        int[] number;  // Another way of declaring an array
        number = new int[7];

        int[] rank = {12,31,45,21,43,31};  // One more way of declaring an array.
        //System.out.println(rank[3]);

         */

        // 16. 2-D Array
        /*
        int [][] flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 104;
        flats[1][1] = 105;
        flats[1][2] = 106;
        for(int i=0; i<flats.length; i++){  // this equals to row in our flats
            for(int j=0; j<flats[i].length; j++){ // this equals to column in our flats
                System.out.print(flats[i][j] + " "); // this flats[i][j] + " " to print numbers in gap.
            }
            System.out.println(); //to change line on console as row comes to end .
        }

         */


        // 17. Printing sum of any 5 numbers using Array
        /*
        int[] numbers= {23,43,65,32,65};
        int sum=0;
        for(int b:numbers){
            sum = sum + b;
        }
        System.out.println("The sum of the given array is: " + sum);

         */


        // 18. To check whether a number is present in the array or not
        /*
        int[] number = {543,54,2,32,453,23};
        int num=6576;
        boolean numberPresent=false;
        for(int c:number){
            if(num==c){
                numberPresent=true;
                break;
            }
        }
        if(numberPresent){
            System.out.println("The number is present in the array.");
        }
        else{
            System.out.println("The number is not present in the array.");
        }

         */


        // 19. To find whether the array is sorted or not
        /*
        int[] sort = {21,43,49,54,56,76,83};
        boolean isSorted = true;
        for(int i=0; i<sort.length-1; i++){ //sort.length-1 is here because we can't go on index 7 and further.
            if (sort[i] > sort[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("This array is sorted.");
        }
        else{
            System.out.println("The array is not sorted.");
        }

         */




    }
}
