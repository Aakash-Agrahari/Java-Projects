package com.company;
/*No need to make 'Thread' class as 'Thread' itself is a keyword here. If Thread class is made then 'start'
  keyword will not work for 'run' keyword.
 */

// This is the program to run 'Welcome' and 'Good Morning' continuously.

class Thread1 extends Thread{
    public void run(){                    // 'run' is a keyword here which is printed using keyword 'start'.
        while (true){                     // when 'while loop' is 'true' then program run infinitely.
            System.out.println("Welcome");
        }
    }

    // To show Thread.sleep function in the Java Program

    /*public void run(){
        try{
            Thread.sleep(200); // Thread.sleep is a function to delay execution of program up to given time.
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Welcome");
    }
     */

}

class Thread2 extends Thread{
    public void run(){
        while (true){
            System.out.println("Good Morning");
        }
    }
}


public class threadingJava {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        th1.start();                        // 'start' is used to print content of 'run'.
        Thread2 th2 = new Thread2();
        th2.start();
    }
}
