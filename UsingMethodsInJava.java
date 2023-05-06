package com.company;

public class UsingMethodsInJava {
    /* 1. static void table(int n){
        for(int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
    }
     */


    /* 2. public static int AddingNumber(int a, int b){
        return a + b;

    }
     */


      /* 3. static float average(float x, float y, float z, float m, float l){
          float avg = (x + y + z + m + l)/5;
          return avg;
      }
       */

       /* 4. static void pattern(int n){
           for(int i=0; i<n; i++ ){
               for(int j=0; j<=i; j++){
                   System.out.print("*");
               }
               System.out.println();
           }
       }
        */

    /* 5. static void rev_pattern(int n){
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
     */

    /* 6. static int Sum_Recursion(int n){
        if (n==1){
            return 1;
        }
        return n + Sum_Recursion(n-1);
    }
     */

    /* 7. static int factorial_Rec(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n * factorial_Rec(n-1);
    }
     */

    /* 8. static float Celsius_to_Fahrenheit(float n){
        if(n == -40){
            return -40;
        }
        return (n * 9/5) + 32;
    }
     */

    // fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55........
      /* 9. static int fibonacci(int n){
        if(n==1 || n==2){
            return n-1; // n-1 because 1-1 return 0 then 2-1 return 1.
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
       */



    public static void main(String[] args) {
        // 1. table(10);

        // 2. System.out.println("The sum of these two numbers is: " + AddingNumber(4,5));

        // 3. System.out.println("The average of these marks is: " + average(96,86.5f,78.5f,76,98));
        //System.out.println("The average of these marks is: " + average(56,54, 76,75.66f, 56.78f));

        // 4. pattern(5);

        // 5. rev_pattern(5);

        // 6. System.out.println(Sum_Recursion(7));

        // 7. System.out.println(factorial_Rec(5));

        // 8. System.out.println(Celsius_to_Fahrenheit(37));

        // 9. System.out.println(fibonacci(11));

      }
}


