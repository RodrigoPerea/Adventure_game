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
  private String name;
  private String description;


  public void welcomeMessage(){
    System.out.println(" ");
    System.out.println(magenta +"Welcome to The Void!\n" + fReset);

    System.out.println(magenta + "The Void" + fReset + " is a place where you are trapped\n" +
            "and where you have to find you're way out by using you're senses and write the commands\n" +
            yellow + "go north\n" +
            "go south\n" +
            "go east\n" +
            "go west" + fReset);
    System.out.println("to navigate around the maze system!\n");

    System.out.println("You have been abducted and teleported to " + magenta + "the Void" + fReset +", where you are helt prisoner in a maze\n" +
            " you're only hope is to find you're way through the maze and return to you're own planet\n" +
            "Good luck and don't get caught\n");
  }

  public void mainMenu() {

    makeDungeons();

    Scanner sc = new Scanner(System.in);

    welcomeMessage();

    String input;
    do {
      System.out.println("To see what's in the room, write: \n" +
              blue +"look " + fReset);
      System.out.println("To get instructions and a a help menu, write: \n" +
              blue + "help " + fReset);
      System.out.println("To exit the game, write: \n" +
              blue + "exit" + fReset);
      input = sc.nextLine().toLowerCase();

      if (input.equals("look")) {
        System.out.println("Looking around...");
        System.out.println(currentRoom.getDescription());

      } else if (input.equalsIgnoreCase("go north")) {
        Room dungeonToTheNorth = currentRoom.getNorth();
        String direction = "north";
        checkForNull(dungeonToTheNorth, direction);

      } else if (input.equalsIgnoreCase("go south")) {
        Room dungeonToTheSouth = currentRoom.getSouth();
        String direction = "south";
        checkForNull(dungeonToTheSouth, direction);

      } else if (input.equalsIgnoreCase("Go east")) {
        Room dungeonToTheEast = currentRoom.getEast();
        String direction = "east";
        checkForNull(dungeonToTheEast, direction);

      } else if (input.equalsIgnoreCase("Go west")) {
        Room dungeonToTheWest = currentRoom.getWest();
        String direction = "west";
        checkForNull(dungeonToTheWest, direction);

      } else if (input.equals("help")) {
        System.out.println("You use the commands " + "go north\n" +
              yellow + "go east\n" +
                "go south\n" +
                "go west\n" + fReset +
                "to change the direction in this game ");
      } else if (input.equals("exit")) {
        System.out.println(red + "You have ended the game" + fReset);
      } else
        System.out.println("Invalid, please try again!");
    }
    while (!input.equals("exit"));


  }

  public void checkForNull(Room dungeon, String direction){

    if(dungeon == null){
      System.out.println("You went into a wall" + red + "OUCH!" + fReset);
    } else {
      System.out.println("Going " + direction);
      currentRoom = dungeon;
    }
  }

  //attributter
  //private String name; //evt. til senere brug
 // private String desception; //evt. til senere brug
  
  //private boolean yesNo;



  public void makeDungeons() {


    Room dungeon1 = new Room("Dungeon 1", "description");
    Room dungeon2 = new Room("Dungeon 2", "description");
    Room dungeon3 = new Room("Dungeon 3", "description");
    Room dungeon4 = new Room("Dungeon 4", "description");
    Room dungeon5 = new Room("Dungeon 5", "description");
    Room dungeon6 = new Room("Dungeon 6", "description");
    Room dungeon7 = new Room("Dungeon 7", "description");
    Room dungeon8 = new Room("Dungeon 8", "description");
    Room dungeon9 = new Room("Dungeon 9", "description");

    dungeon1.setEast(dungeon2);
    dungeon1.setSouth(dungeon4);

    dungeon2.setWest(dungeon1);
    dungeon2.setEast(dungeon3);

    dungeon3.setWest(dungeon2);
    dungeon3.setSouth(dungeon6);

    dungeon4.setNorth(dungeon1);
    dungeon4.setSouth(dungeon7);

    dungeon5.setSouth(dungeon8);

    dungeon6.setNorth(dungeon3);
    dungeon6.setSouth(dungeon9);

    dungeon7.setNorth(dungeon4);
    dungeon7.setEast(dungeon8);

    dungeon8.setWest(dungeon7);
    dungeon8.setNorth(dungeon5);
    dungeon8.setEast(dungeon9);

    dungeon9.setWest(dungeon8);
    dungeon9.setNorth(dungeon6);

    currentRoom = dungeon1;
  }


  public static void main(String[] args) {

    Adventure adventure = new Adventure();

    // starter spillet
    adventure.mainMenu();

  }
}