package com.company;
import java.util.ArrayList;

public class Room {

    private Room north, east, south, west;
    private ArrayList<Item> loot;
    //Directions to navigate room
    private String name;
    private String description;
    // Constructor

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        loot = new ArrayList<Item>();
    }
    public boolean removeItem(String itemName) {
        for (Item item : loot) {
            if (item.getName().equals(itemName)) {
                getLoot().remove(item);
                return true; // if the item exists
            }
        }
        return false; // if the item doesn't exist
    }

    public ArrayList<Item> getLoot() {
        return loot;
    }

    public void addItem(Item item) {
        loot.add(item);
    }

    public String getName() {
        return this.name;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public Room getNorth() {
        return north;
    }

    public Room getEast() {
        return east;
    }

    public Room getSouth() {
        return south;
    }

    public Room getWest() {
        return west;
    }

    public String getDescription() {
        return description;
    }

    public void showLoot() {
        System.out.println(loot.toString());
    }
    public String toString() {
        return this.name;
    }

    public ArrayList<Item> loot() {
        return loot;
    }
    public Item findItemRoom(String itemName) {

        for (Item item : loot) {
            if (item.getName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }
}