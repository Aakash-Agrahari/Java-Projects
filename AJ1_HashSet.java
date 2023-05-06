package com.company;
import java.util.*;
public class AJ1_HashSet {
    public static void main(String[] args) {
        //More methods can be seen in Oracle Java doc.
        //Data is shown by applying hashing technique.
        HashSet<Integer> hs1 = new HashSet<>(5,0.6f);
        hs1.add(18);
        hs1.add(21);
        hs1.add(11);
        //hs1.hashCode();
        System.out.println(hs1);             // prints the program.
        //System.out.println(hs1.hashCode()); // It sums up all given number.
    }
}
