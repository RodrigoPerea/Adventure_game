package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
  public String red = "\u001B[31m";
  public String fReset = "\u001B[0m";
  public String green = "\u001B[32m";
  public String blue = "\u001B[34m";
  public String yellow = "\u001B[33m";
  public String magenta = "\u001B[35m";
  private Room currentRoom;
  private ArrayList<Items> itemsArrayList = new ArrayList<>();


  public void setCurrentRoom(Room currentRoom) {
    this.currentRoom = currentRoom;
  }
/*
  public Room getCurrentRoom() {
    return currentRoom;
  }

 */

  public String movePlayer(String direction) {
    Room nextRoom = findNewRoom(direction);
    return checkForNull(nextRoom, direction);
  }

  public void picUpItem (Items take) {
    Scanner choice = new Scanner(System.in);
    if (choice.equals("take")) {
      System.out.println("You pick up ");
      itemsArrayList.add(take);
    }
  }

      public void droppItem (Items item){
        Scanner choice = new Scanner(System.in);
        if (choice.equals("take")) {
          System.out.println("is now droppd");
          itemsArrayList.remove(item);
        }
  }



  public String checkForNull(Room dungeon, String direction) {

    if (dungeon == null) {
      System.out.println("A horde of zombies.." + red + "LOOK OUT!" +
          "\nOUCH!" + fReset);
      System.out.println("Wrong way, please try again!");
    } else {
      System.out.println("Going " + direction);
      currentRoom = dungeon;
    }
    return direction;
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





