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


    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        north = null;
        east = null;
        west = null;
        south = null;

        items = new ArrayList<>();
    }
    public void addObject(Items item) {
        items.add(item);
    }

    public void viewRoomContent() {
        System.out.print("You have found");
        if (items.size() == 0)
            System.out.println("No artifacts around you!");
        else {

            for (int i = 0; i < items.size(); i++){
                System.out.println(i + "  " + items.get(i).getName());
            System.out.println(i + " use it" + items.get(i).getItemDescription());
        }
        }
        System.out.println();
    }

    public ArrayList<Items> getItems(ArrayList items) {
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
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public String getDescription() {
        return description;
    }

    public void setItems(Items item) {
        this.items.add(item);
    }

    public ArrayList<Items> getItems() {
        return items;

    }
}





 /*

    public ArrayList<Items> getItemsArrayList() {
        return itemsArrayList;
    }



    /*


        public void dropObject(Items item) {
            itemsArrayList.remove(item);
        }


        public void setItemsArrayList(ArrayList<Items> itemsArrayList) {
            this.itemsArrayList = itemsArrayList;
        }




    */
