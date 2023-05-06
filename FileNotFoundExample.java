package com.company;

import java.io.*;

public class FileNotFoundExample {
    public static void main(String[] args) throws IOException {
        FileReader FR = new FileReader("C:\\Users\\aakas\\OneDrive\\Desktop/Test.txt");
        BufferedReader br = new BufferedReader(FR);
        String fileData = null;
        while((fileData = br.readLine()) != null){
            System.out.println(fileData);
        }
        try{
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
