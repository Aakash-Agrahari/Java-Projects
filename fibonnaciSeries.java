package com.company;

import java.util.Scanner;

class fibonnacci {
    int num;

    public void takingInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        num = sc.nextInt();
    }

    public void fibb(){
        int f1=0;
        int f2=1;
        int f;
        for(int i = 1; i<=num; i++){
            System.out.println(f1+"");
            f = f1 + f2;
            f1 = f2;
            f2 = f;
        }
        }
    }


public class fibonnaciSeries {
    public static void main(String[] args) {
        fibonnacci fb = new fibonnacci();
        fb.takingInput();
        fb.fibb();
    }
}
