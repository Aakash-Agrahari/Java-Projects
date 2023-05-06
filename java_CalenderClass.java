package com.company;
import java.util.*;

public class java_CalenderClass {
    public static void main(String[] args) {
       Calendar C1 = Calendar.getInstance(); // To initialize the time.
       System.out.println(C1.getTime());     // To print the time.
       System.out.println(C1.getCalendarType());
       System.out.println(C1.getTimeZone());
       System.out.println(C1.get(Calendar.SECOND));
       System.out.println(C1.get(Calendar.MINUTE));
       System.out.println(C1.get(Calendar.DATE));
       System.out.println(C1.get(Calendar.YEAR));
       System.out.println(C1.get(Calendar.HOUR));
       System.out.println(C1.get(Calendar.HOUR_OF_DAY)); // It shows in 24hour format.
        System.out.println(C1.get(Calendar.HOUR) + ":" + C1.get(Calendar.MINUTE) + ":" + C1.get(Calendar.SECOND));



        //Code to change our Time Zone.

        //Calendar C1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Dubai")); //Code to change our Time Zone.
        //System.out.println(C1.getCalendarType());
        //System.out.println(C1.getTimeZone().getID());

    }
}
