package com.company;

import java.util.Scanner;

public class Adventure {

  public String red = "\u001B[31m";
  public String fReset = "\u001B[0m";
  public String green = "\u001B[32m";
  public String blue = "\u001B[34m";
  public String yellow = "\u001B[33m";
  public String magenta = "\u001B[35m";
  private Room currentRoom;

  private void newLine() {
    System.out.println();
  }

  public void welcomeMessage() {
    System.out.println(" ");
    System.out.println(magenta + "Welcome to The Void!\n" + fReset);
    newLine();
    System.out.println(magenta + "The Void" + fReset + " is a game where you have been teleportet to the multivers and trapped inside another dimension.\n" +
            "You have to find you're way back to you own planet.\nYou have been abducted and teleported to " + magenta +"the Void" + fReset + ", where you are helt prisoner in a mazen" +
            "You're only hope is to find you're way through the maze and return to you're own planet, by navigating around the new world by typin: go nort, go south, go west or go east. to explore the new world, type the comand: look"
            + green+"\nGood luck and don't get caught ;)" +fReset);
  }

  public void mainMenu() {

    Scanner sc = new Scanner(System.in);

    welcomeMessage();

    makeDungeons();

    String input;
    do {

      System.out.println("\nEXSTRA COMANDS:");
      System.out.println("Type:"+blue + " look " + fReset +"See whats in the room");
      System.out.println("Type:"+blue + " help " +fReset+"Go to the help menu");
      System.out.println("Type:"+blue + " exit " + fReset +"To exit the game");
      input = sc.nextLine().toLowerCase();

      if (input.equals("look")) {
        System.out.println("Looking around...");
        System.out.println(currentRoom.getDescription());

      } else if (input.equalsIgnoreCase("go north")) {
        Room dungeonNorth = currentRoom.getNorth();
        //String direction = "north";
        //checkForNull(dungeonNorth,direction);

      } else if (input.equalsIgnoreCase("go south")) {
        Room dungeonSouth = currentRoom.getSouth();
        String direction = "south";
        //checkForNull(dungeonSouth, direction);

      } else if (input.equalsIgnoreCase("Go east")) {
        Room dungeonEast = currentRoom.getEast();
        String direction = "east";
        //checkForNull(dungeonEast, direction);

      } else if (input.equalsIgnoreCase("Go west")) {
        Room dungeonWest = currentRoom.getWest();
        System.out.println(currentRoom.getDescription());
        String direction = "west";
        //checkForNull(dungeonWest, direction);

      } else if (input.equals("help")) {
        System.out.println("THE STORY");
        System.out.println("You have been abducted and teleported to "+ magenta + "the Void" + fReset + ", where you are helt prisoner in a maze" +
            "\nYou're only hope is to find you're way through the maze and return to you're own planet" +
            "\n"+magenta+" The Void" + fReset + " is a game where you have been teleportet to the multivers and trapped inside another dimension." +
            "\nGood luck and don't get caught");
        newLine();
        System.out.println("NAVIGATION");
        newLine();
        System.out.println("You navigate around the "+yellow +"new world"+fReset+" by typing on the keybord.");
        newLine();
        System.out.println("Type:"+blue+ " go north " +fReset+"......to move north");
        System.out.println("Type:"+blue+ " go east " +fReset+"........to move east");
        System.out.println("Type:"+blue+ " go south " +fReset+"......to move south");
        System.out.println("Type:"+blue+ " go west " +fReset+"........to move west");

      } else if (input.equals("exit")) {
        System.out.println(red + "You have ended the game" + fReset);
      } else
        System.out.println("Invalid, please try again!");
    }
    while (!input.equals("exit")) ;

  }

/*
  public void checkForNull(Room dungeon, String direction){

    if(dungeon == null){
      System.out.println("You went into a wall" + red + "OUCH!" + fReset);
    } else {
      System.out.println("Going " + direction);
      currentRoom = dungeon;
    }

  }

 */

  //attributter
  //private String name; //evt. til senere brug
  // private String desception; //evt. til senere brug

  //private boolean yesNo;



  public void makeDungeons() {


    Room dungeon1 = new Room("Dungeon 1", "It's dark, all you can see is some small" + magenta + " purple particles"+ fReset + " flying around the room");
    Room dungeon2 = new Room("Dungeon 2", "description");
    Room dungeon3 = new Room("Dungeon 3", "description");
    Room dungeon4 = new Room("Dungeon 4", "description");
    Room dungeon5 = new Room("Dungeon 5", "description");
    Room dungeon6 = new Room("Dungeon 6", "description");
    Room dungeon7 = new Room("Dungeon 7", "description");
    Room dungeon8 = new Room("Dungeon 8", "description");
    Room dungeon9 = new Room("Dungeon 9", "description");



    //room 1
    dungeon1.setEast(dungeon2);
    dungeon1.setSouth(dungeon4);

    //Room 2
    dungeon2.setWest(dungeon1);
    dungeon2.setEast(dungeon3);
    //Room 3
    dungeon3.setWest(dungeon2);
    dungeon3.setSouth(dungeon6);
    //Room 4
    dungeon4.setNorth(dungeon1);
    dungeon4.setSouth(dungeon7);
    //Room 5
    dungeon5.setSouth(dungeon8);
    //Room 6
    dungeon6.setNorth(dungeon3);
    dungeon6.setSouth(dungeon9);
    //Room 7
    dungeon7.setNorth(dungeon4);
    dungeon7.setEast(dungeon8);
    //Room 8
    dungeon8.setWest(dungeon7);
    dungeon8.setNorth(dungeon5);
    dungeon8.setEast(dungeon9);
    //Room 9
    dungeon9.setWest(dungeon8);
    dungeon9.setNorth(dungeon6);

    currentRoom = dungeon1;


//tjek for null
    if (currentRoom.getNorth() != null) {             //tjekker for om den er =null
      currentRoom = currentRoom.getNorth();           //skiftet plads
      System.out.println(yellow + "your have now moved north\n" + fReset);

    } else if (currentRoom.getSouth() != null) {         //tjekker for om den er =null
      currentRoom = currentRoom.getSouth();             //skiftet plads
      System.out.println(yellow + "your have now moved south\n"+ fReset);

    } else if (currentRoom.getEast() != null) {        //tjekker for om den er =null
      currentRoom = currentRoom.getEast();
      System.out.println(yellow + "your have now moved east\n"+ fReset);

    } else if (currentRoom.getWest() != null) {        //tjekker for om den er =null
      currentRoom = currentRoom.getWest();
      System.out.println(yellow + "your have now moved west\n"+ fReset);

    } else {
      System.out.println(red+"you cannot go that way\n"+ fReset);
    }

   }

  public static void main(String[] args) {

    Adventure adventure = new Adventure();

    // starter spillet
    adventure.mainMenu();

  }
}