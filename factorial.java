package com.company;

import java.util.Scanner;

class factorizing{
    int num;
    public void takingInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
    }
    public int factorize(){
        int facto = 1;
        for(int i=1;i<=num;i++){
            facto *= i;
        }
        return facto;
    }


}

public class factorial {
    public static void main(String[] args) {
        factorizing ft = new factorizing();
        ft.takingInput();
        System.out.println(ft.factorize());
    }
}
