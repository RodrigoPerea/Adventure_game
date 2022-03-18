package com.company;


import java.util.ArrayList;

public class Room {

    //List<String> inv;
    private String desription;
    private String name;
    private String description;

    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private ArrayList<Items> items = new ArrayList<>();
    String red = "\u001B[31m";
    public String fReset = "\u001B[0m";
    public String green = "\u001B[32m";
    public String blue = "\u001B[34m";
    public String yellow = "\u001B[33m";
    public String magenta = "\u001B[35m";






    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        /*
        north = null;
        east = null;
        west = null;
        south = null;

         */
        items = new ArrayList<>();
    }




    public void addObject(Items item) {
        items.add(item);
    }

    public void viewRoomContent() {
        if (items.size() == 0)
            System.out.println("No artifacts around you!");
        else {

            for (int i = 0; i < items.size(); i++){
                System.out.print( "There is a  " + items.get(i).getName()+" in his room.\n");
            System.out.print("Use it to " + items.get(i).getItemDescription());
            System.out.println("\nDo you wanna pic it up and add to your inventory?");
            break;

        }
        }
        System.out.println();
    }

    public void setItems(Items item) {
        this.items.add(item);
    }

    public ArrayList<Items> getItems() {
        return items;

    }

    public void setDescription(String aDescription) {
        this.description = aDescription;

    }


    public void setNorth(Room dungeon) {
        north = dungeon;
    }

    public Room getNorth() {
        return north;
    }

    public void setSouth(Room dungeon) {
        south = dungeon;
    }

    public Room getSouth() {
        return south;
    }

    public void setEast(Room dungeon) {
        east = dungeon;
    }

    public Room getEast() {
        return east;
    }

    public void setWest(Room dungeon) {
        west = dungeon;
    }

    public Room getWest() {
        return west;
    }

    public String getName() {
        return  name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public String getDescription() {
        return description;
    }


}





 /*

    public ArrayList<Items> getItemsArrayList() {
        return itemsArrayList;
    }



    /*





    */
