package com.company;

import java.util.Scanner;

public class EkstraCommands {

    public String red = "\u001B[31m";
    public String fReset = "\u001B[0m";
    public String green = "\u001B[32m";
    public String blue = "\u001B[34m";
    public String yellow = "\u001B[33m";
    public String magenta = "\u001B[35m";



    private void newLine() {
        System.out.println();

    }

    public void EkstraCommands() {


        System.out.println("\n   EXSTRA COMANDS:");
        System.out.println("   ............................................");
        System.out.println("   Type: |" + blue + " look " + fReset + "| See whats in the room");
        System.out.println("   Type: |" + blue + " help " + fReset + "| Go to the help menu");
        System.out.println("   Type: |" + blue + " exit " + fReset + "| To exit the game");
        newLine();
        System.out.println();
        System.out.println(red + "   Let the game begin!  " + fReset);
        newLine();
        newLine();
        newLine();
    }
}