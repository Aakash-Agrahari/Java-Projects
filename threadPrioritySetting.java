package com.company;

// Program to demonstrate the use to 'setPriority' and 'getPriority'.

class Thread3 extends Thread{
    public void run(){
        System.out.println("Hello");
    }
}

class Thread4 extends Thread{
    public void run(){
        System.out.println("Good Morning");
    }
        }

public class threadPrioritySetting {
    public static void main(String[] args) {
        Thread3 th3 = new Thread3();
        Thread4 th4 = new Thread4();
        th3.start();
        th4.start();
        th3.setPriority(5);
        th4.setPriority(1);

        System.out.println(th3.getPriority());
        System.out.println(th4.getPriority());
        System.out.println(th4.getState());
        System.out.println(Thread.currentThread());
    }
}
