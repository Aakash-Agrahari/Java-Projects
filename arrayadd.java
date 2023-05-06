package com.company;

import java.util.Scanner;

public class arrayadd {
    public static void main(String[] args){
        int a[][] = new int[100][100], b[][] = new int[100][100], sum[][] = new int[100][100];
        int i,j,size;
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        System.out.println("Enter the elements of a: ");
        for(i=0;i<size;i++){
            for(j=0;j<size;j++){
                Scanner ac = new Scanner(System.in);
                a[i][j] = ac.nextInt();
            }
        }
        System.out.println("Enter the elements of b: ");
        for(i=0;i<size;i++){
            for(j=0;j<size;j++){
                Scanner bc = new Scanner(System.in);
                b[i][j] = bc.nextInt();
            }
        }
        for(i=0;i<size;i++){
            for(j=0;j<size;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The array addition will be: ");
        for(i=0;i<size;i++){
            for(j=0;j<size;j++){
                System.out.printf("%d\t", sum[i][j]);
            }
            System.out.println("\n");
        }

    }
}
