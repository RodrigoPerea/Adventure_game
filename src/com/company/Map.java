package com.company;

import java.util.ArrayList;

public class Map {

    public String red = "\u001B[31m";
    public String fReset = "\u001B[0m";
    public String green = "\u001B[32m";
    public String blue = "\u001B[34m";
    public String yellow = "\u001B[33m";
    public String magenta = "\u001B[35m";
    private Room currentRoom;
    private Items items[];

    //public void setCurrentRoom(Room starterRoom){
   // return ;
//}
    public Room getStarterRoom( ) {
        return currentRoom;

    }

        public void makeDungeons() {
        items = new Items[3];


            items[0] = new Items("a gun", "shoot zombies, and your self if it gets too far!");
            items[1] = new Items("fork", "eat food, but not much more. its usless");
            items[2] = new Items("slippers", "avoid walk barefoot");
            items[3] = new Items("slippers", "avoid walk barefoot");
            items[4] = new Items("slippers", "avoid walk barefoot");
            items[5] = new Items("slippers", "avoid walk barefoot");
            items[6] = new Items("slippers", "avoid walk barefoot");
            items[7] = new Items("slippers", "avoid walk barefoot");
            items[8] = new Items("slippers", "avoid walk barefoot");
            items[9] = new Items("slippers", "avoid walk barefoot");
            items[10] = new Items("slippers", "avoid walk barefoot");
            items[11] = new Items("slippers", "avoid walk barefoot");

            Room dungeon1 = new Room(magenta + "You are in the parking basement!", fReset + "Here in the basement, there is a few zombies walk around\n" +
                    "shhh be quiet or they will see you!");
            dungeon1.addObject(items[0]);
            dungeon1.addObject(items[1]);
            System.out.println(dungeon1.getItems());


            Room dungeon2 = new Room(magenta + "You found some stairs, and are on the first floor!", fReset + "You found the stairs, and went upstairs.\n" +
                    "You are now on the first floor, and it smells like death\n" +
                    "You look over towards the dinning area and see a something laying over a dead corpse\n" +
                    red + "WATCH OUT IT'S A ZOMBIE " + fReset);
            dungeon2.addObject(items[2]);
            dungeon2.addObject(items[3]);
            System.out.println(dungeon2.getItems());

            Room dungeon3 = new Room(magenta + "You are in one of the restaurants in the mall!", fReset + "You are now hiding coss one of the zombie followed you, but luckily have lost track of you.\n" +
                    "You look for a knife but all you can find is a frying pan.\nMove on quick.....but quite!!");
            dungeon3.addObject(items[4]);
            dungeon3.addObject(items[5]);
            System.out.println(dungeon3.getItems());

            Room dungeon4 = new Room(magenta + "You found some stairs, and are now on the second floor in the hallway.", fReset + "you are too exposed here in the hallway. the corridor is dark, and the light is broken, and hangning from the seal...blinking.\n" + //ændret, da man jo også kan gå ned igen cr
                    "You hear some weird noises coming from somewhere in the halls.\n" +
                    "You spot a giant zombie wandering the hallway. Better move on quick, or do something else.");

            Room dungeon5 = new Room(magenta + "You are now on the roof, close to the helicopter-patch.", fReset + "You have finally arrived at the helicopter area. Try quick to block the door to the stairs, so you can wait for the helicopter.\n" +
                    "The zombies are trying to get through the door. What do you do now?");

            Room dungeon6 = new Room(magenta + "You are now at an unknown destroyed staircase.", fReset + "The staircase...? it looks like its destroyed by the attacks.\n" +
                    "You look around and spot a crate. Maybe you should look there to find something you can use to move on before someone hear you!");

            Room dungeon7 = new Room(magenta + "You are in a TAAS shop.", fReset + "You spot the american football section, maybe you should look for some football equipment for protection?");

            Room dungeon8 = new Room(magenta + "You at a dead end!", fReset + "A zombie, as huge as a tank, is blocking some stairs, that leads up to the roof. Find another way, or somthing to deal with the zombi.");

            Room dungeon9 = new Room(magenta + "You are in the OUTDOOR911.", fReset + "You found the hunting section. Maybe you should look for a rifle with a few shells?\n" +
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
    }

