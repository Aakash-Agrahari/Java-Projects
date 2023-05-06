package com.company;

abstract class Person{
    abstract void eat();
}

public class testAnonymousInner {
    public static void main(String[] args) {
        Person p = new Person(){
            public void eat(){
                System.out.println("He is eating.....");
            }
        };
        p.eat();
    }
}
