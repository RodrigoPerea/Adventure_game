package com.company;

import java.util.Scanner;

public class Menu {


    public void mainMenu() {

        Scanner input = new Scanner(System.in);

        System.out.println("-- Menu --");
        System.out.println(
                "Select an option: \n" +
                        "  1) Start\n" +
                        "  2)  Exit\n");
        int selection = input.nextInt();
        input.nextLine();

        switch (selection) {
            case 1:
                this.Start();

            case 2:
                this.Exit();
        }

    }

    public void Start() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Adventure game \n" +
                "You are trapped in a dungeon and trying to find your way out \n" +
                "What will you do?\n");
        System.out.println("-- Options --");
        System.out.println("Select an option: \n" +
                "  1) Look around\n" + //look around, decription of room
                "  2) Navigate\n" +
                "  6) Help\n" +
                "  7) Exit");
        int options = input.nextInt();
        input.nextLine();

        switch (options) {
            case 1:
                this.LookAround();

            case 2:
                this.Navigate();


            case 3:
                this.Help();

            case 4:
                this.Exit();

        }
    }
    public void LookAround() {
        //Description of the room
        System.out.println("Its dark, and all you can hear is the water dripping from the ceiling and a gentle breeze coming from the walls");

    }
    public void Navigate() {
        Scanner navigate = new Scanner(System.in);
        System.out.println("to navigate around type\n" +
                "           North" +
                "           South" +
                "           East" +
                "           West\n");
        System.out.println("What way will you go?\n" +
                "");
        String nav = navigate.nextLine();
        System.out.println("You went " + nav);

    }

    public void Help() {
        System.out.println("to navigate around type \n" +
                "           North\n" +
                "           South\n" +
                "           East\n" +
                "           West\n");
    }

    public void Exit() {
        System.out.println("Exiting to Desktop");
        System.exit(0);
    }
}
