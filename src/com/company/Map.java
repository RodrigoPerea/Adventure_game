package com.company;

public class Map {


    public Room starterRoom;
    private Room d1, d2, d3, d4, d5, d6, d7, d8, d9;

    public String red = "\u001B[31m";
    public String fReset = "\u001B[0m";
    public String green = "\u001B[32m";
    public String blue = "\u001B[34m";
    public String yellow = "\u001B[33m";
    public String magenta = "\u001B[35m";
    private Item items[];

    public Map() {
        setupMap();
    }

    public void setupMap(){ // Names and descriptions
        d1 = new Room("The Parking Basement", "\nthere is a few zombies walking around\n" +
                "shhh be quiet or they will see you!");

        d2 = new Room("The 1st Floor", "\nIt smells like death...\n" +
                "You look over towards the dinning area and see a someone laying over a dead corpse\n" +
                red + "WATCH OUT IT'S A ZOMBIE " + fReset + "be quiet so it dosen't see you!");

        d3 = new Room("KFC", "\n\"You are now hiding behind the counter, one of the zombie followed you" +
                "\nMove on quick.....but quite!!");

        d4 = new Room("The 2nd Floor", "\nyou are too exposed here in the hallway. the corridor is dark, and the light is broken, and hanging from the seal...blinking.\n" +
                "You hear some weird noises coming from somewhere in the halls.\n" +
                "You spot a giant zombie wandering the hallway. Better move on quick");

        d5 = new Room("The Roof", "\nyou have finally arrived you spot the heliport, you hear zombies coming from downstairs.\n" +
                "defend yourself till the helicopter is arriving");

        d6 = new Room("The Brook Staircase", "\nThe staircase must have collapsed under the attacks");

        d7 = new Room("The TAAS Shop", "\nThere are a American Football section");

        d8 = new Room("The Staircase to the Roof", "\nThere is a Zombie as huge as a tank blocking the way, \n" +
                "find something to deal with him");

        d9 = new Room("The OUTDOOR911", "\nYou found the hunting section, maybe there is something usefully");

        // Starter room
        starterRoom = d1;

        // Room 1
        d1.setEast(d2);
        d1.setSouth(d4);
        // Room 2
        d2.setWest(d1);
        d2.setEast(d3);
        // Room 3
        d3.setWest(d2);
        d3.setSouth(d6);
        // Room 4
        d4.setNorth(d1);
        d4.setSouth(d7);
        // Room 5
        d5.setSouth(d8);
        // Room 6
        d6.setNorth(d3);

        // Room 7
        d7.setNorth(d4);
        d7.setEast(d8);
        // Room 8
        d8.setNorth(d5);
        d8.setWest(d7);
        d8.setEast(d9);
        // Room 9
        d9.setWest(d8);

        addItems();
    }
    // Items
    Item burger = new Food("Burger", 15, 1);
    Item soda = new Food("Soda", 5, 1);
    Item rottenTomato = new Food("Rotten Tomato", -25, 1);
    Item rustyKnife = new MeleeWeapon("Rusty Knife", 15);
    Item huntingRifle = new ShootingWeapon("Hunting Rifle",30,4);
    Item healthPotion = new Food("Health Potion", 35, 1);

    // Add item
    public void addItems() {
        //Room 1
        d1.addItem(rustyKnife);
        d1.addItem(rottenTomato);
        //Room 2
        d2.addItem(rottenTomato);
        d2.addItem(burger);
        d2.addItem(soda);
        //Room 3
        d3.addItem(soda);
        //Room 4
        d4.addItem(healthPotion);
        d4.addItem(burger);
        //Room 5
        //Room 6
        d6.addItem(burger);
        d6.addItem(healthPotion);
        //Room 7
        d7.addItem(soda);
        //Room 8
        d8.addItem(healthPotion);
        //Room 9
        d9.addItem(huntingRifle);


    }
}
