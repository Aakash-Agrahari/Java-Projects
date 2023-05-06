package com.company;
import java.time.*;

public class java_TimeAPI {
    public static void main(String[] args) {
        LocalDate LD1 = LocalDate.now();              // Process to initialize local date.
        System.out.println(LD1);                     // Process to print local date.

        LocalTime LT1 = LocalTime.now();             // Process to initialize local time.
        System.out.println(LT1);                     // Process to print local time.

        LocalDateTime LDT1 = LocalDateTime.now();    // Process to initialize local date time.
        System.out.println(LDT1);                    // Process to print local date time.
    }
}
