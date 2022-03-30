package com.company;

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

    public void theStory() {
        Story story = new Story();
        story.storyMessage();
    }



    public void Footsteps() {
        FootstepsSFX steps = new FootstepsSFX();
        steps.FootstepsStart();
    }

    public void ZombieHorde() {
        ZombieHorde picture = new ZombieHorde();
        picture.Horde();
    }

    public void hordeSounds() {
        ZombieSounds sounds = new ZombieSounds();
        sounds.musicStart();
    }

    public void lineSpace() {
        LineSpacing lines = new LineSpacing();
        lines.lines();
    }

    private void newLine() {
        System.out.println();

    }

    public void Controls() {
        Map map = new Map();
        // currentRoom = map.starterRoom;

        player = new Player();
        player.setCurrentRoom(map.starterRoom);

        String itemName;

        System.out.print(red + "   Enter your name: " + fReset);
        newLine();
        newLine();
        playerName = scan.nextLine();
        player.setPlayerName(playerName);
        newLine();
        lineSpace();


        System.out.print("╔═════════════════════════════════╗ \n " + red + "     WELCOME TO DEAD CENTER " +"\n" + fReset +"             " + green + playerName + fReset + "\n\n");
        System.out.println("You are in " + player.getCurrentRoom());


        // While loop
        do {

            System.out.println(yellow + "----------------------------------------" + fReset);
            System.out.print("What do you want to do?\n");
            newLine();
            input = scan.nextLine().toLowerCase().trim();
            lineSpace();


            if (input.equals("go north") || input.equals("north")) {
                go(Direction.NORTH);
                Footsteps();


            } else

            if (input.equals("go east") || input.equals("east")) {
                go(Direction.EAST);
                Footsteps();

            } else

            if (input.equals("go south") || input.equals("south")) {
                go(Direction.SOUTH);
                Footsteps();
            } else


            if (input.equals("go west") || input.equals("west")) {
                go(Direction.WEST);
                Footsteps();

            }

            //Look command
            else if (input.equalsIgnoreCase("look")) {
                System.out.println(red+"You are in " + player.getCurrentRoom()+"!"+fReset);
                System.out.println(player.getCurrentRoom().getDescription());
                newLine();
                System.out.println(red+"In this room there is som items you can take:"+fReset);
                System.out.println(player.getCurrentRoom().getLoot());
                //System.out.println("Loot: " + player.getCurrentRoom().getLoot());
            }
            //Help command
            else if (input.equalsIgnoreCase("help")) {
                help();
            }
            else if (input.equalsIgnoreCase("story")) {
                theStory();
            }
            // Exit command
            else if (input.equalsIgnoreCase("exit")) {
                System.out.println(" You have ended the game");
                break;
            }
            // Show inventory
            else if (input.equalsIgnoreCase("inventory") || input.equalsIgnoreCase("inv")) {
                System.out.println("Inventory:\n" + player.getInventory());
            }
            // Take item
            //String item = input.substring(input.indexOf(" ")+1);
            else if (input.startsWith("take ")) {
                String lastWord = input.substring(5);
                player.takeItem(lastWord);


                //String lastWord = input.substring(input.lastIndexOf(" ")+1);
            } else if (input.equalsIgnoreCase("take")) {
                System.out.println(red + "----------------------------------------" + fReset);
                System.out.println(red+"In this room you find:"+fReset);
                player.getCurrentRoom().showLoot();
                System.out.println(yellow + "----------------------------------------" + fReset);
                System.out.println("What would you like to pick up?");
                itemName = scan.nextLine();
                // itemName.toLowerCase(Locale.ROOT);
                player.takeItem(itemName);

            }
            // Drop item

            else if (input.startsWith("drop ")) {
                String lastword = input.substring(5);
                player.dropItem(lastword);

            } else if (input.equalsIgnoreCase("drop")) {
                player.getInventory();
                System.out.println("Which item would you like to drop?");
                itemName = scan.nextLine().toLowerCase().trim();
                player.dropItem(itemName);

            }
            // Equip
            else if (input.startsWith("equip ")) {
                String lastword = input.substring(5);
                player.equipItem(lastword);

            } else if (input.equalsIgnoreCase("equip")) {
                System.out.println("What would you like to equip?" +
                    "\n" + player.getInventory());
                itemName = scan.nextLine();
                player.equipItem(itemName);


            //reloade, tager ammo fra inventory og adder til currentWepon i player

            } else if (input.equalsIgnoreCase("reload") || input.equals("Reload")) {
                player.reload();
            }
            // Eat
            else if (input.startsWith("eat ")) {
                String lastword = input.substring(5);
                player.eatFood(lastword);

            } else if (input.equalsIgnoreCase("eat") || input.equals("Eat")) {
                System.out.println("What would you like to consume?" +
                    "\n" + player.getInventory());
                itemName = scan.nextLine();
                player.eatFood(itemName);


                //TODO: lav en ny block til check wepon.
                //TODO:   take ammo funktion til til inventorry,
                //TODO: reload, lægges i current wepon.


            } else if (input.equalsIgnoreCase("attack") || input.equals("Attack")) {
                if (player.currentWeapon != null) {
                    player.playerAttack();


                } else {
                    System.out.println("You haven't equipped anything");
                }

            }


            // Show Health
            else if (input.equalsIgnoreCase("health") || input.equalsIgnoreCase("hp")) {
                player.showHealth();


// vi vil gerne lave sådan at skrive rman noget andet skriver den dette. men den kommer ikke emd i loopet.
            }
            else if (input.equalsIgnoreCase(("info"))) {
                System.out.println("PlayerName: " + player.getPlayerName());
                System.out.println("HP: " + player.getPlayerHealth());
                System.out.println("Weapon: " + player.currentWeapon);
                System.out.println("Dmg: " + player.getDamage());

            } else {
                System.out.println("Invalid command");

            }




        } while (!input.equals("exit"));
    }





    public void go(Direction direction) {
        Room weWantToGo = null;

        if (direction == Direction.NORTH) {
            weWantToGo = player.getCurrentRoom().getNorth();

        } else if (direction == Direction.EAST) {
            weWantToGo = player.getCurrentRoom().getEast();
        } else if (direction == Direction.WEST) {
            weWantToGo = player.getCurrentRoom().getWest();
        } else if (direction == Direction.SOUTH) {
            weWantToGo = player.getCurrentRoom().getSouth();

        }
        if (weWantToGo != null) {
            player.setCurrentRoom(weWantToGo);
            System.out.println("You are in " + player.getCurrentRoom());


        } else {
            System.out.println("A horde of zombies.." + red + "LOOK OUT!" +
                    "\nOUCH!" + fReset);
            System.out.println("Wrong way, please try again!");

            ZombieHorde();
            hordeSounds();

        }
    }
    // Start

    //Help command
    public void help() {
        System.out.println("                  ----------------------------------------------");
        System.out.println(yellow + "                                   \tOPTIONS:" + fReset);
        newLine();
        System.out.println("Type: " +blue + "go north, go east, go south, go west" + fReset + " OR" + blue + " north, east, south, west" + fReset + "...To choose directions");
        System.out.println("Type: " +blue + "look" + fReset + "...............................................................To check your current location");
        System.out.println("Type: " +blue + "inventory/inv" + fReset + "......................................................To see whats in your backpack");
        System.out.println("Type: " +blue + "take"+fReset+"/"+blue+"drop" + fReset + "..........................................................To add or remove items in your inventory");
        System.out.println("Type: " +blue + "equip" + fReset + "..............................................................To use weapon");
        System.out.println("Type: " +blue + "reload" + fReset + ".............................................................To reload your gun, if you have bullets in your inventory");
        System.out.println("Type: " +blue + "story" + fReset + "..............................................................To read the storyline");
        System.out.println("Type: " +blue + "info" + fReset + "...............................................................To check your characters status");
        System.out.println("Type: " +blue + "attack" + fReset + ".............................................................To attack zombies");
        System.out.println("Type: " +blue + "health/hp" + fReset + "..........................................................To check how much HP you have");
        System.out.println("Type: " +blue + "eat/consume" + fReset + "........................................................To eat or drink the food you have in your inventory");
        System.out.println("Type: " +red + "exit" + fReset + "...............................................................To quit game");
    }
}

