package com.company;
import java.util.*;

public class java_GregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar GC1 = new GregorianCalendar(); // Process to initialize Gregorian Calendar.
        System.out.println(GC1.getTime());               // Process to print time.
        System.out.println(GC1.isLeapYear(2024));
        System.out.println(TimeZone.getAvailableIDs()[11]);
        System.out.println(TimeZone.getAvailableIDs()[18]);
        System.out.println(TimeZone.getAvailableIDs()[56]);
    }
}
