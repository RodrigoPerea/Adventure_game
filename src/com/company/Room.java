package com.company;
import java.util.ArrayList;

public class Room {

    private Room north, east, south, west;
    private ArrayList<Item> loot;
    //Directions to navigate room
    private String name;
    private String description;
    private String enemyDescription;
    private ArrayList<Enemy> enemy;  //TODO: NY TIL FJENDER



    // Constructor


    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        loot = new ArrayList<Item>();
        enemy = new ArrayList<Enemy>();
        this.enemyDescription = enemyDescription;


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


    //TODO: til at vise enemy. looper gennem arralisten af enemys
    public String showEnemy() {
        StringBuilder tekst = new StringBuilder();
        for (Enemy enemy: enemy ){
            tekst.append(enemy.getEnemyName()).append("\n");
        }
        return tekst.toString();
    }
     
    //TODO: ny til enemy.
    public ArrayList<Enemy> getEnemy() {
        return enemy;
    }

    //TODO: nyn til enemies. tilføjer dem til arraylisten
    public void addEnemy( Enemy zombis ){
        enemy.add(zombis);
    }

    public void addItem(Item item) {
        loot.add(item);
    }

    public String getName() {
        return this.name;
    }
/*
    public void addEnemies(Enemy enemy) {
        
    }

 */




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

    //public ArrayList<Item> loot() {
        //return loot;
    //}
    public Item findItemRoom(String itemName) {

        for (Item item : loot) {
            if (item.getName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }

}