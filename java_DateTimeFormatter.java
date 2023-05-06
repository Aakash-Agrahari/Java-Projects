package com.company;
import java.time.*;
import java.time.format.*;

public class java_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime LDT2 = LocalDateTime.now();
        System.out.println(LDT2);

        // To print dateTime in desired format
        DateTimeFormatter DTF1 = DateTimeFormatter.ofPattern("dd-MM-yyyy - E h:m a"); //To initialize and give pattern.
        String myDate = LDT2.format(DTF1); // Creating date string using date and format.
        System.out.println(myDate);

        DateTimeFormatter DTF2 = DateTimeFormatter.ISO_LOCAL_DATE; // to print in ISO format.
        String myISODate = LDT2.format(DTF2);
        System.out.println(myISODate);
    }
}

// These E, h:m, a and likewise there are so many methods that can be used and viewed with the help of java doc.