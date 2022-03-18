package com.company;

public class Player {
  public String red = "\u001B[31m";
  public String fReset = "\u001B[0m";
  public String green = "\u001B[32m";
  public String blue = "\u001B[34m";
  public String yellow = "\u001B[33m";
  public String magenta = "\u001B[35m";
  private Room currentRoom;


  public void setCurrentRoom(Room currentRoom) {
    this.currentRoom = currentRoom;
  }

  public Room getCurrentRoom() {
    return currentRoom;
  }

  public String movePlayer(String direction) {
    Room nextRoom = findNewRoom(direction);
    return checkForNull(nextRoom, direction);
  }

  public String checkForNull(Room dungeon, String direction) {

    if (currentRoom == null) {
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

    if(direction.equals("north")) {
      return currentRoom.getNorth();
    } else if (direction.equals("south")) {
      return currentRoom.getSouth();
    } else if (direction.equals("east")) {
      return currentRoom.getEast();
    } else if (direction.equals("west")) {
      return currentRoom.getWest();
    } return null;
  }
}





