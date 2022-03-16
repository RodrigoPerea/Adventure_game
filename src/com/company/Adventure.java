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



    System.out.println(magenta + "Welcome to The New World!\n" + fReset+"\uD83E\uDDDF   \uD83E\uDDDF   \uD83E\uDDDF   \uD83E\uDDDF   \uD83E\uDDDF");
    System.out.println("We are in 2023, and the world leaders of the superpowers have ended up in a war with chemical weapons.\n"
            +"Now the human race has begun to mutate, and become carnivorous, and aggressive.\n" +
            "You were in a large mall when the attacks took place, seeking shelter in the parking basement.\n" +
            "You have heard via a car radio that the military has begun evacuating to a safe zone.\n" +
            "You therefore have to go up to the roof, of the mall so they can pick you up by helicopter.\n" +
            "But be careful, because you must not be bitten or attacked by the mutations.");
    newLine();
    System.out.println("Your task now is to find your way to the roof of the rescue helicopter. " +
            "You navigate around the mall by typing:\n" +
            blue+ "\"go west\" "+fReset+"or " + blue+ "go north "+ fReset+"or " + blue+ "go south"+fReset+ " or " + blue+ "go east.\n" + fReset +
            "Along the way, you can find items to combat the mutations.\n");
  }

  public void mainMenu() {

    Map map = new Map();

    map.makeDungeons();

    currentRoom = map.getStarterRoom();

    Scanner sc = new Scanner(System.in);

    welcomeMessage();


    String input;


      System.out.println("\n   EXSTRA COMANDS:");
    System.out.println("   ............................................");
      System.out.println("   Type: |"+blue + " look " + fReset +"| See whats in the room");
      System.out.println("   Type: |"+blue + " help " +fReset+"| Go to the help menu");
      System.out.println("   Type: |"+blue + " exit " + fReset +"| To exit the game");
      newLine();
    System.out.println(red+"   Let the game begin! TYPE HERE"+fReset);
      newLine();
      newLine();
      newLine();
      do {
        input = sc.nextLine().toLowerCase();

      if (input.equals("look")) {
        System.out.println("Looking around...");  // kunne evt sættes i en metode for sig selv der hed look, så den ikke blir kaldt fra els if sætning men kommer i en mtode.
        System.out.println(currentRoom.getName());
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
        newLine();
        System.out.println(red+"THE STORY"+fReset);
        System.out.println("   We are in 2023, and the world leaders of the superpowers have ended up in a war with chemical weapons.\n"
            +"   Now the human race has begun to mutate, and become carnivorous, and aggressive.\n" +
            "   You were in a large mall when the attacks took place, seeking shelter in the parking basement.\n" +
            "   You have heard via a car radio that the military has begun evacuating to a safe zone.\n" +
            "   You therefore have to go up to the roof, of the mall so they can pick you up by helicopter.\n" +
            "   But be careful, because you must not be bitten or attacked by the mutations.");
        newLine();
        System.out.println("............................................................");
        System.out.println("   NAVIGATION");
        newLine();
        System.out.println("   You navigate around the "+yellow +"The New World"+fReset+" by typing on the keybord.");
        newLine();
        System.out.println("   Type: |"+blue+ " go north " +fReset+"| to move north");
        System.out.println("   Type: |"+blue+ " go east " +fReset+" | to move east");
        System.out.println("   Type: |"+blue+ " go south " +fReset+"| to move south");
        System.out.println("   Type: |"+blue+ " go west " +fReset+" | to move west");
        newLine();
        System.out.println("\n   EXSTRA COMANDS:");
        System.out.println("   ............................................");
        System.out.println("   Type: |"+blue + " look " + fReset +"| See whats in the room");
        System.out.println("   Type: |"+blue + " help " +fReset+"| Go to the help menu");
        System.out.println("   Type: |"+blue + " exit " + fReset +"| To exit the game");
        newLine();
        System.out.println(red+"   Continue to find a safe to the roof! TYPE HERE"+fReset);
        newLine();
        newLine();
        newLine();

      } else if (input.equals("exit")) {
        System.out.println(red + "You have ended the game" + fReset);
      } else
        System.out.println("Invalid, please try again!");
    }
    while (!input.equals("exit")) ;

  }


  public void checkForNull(Room dungeon, String direction){
  // denne er lavet, så man SKAL kigge i rumet for at få beskrivelse af rummet.

    if(dungeon == null){
      System.out.println("A horde of zombies.." + red + "LOOK OUT!" +
              "\nOUCH!" + fReset);
      System.out.println("Wrong way, please try again!");
    } else {
      System.out.println("Going " + direction);
      currentRoom = dungeon;
    }

  }

  public static void main(String[] args) {


    Adventure adventure = new Adventure();
    // starter spillet
    adventure.mainMenu();

  }
}