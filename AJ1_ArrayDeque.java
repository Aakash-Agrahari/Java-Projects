package com.company;
import java.util.*;
public class AJ1_ArrayDeque {
    public static void main(String[] args) {
       // More methods can be seen in Oracle Java doc.
        // These ArrayList, LinkList and ArrayDeque uses almost same methods expect few.

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();      // Process to initialize an ArrayDeque.
        ad1.add(20);
        ad1.add(43);
        ad1.addFirst(78);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
