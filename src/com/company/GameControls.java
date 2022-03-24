package com.company;

import java.util.Locale;
import java.util.Scanner;

public class GameControls {

    public String red = "\u001B[31m";
    public String fReset = "\u001B[0m";
    public String green = "\u001B[32m";
    public String blue = "\u001B[34m";
    public String yellow = "\u001B[33m";
    public String magenta = "\u001B[35m";

    private Scanner scan = new Scanner(System.in);
    private String input;
    private String playerName;

    Player player;

    private void newLine() {
        System.out.println();

    }

    public void Controls() {
        Map map = new Map();
        // currentRoom = map.starterRoom;

        player = new Player();
        player.setCurrentRoom(map.starterRoom);

        String itemName;

        System.out.print(red + "Enter your name: " + fReset);
        newLine();
        playerName = scan.nextLine();
        player.setPlayerName(playerName);

        System.out.print("Welcome to the Dead Center, " + playerName + "\n\n");
        System.out.println("You are in " + player.getCurrentRoom());

        // While loop
        do {

            System.out.println(yellow + "----------------------------------------" + fReset);
            System.out.print("What do you want to do?\n");
            newLine();
            input = scan.nextLine().toLowerCase().trim();


            if (input.equals("go north") || input.equals("north")) {
                if (player.getCurrentRoom().getNorth() != null) {
                    player.setCurrentRoom(player.getCurrentRoom().getNorth());
                    System.out.println("You are in " + player.getCurrentRoom());
                } else {
                    System.out.println("A horde of zombies.." + red + "LOOK OUT!" +
                        "\nOUCH!" + fReset);
                    System.out.println("Wrong way, please try again!");
                }
            }

            if (input.equals("go east") || input.equals("east")) {
                if (player.getCurrentRoom().getEast() != null) {
                    player.setCurrentRoom(player.getCurrentRoom().getEast());
                    System.out.println("You went to " + player.getCurrentRoom());
                } else {
                    System.out.println("A horde of zombies.." + red + "LOOK OUT!" +
                        "\nOUCH!" + fReset);
                    System.out.println("Wrong way, please try again!");
                }
            }
            if (input.equals("go south") || input.equals("south")) {
                if (player.getCurrentRoom().getSouth() != null) {
                    player.setCurrentRoom(player.getCurrentRoom().getSouth());
                    System.out.println("You went to " + player.getCurrentRoom());
                } else {
                    System.out.println("A horde of zombies.." + red + "LOOK OUT!" +
                        "\nOUCH!" + fReset);
                    System.out.println("Wrong way, please try again!");
                }
            }

            if (input.equals("go west") || input.equals("west")) {
                if (player.getCurrentRoom().getWest() != null) {
                    player.setCurrentRoom(player.getCurrentRoom().getWest());
                    System.out.println("You went to " + player.getCurrentRoom());
                } else {
                    System.out.println("A horde of zombies.." + red + "LOOK OUT!" +
                        "\nOUCH!" + fReset);
                    System.out.println("Wrong way, please try again!");
                }
            }

            //Look command
            else if (input.equals("look")) {
                System.out.println(" You are in " + player.getCurrentRoom());
                System.out.println(player.getCurrentRoom().getDescription());
                newLine();
                System.out.println("Loot: " + player.getCurrentRoom().getLoot());
            }
            //Help command
            else if (input.equals("help")) {
                help();
            }
            // Exit command
            else if (input.equals("exit")) {
                System.out.println(" You have ended the game");
                break;
            }
            // Show inventory
            else if (input.equals("inventory") || input.equals("inv")) {
                System.out.println("Inventory:\n" + player.getInventory());
            }
            // Take item


//vi vil gerne have man kan srkive take og så itemmet.
            else if (input.startsWith("take ")) {
                String lastWord = input.substring(5);
                player.takeItem(lastWord);
                //String lastWord = input.substring(input.lastIndexOf(" ")+1);
            } else if (input.equalsIgnoreCase("take")) {
                player.getCurrentRoom().showLoot();
                System.out.println("What would you like to pick up?");
                itemName = scan.nextLine();
                // itemName.toLowerCase(Locale.ROOT);
                player.takeItem(itemName);
            }
            // Drop item
            else if (input.equalsIgnoreCase("drop")) {
                player.getInventory();
                System.out.println("Which item would you like to drop?");
                itemName = scan.nextLine().toLowerCase().trim();
                player.dropItem(itemName);

            }
            // Equip
            else if (input.equalsIgnoreCase("equip")) {
                System.out.println("What would you like to equip?" +
                    "\n" + player.getInventory());
                itemName = scan.nextLine();
                player.equipItem(itemName);

            }

            // Eat
            else if (input.equalsIgnoreCase("eat") || input.equals("Eat")) {
                System.out.println("What would you like to consume?" +
                    "\n" + player.getInventory());
                itemName = scan.nextLine();
                player.eatFood(itemName);


            }
            // Show Health
            else if (input.equalsIgnoreCase("health") || input.equalsIgnoreCase("hp")) {
                player.showHealth();


// vi vil gerne lave sådan at skrive rman noget andet skriver den dette. men den kommer ikke emd i loopet.
            } else {
                System.out.println("Invalid command");
            }


        }

            while(!input.equals("exit"));
}
    // Start

    //Help command
    public void help() {
        System.out.println("----------------------------------------");
        System.out.println(yellow + "    \tYou have these options:" + fReset);
        newLine();
        System.out.println(blue + "go north, go east, go south, go west" + fReset + " OR" + blue + " north, east, south, west" + fReset + " - To choose directions");
        System.out.println(blue + "look" + fReset + " - To check your current location");
        System.out.println(blue + "inventory" + fReset + " - To see whats in your backpack");
        System.out.println(blue + "take/drop" + fReset + " - to add or remove items in your inventory");
        System.out.println(blue + "equip" + fReset + " - to use weapon");
        System.out.println(blue + "health" + fReset + " - to check how much HP you have");
        System.out.println(blue + "eat/consume" + fReset + "to eat or drink the food you have in your inventory");
        System.out.println(red + "exit" + fReset + " - To quit game");
    }
}









/*
public void checkForNull(Room dungeon, String direction) {
    // denne er lavet, så man SKAL kigge i rumet for at få beskrivelse af rummet.

    if (dungeon == null) {
        System.out.println("A horde of zombies.." + red + "LOOK OUT!" +
                "\nOUCH!" + fReset);
        System.out.println("Wrong way, please try again!");
    } else {
        System.out.println("Going " + direction);
        currentRoom = dungeon;
    }
}

 */

