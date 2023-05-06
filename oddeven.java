package com.company;

import java.util.Scanner;

class oddevencheck{
    int num;
    public void oec(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is even.");
        }
        else{
            System.out.println(num+" is odd.");
        }
    }
}

public class oddeven {
    public static void main(String[] args) {
        oddevencheck oc = new oddevencheck();
        oc.oec();
    }
}
