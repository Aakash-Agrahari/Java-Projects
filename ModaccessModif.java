package com.company;
import java.util.Scanner;
class Student{
    int roll;
    protected int eng;
    protected int math;
}

class Result extends Student{
    private int total;
    private float per;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter English: ");
        eng = sc.nextInt();
        System.out.println("Enter Math: ");
        math = sc.nextInt();
    }

    public void calculate(){
        total = eng + math;
        per = (total/200.0f)*100;
    }

    void show(){
        System.out.println("Roll: "+roll);
        System.out.println("English: "+eng);
        System.out.println("Math: "+math);
        System.out.println("Total Marks: "+total);
        System.out.println("Percentage: "+per);

    }
}

public class ModaccessModif {
    public static void main(String args[]){
        Result x = new Result();
        x.input();
        x.calculate();
        x.show();
        System.out.println("English marks: "+x.eng);
    }
}
