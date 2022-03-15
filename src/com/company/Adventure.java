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
    System.out.println(magenta + "Welcome to The New World!\n" + fReset+"\uD83E\uDDDF");
    System.out.println("We are in 2023, and the world leaders of the superpowers have ended up in a war with chemical weapons.\n"
            +"Now the human race has begun to mutate, and become carnivorous, and aggressive.\n" +
            "You were in a large mall when the attacks took place, seeking shelter in the parking basement.\n" +
            "You have heard via a car radio that the military has begun evacuating to a safe zone.\n" +
            "You therefore have to go up to the roof, of the mall so they can pick you up by helicopter.\n" +
            "But be careful, because you must not be bitten or attacked by the mutations.");
    newLine();
    System.out.println("Your task now is to find your way to the roof of the rescue helicopter. " +
            "You navigate around the mall by typing:\n" +
            " "+blue+ "\"go west\" "+fReset+"or " + blue+ "go north "+ fReset+"or " + blue+ "go south"+fReset+ " or " + blue+ "go east.\n" + fReset +
            "Along the way, you can find items to combat the mutations.\n");
  }

  public void mainMenu() {

    Scanner sc = new Scanner(System.in);

    welcomeMessage();

    makeDungeons();

    String input;


      System.out.println("\nEXSTRA COMANDS:");
      System.out.println("Type:"+blue + " look " + fReset +"See whats in the room");
      System.out.println("Type:"+blue + " help " +fReset+"Go to the help menu");
      System.out.println("Type:"+blue + " exit " + fReset +"To exit the game");
      do {
        input = sc.nextLine().toLowerCase();

      if (input.equals("look")) {
        System.out.println("Looking around...");
        System.out.println(currentRoom.getDescription());

      } else if (input.equalsIgnoreCase("go north")) {
        Room dungeonNorth = currentRoom.getNorth();
        String direction = "north";
        //dungeonNorth.setNorth(currentRoom);
        checkForNull(dungeonNorth,direction);

      } else if (input.equalsIgnoreCase("go south")) {
        Room dungeonSouth = currentRoom.getSouth();
        dungeonSouth.setSouth(currentRoom);
        String direction = "south";
        checkForNull(dungeonSouth, direction);

      } else if (input.equalsIgnoreCase("Go east")) {
        Room dungeonEast = currentRoom.getEast();
        String direction = "east";
        checkForNull(dungeonEast, direction);

      } else if (input.equalsIgnoreCase("Go west")) {
        Room dungeonWest = currentRoom.getWest();
        String direction = "west";
        checkForNull(dungeonWest, direction);

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


  public void checkForNull(Room dungeon, String direction){

/*
    if (currentRoom.getNorth() != null) {
      currentRoom = currentRoom.getNorth();
      System.out.println(yellow + "...your have now moved north\n" + fReset);

    } else if (currentRoom.getSouth() != null) {
      currentRoom = currentRoom.getSouth();
      System.out.println(yellow + "...your have now moved south\n"+ fReset);

    } else if (currentRoom.getEast() != null) {
      currentRoom = currentRoom.getEast();
      System.out.println(yellow + "...your have now moved east\n"+ fReset);

    } else if (currentRoom.getWest() != null) {
      currentRoom = currentRoom.getWest();
      System.out.println(yellow + "...your have now moved west\n"+ fReset);

    } else {
      System.out.println(red+ "...you cannot go that way\n"+ fReset);
    }

 */


    if(dungeon == null){
      System.out.println("A horde of zombies.." + red + "LOOK OUT!" +
              "\nOUCH!" + fReset);
      System.out.println("Wrong way, please try again!");
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


    Room dungeon1 = new Room("Dungeon 1", "You are in the parking basement, where a few zombies walk around\n" +
            "shhh be quiet or they will see you!");
    Room dungeon2 = new Room("Dungeon 2", "You found the stairs, and went upstairs.\n" +
            "You are now on the first floor, it smells like death and you look over towards the dinning area and see a ");
    Room dungeon3 = new Room("Dungeon 3", "Zombie.");
    Room dungeon4 = new Room("Dungeon 4", "description");
    Room dungeon5 = new Room("Dungeon 5", "Helicopter area");
    Room dungeon6 = new Room("Dungeon 6", "description");
    Room dungeon7 = new Room("Dungeon 7", "description");
    Room dungeon8 = new Room("Dungeon 8", "Boss blocking the door");
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
  //dungeon6.setSouth(dungeon9);
    //Room 7
    dungeon7.setNorth(dungeon4);
    dungeon7.setEast(dungeon8);
    //Room 8
    dungeon8.setWest(dungeon7);
    dungeon8.setNorth(dungeon5);
    dungeon8.setEast(dungeon9);
    //Room 9
    dungeon9.setWest(dungeon8);
    //dungeon9.setNorth(dungeon6);

    currentRoom = dungeon1;

     /* //Kan ikke få det her til at virke :(

      if (currentRoom.getNorth() != null) { //tjekker for om den er =null
        currentRoom = currentRoom.getNorth();//skiftet plads
      } else if (currentRoom.getSouth() != null) { //tjekker for om den er =null
        currentRoom = currentRoom.getSouth();//skiftet plads
      } else if (currentRoom.getEast() != null) { //tjekker for om den er =null
        currentRoom = currentRoom.getEast();//skiftet plads
      } else if (currentRoom.getWest() != null) { //tjekker for om den er =null
        currentRoom = currentRoom.getWest();//skiftet plads
      } else {
        System.out.println("wrong way");
      }
  */  }

  public static void main(String[] args) {

    Adventure adventure = new Adventure();

    // starter spillet
    adventure.mainMenu();

  }
}