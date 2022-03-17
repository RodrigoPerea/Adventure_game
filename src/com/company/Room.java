package com.company;


import java.util.ArrayList;

public class Room {

    private String name;
    private String description;

    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private ArrayList<Item> items = new ArrayList<>();

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        north = null;
        east = null;
        west = null;
        south = null;
        ArrayList<Item> items = null;

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


    public void setItems(Item item) {
        this.items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;

    }
}