package com.company;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

    public class audioStreaming {
        public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
            File file = new File("C:/Users/aakas/Downloads/Master-bgm.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            //clip.start();

            Scanner sc = new Scanner(System.in); //It tries to run a background thread but our program doesn't wait for it and closes and so we need to makesomething so that it wait. Then we can use Scanner class so that it wait for the user input and our program could run.

            String response = "";
            while(response != "Q"){
                System.out.println("Enter 'P' to Play, 'S' to stop, 'R' to repeat and 'Q' to quit: ");
                response = sc.next();
                response = response.toUpperCase();
                switch (response){
                    case "P":
                        clip.start();
                        clip.loop(Clip.LOOP_CONTINUOUSLY); //to stream the audio on loop even after the end of the song
                        break;
                    case "S":
                        clip.stop();
                    case "R":
                        clip.setMicrosecondPosition(0);
                        break;
                    case "Q":
                        clip.close();
                        System.exit(0); //to terminate the whole program
                    default:
                        System.out.println("Enter the given keywords only.");
                }
            }
        }
    }


