package com.company;

import java.util.ArrayList;

public class Java_Generics {
    public static void main(String[] args) {
        ArrayList AL1 = new ArrayList();
        AL1.add("str1");
        AL1.add(43);
        AL1.add(89);
        //int a = AL1.get(2); //This will not work as program don't know you are using integer or string or what.
        int a = (int) AL1.get(2); // We must do type casting in this case.
        System.out.println(a);
    }
}
