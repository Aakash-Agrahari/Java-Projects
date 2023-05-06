package com.company;
import java.util.*;

public class AJ1_ArrayList {  // There are different methods in ArrayList which can be seen in Oracle Java doc.
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();    // Precess to initialize new ArrayList
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(11);
        l2.add(13);
        l2.add(15);
        l2.add(18);
        l2.add(21);
        l2.add(54);
        l1.add(5);
        l1.add(6);
        l1.add(4);
        l1.add(7);
        l1.addAll(0,l2);                             // prints value of 'l2' along with value of 'l1'.
        l1.add(0,9);              // adds '9' in the 0th index i.e. 9 is printed instead of 5.
        //l1.clear();                            // It clears all the value in l1.
        System.out.println(l1.contains(18));  // Shows 'true' if 18 is available else 'false'
        System.out.println(l1.indexOf(6));       // Shows index of '6' i.e. '8'.
        l1.set(3,67);                         // It sets value at 'index 3' to '67'.
        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));            // Process to print the ArrayList

        }
    }
}
