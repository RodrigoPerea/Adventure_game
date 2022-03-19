package com.company;

import java.util.ArrayList;

public class Player {
  public String red = "\u001B[31m";
  public String fReset = "\u001B[0m";
  public String green = "\u001B[32m";
  public String blue = "\u001B[34m";
  public String yellow = "\u001B[33m";
  public String magenta = "\u001B[35m";
  private Room currentRoom;
  private ArrayList<Item> inventoryList = new ArrayList<>();

  public Item findItemRoom(String itemName) {

    for (Item item : currentRoom.getItems()) {
      if (item.getName().equals(itemName)) {
        return item;
      }
    }
    return null;
  }


  public void setCurrentRoom(Room currentRoom) {
    this.currentRoom = currentRoom;
  }

  public Room getCurrentRoom() {
    return currentRoom;
  }
  public void viewinventoryList() {
    System.out.println("Your Inventory list");
    System.out.println();
    if(inventoryList.size()==0)
      System.out.println("No Item in Inventory");
    else {
      for(int i = 0 ; i < inventoryList.size(); i++)
        System.out.println(i + "  " + inventoryList.get(i));
    }
    System.out.println();
  }


  public void movePlayer(String direction) {
    currentRoom = findNewRoom(direction);
    checkForNull(currentRoom, direction);
  }
  public void picUpItem(Item item){
    inventoryList.add(item);
  }
  public void dropItem(Item item){
    inventoryList.remove(item);
  }

/*
    System.out.println("Type"+blue+"take"+fReset+" to pic up item and add to your inventory.");
    if (choice.equals("take")) {
      System.out.println("Item now added to you inventory.");
      inventoryList.add(takke);
    }
  }



 */



  public ArrayList<Item> getInventoryList() {
    return inventoryList;
  }

  public void checkForNull(Room dungeon, String direction) {

    if (dungeon == null) {
      System.out.println("A horde of zombies.." + red + "LOOK OUT!" +
          "\nOUCH!" + fReset);
      System.out.println("Wrong way, please try again!");
    } else {
      System.out.println("Going " + direction);
      currentRoom = dungeon;
    }
  }

  public Room findNewRoom(String direction){

    if(direction.equals("go north")) {
      return currentRoom.getNorth();
    } else if (direction.equals("go south")) {
      return currentRoom.getSouth();
    } else if (direction.equals("go east")) {
      return currentRoom.getEast();
    } else if (direction.equals("go west")) {
      return currentRoom.getWest();
    } return null;
  }
}





