package com.company;


import java.util.ArrayList;
import java.util.List;

public class Room {

    //List<String> inv;
    private String desription;
    private String name;
    private String description;
    private Room north;
    private Room south;
    private Room east;
    private Room west;


    //private String viewRoomContent;
    ArrayList<Items> items = new ArrayList<>();


    public Room(String name, String description) {
        this.name = name;
        this.description = description;
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

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;

    }


    public void setNorth(Room cave) {
        north = cave;
    }

    public Room getNorth() {
        return north;
    }

    public void setSouth(Room cave) {
        south = cave;
    }

    public Room getSouth() {
        return south;
    }

    public void setEast(Room cave) {
        east = cave;
    }

    public Room getEast() {
        return east;
    }

    public void setWest(Room cave) {
        west = cave;
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
