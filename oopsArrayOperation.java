package com.company;

import java.util.Scanner;

//1. 2-D array addition.
/*
class arrayCreation{
    int [][]a = new int[100][100];
    int [][]b = new int[100][100];
    int [][]sum = new int[100][100];
}
class arrayOperating extends arrayCreation{
    int i,j,r,c;

    public void arrayInput(){
        System.out.println("Enter the size of row: ");
        Scanner rc = new Scanner(System.in);
        r = rc.nextInt();
        System.out.println("Enter the size of column: ");
        Scanner cc = new Scanner(System.in);
        c = cc.nextInt();
        System.out.println("Enter the value in a: ");
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                Scanner ac = new Scanner(System.in);
                a[i][j] = ac.nextInt();
            }
        }
        System.out.println("Enter the value in b: ");
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                Scanner bc = new Scanner(System.in);
                b[i][j] = bc.nextInt();
            }
        }
    }

    public void arrayPerforming(){
        System.out.println("Performing Array Addition..........");
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    public void arrayDisplaying(){
        System.out.println("The output will be: ");
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                System.out.printf("%d\t", sum[i][j]);
            }
            System.out.println("\n");
        }
    }
}

public class oopsArrayOperation {
    public static void main(String args[]){
        arrayOperating ap = new arrayOperating();
        ap.arrayInput();
        ap.arrayPerforming();
        ap.arrayDisplaying();
    }
}
 */


//2. 2-D array multiplication.
class arrayCreation{
    int [][]a = new int[100][100];
    int [][]b = new int[100][100];
    int [][]mul = new int[100][100];
}
class arrayOperating extends arrayCreation{
    int i,j,k,r,c;

    public void arrayInput(){
        System.out.println("Enter the size of row: ");
        Scanner rc = new Scanner(System.in);
        r = rc.nextInt();
        System.out.println("Enter the size of column: ");
        Scanner cc = new Scanner(System.in);
        c = cc.nextInt();
        System.out.println("Enter the value in a: ");
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                Scanner ac = new Scanner(System.in);
                a[i][j] = ac.nextInt();
            }
        }
        System.out.println("Enter the value in b: ");
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                Scanner bc = new Scanner(System.in);
                b[i][j] = bc.nextInt();
            }
        }
    }

    public void arrayPerforming(){
        System.out.println("Performing Array Multiplication..........");
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                for(k=0; k<c; k++){
                    mul[i][j] = 0;
                    mul[i][j] += a[i][j] + b[i][j];
                }
            }
        }
    }

    public void arrayDisplaying(){
        System.out.println("The output will be: ");
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                System.out.printf("%d\t", mul[i][j]);
            }
            System.out.println("\n");
        }
    }
}

public class oopsArrayOperation {
    public static void main(String args[]){
        arrayOperating ap = new arrayOperating();
        ap.arrayInput();
        ap.arrayPerforming();
        ap.arrayDisplaying();
    }
}
