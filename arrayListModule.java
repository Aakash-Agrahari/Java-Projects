package com.company;

import java.util.*;

public class arrayListModule {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>(); //list is any name.
        list.add("Lanke");
        list.add("Ravi");
        list.add("Kumar");
        list.add("Jain");

        list.forEach(
                (n)-> System.out.println(n)
        );
    }

}
