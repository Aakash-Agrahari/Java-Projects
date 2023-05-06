package com.company;

import java.util.Scanner;

class arrayMaking{
    int []a = new int[100];
}

class Sorting extends arrayMaking {     //use of inheritance(extend keyword).
    int i,j,temp,size;

    public void sortingDetail(){
        int i;
        System.out.println("Enter the size of the array: ");
        Scanner sz = new Scanner(System.in);
        size = sz.nextInt();
        System.out.println("Enter the array element: ");
        Scanner ae = new Scanner(System.in);

        for(i=0; i<size; i++){
            a[i] = ae.nextInt();
        }
    }

    public void sortingMethod(){

        for(i=0;i<size;i++){
            for(j=i+1;j<size;j++){
                if(a[i]>a[j]) {     //(a[i]<a[j]) is used for sorting in descending form.
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public int sortingOutput(){
        System.out.println("The sorted array is as below: ");
        for(i=0; i<size; i++){
            System.out.println(a[i]);
        }
        System.out.println("\n");
        return 0;
    }
}

public class sorting_array {
    public static void main(String[] args){
        Sorting S1 = new Sorting();
        S1.sortingDetail();
        S1.sortingMethod();
        System.out.println(S1.sortingOutput());
    }
}
