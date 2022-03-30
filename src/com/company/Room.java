package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class Room {

    private Room north, east, south, west;
    private ArrayList<Item> loot;
    //Directions to navigate room
    private String name;
    private String description;
    private int noOfZom;



    // Constructor


    public Room(String name, String description, int noOfZom) {
        this.name = name;
        this.description = description;
        loot = new ArrayList<Item>();
        this.noOfZom = noOfZom;


    }
    public boolean removeItem(String itemName) {
        for (Item item : loot) {
            if (item.getName().equals(itemName)) {
                //etLoot().remove(item);
                loot.remove(item);
                return true; // if the item exists
            }
        }
        return false; // if the item doesn't exist
    }
public ArrayList<Item> getLoot(){
        return loot;
}

//TODO: Denne her har jeg fikset udskrif af vores arrayliste. Laver dem på de andre senere.
    public String showLoot() {
        StringBuilder tekst = new StringBuilder();
        for (Item item: loot){
            tekst.append(item.getName()).append("\n");
        }
       return tekst.toString();
    }

    public void addItem(Item item) {
        loot.add(item);
    }

    public String getName() {
        return this.name;
    }

    public void addEnemies(Enemies enemies) {
        
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