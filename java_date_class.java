package com.company;
import java.util.*;

public class java_date_class {
    public static void main(String[] args) {
       // System.out.println(Long.MAX_VALUE);
       // System.out.println(System.currentTimeMillis());

        Date d1 = new Date();      // To initialize the time.
        System.out.println(d1);    // To check the time.
        System.out.println(d1.getTime());
        System.out.println(d1.getDate());
        System.out.println(d1.getSeconds());
        System.out.println(d1.getTimezoneOffset());
        System.out.println(d1.getYear());
        System.out.println(d1.getDay());
    }
}
