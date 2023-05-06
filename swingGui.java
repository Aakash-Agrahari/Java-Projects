package com.company;
import javax.swing.*;

public class swingGui extends JFrame {
    swingGui(String s){

    }
    public static void main(String[] args) {
        swingGui JF = new swingGui("Swing Example"); //Jframe JF = new JFrame("Swing Example").
        JButton JB = new JButton("Click Here");        //This is the method to use frame without using class execution.
        JB.setBounds(50,100,95,30);
        JF.add(JB);

        JF.setSize(400,400);
        JF.setLayout(null);
        JF.setVisible(true);
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //This will end the execution of the program when we will click on the red cross button.

    }
}
