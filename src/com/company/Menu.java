package com.company;

import java.util.Scanner;

public class Menu {
    public String rød = "\u001B[31m";
    public String fReset = "\u001B[0m";
    public String grøn = "\u001B[32m";
    public String blue = "\u001B[34m";
    public String yellow = "\u001B[33m";

    public void welcomeMessage(){
        System.out.println("Welcome to Darkest Dungeon 2D!\n");

        System.out.println("Darkest Dungeon 2D! is a game where the player is trying to get out of an evil dungeon " +
                "to move from room to room by typing in commands:\n" +
                " go north\n" +
                " go south\n" +
                " go east\n" +
                " go west");

        System.out.println(" ");

    }



    public void mainMenu() {


        Scanner sc = new Scanner(System.in);

        welcomeMessage();

        String input;
        do {
            System.out.println("To get the description of which room you are in, write:\n" +
                    " look ");
            System.out.println("To get instructions and a overview of possible commands, write:\n" +
                    " help ");
            System.out.println("To exit the game, write:\n" +
                    " exit");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("look")) {
                System.out.println("Looking around...\n");
                System.out.println("The room you're in, ... ");
            } else if (input.equalsIgnoreCase("Go north")) {
                System.out.println("Going north!");
            } else if (input.equalsIgnoreCase("Go south")) {
                System.out.println("Going south!");
            } else if (input.equalsIgnoreCase("Go east")) {
                System.out.println("Going east!");
            } else if (input.equalsIgnoreCase("Go west")) {
                System.out.println("Going west!");
            } else if (input.equalsIgnoreCase("help")) {
                System.out.println("You use the commands 'go north', 'go east', 'go south' and 'go west' to change the " +
                        "direction in this game ");
            } else if (input.equalsIgnoreCase("exit")) {
                System.out.println("You have ended the game - welcome back!");
            } else
                System.out.println("invalid command, try again!");
        }
        while (!input.equals("exit")); // or (!"exit".equals(input) ??)

    }
}
