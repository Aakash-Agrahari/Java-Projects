package com.company;

abstract class bank{
    bank(){
        System.out.println("solving it.....");
    }
    abstract void accountnumber();


    //abstract void accountnumber();
        }
class sbi extends bank{
    sbi(){
        System.out.println("something.....");
    }
    public void accountnumber(){
        System.out.println("printing it....");
    }
}

public class abstractModule {
    public static void main(String[] args){
        //sbi s = new sbi();
        bank bk = new sbi();
    }
}
