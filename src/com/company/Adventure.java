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

    Scanner sc = new Scanner(System.in);

    welcomeMessage();

    makeDungeons();

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



  public void makeDungeons() {


    Room dungeon1 = new Room(magenta+"You are in the parking basement!",fReset+ "Here in the basement, there is a few zombies walk around\n" +
            "shhh be quiet or they will see you!");

    Room dungeon2 = new Room(magenta+"You found some stairs, and are on the first floor!",fReset+ "You found the stairs, and went upstairs.\n" +
            "You are now on the first floor, and it smells like death\n" +
            "You look over towards the dinning area and see a something laying over a dead corpse\n" +
            red + "WATCH OUT IT'S A ZOMBIE " + fReset);

    Room dungeon3 = new Room(magenta+"You are in one of the restaurants in the mall!",fReset+ "You are now hiding coss one of the zombie followed you, but luckily have lost track of you.\n" +
            "You look for a knife but all you can find is a frying pan.\nMove on quick.....but quite!!");

    Room dungeon4 = new Room(magenta+"You found some stairs, and are now on the second floor in the hallway.",fReset+ "you are too exposed here in the hallway. the corridor is dark, and the light is broken, and hangning from the seal...blinking.\n" + //ændret, da man jo også kan gå ned igen cr
            "You hear some weird noises coming from somewhere in the halls.\n" +
            "You spot a giant zombie wandering the hallway. Better move on quick, or do something else.");

    Room dungeon5 = new Room(magenta+"You are now on the roof, close to the helicopter-patch.",fReset+ "You have finally arrived at the helicopter area. Try quick to block the door to the stairs, so you can wait for the helicopter.\n" +
            "The zombies are trying to get through the door. What do you do now?");

    Room dungeon6 = new Room(magenta+"You are now at an unknown destroyed staircase.",fReset+ "The staircase...? it looks like its destroyed by the attacks.\n" +
            "You look around and spot a crate. Maybe you should look there to find something you can use to move on before someone hear you!");

    Room dungeon7 = new Room(magenta+"You are in a TAAS shop.",fReset+ "You spot the american football section, maybe you should look for some football equipment for protection?");

    Room dungeon8 = new Room(magenta+"You at a dead end!",fReset+ "A zombie, as huge as a tank, is blocking some stairs, that leads up to the roof. Find another way, or somthing to deal with the zombi.");

    Room dungeon9 = new Room(magenta+"You are in the OUTDOOR911.",fReset+ "You found the hunting section. Maybe you should look for a rifle with a few shells?\n" +
            "You can maybe use it against the giant zombie, that's blocking the door");

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
  //dungeon6.setSouth(dungeon9); // lukket adgang. skal åbnes/eleminere zombie
    //Room 7
    dungeon7.setNorth(dungeon4);
    dungeon7.setEast(dungeon8);
    //Room 8
    dungeon8.setWest(dungeon7);
    dungeon8.setNorth(dungeon5);
    dungeon8.setEast(dungeon9);
    //Room 9
    dungeon9.setWest(dungeon8);
    //dungeon9.setNorth(dungeon6); // lukket adgang. skal åbnes/eleminere zombie

    currentRoom = dungeon1;


  }

  public static void main(String[] args) {

    Adventure adventure = new Adventure();
    // starter spillet
    adventure.mainMenu();

  }
}