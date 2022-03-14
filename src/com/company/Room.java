package com.company;

import com.company.Main;
import java.util.Scanner;

public class Room {

  // attributs
  private Room north;
  private Room east;
  private Room west;
  private Room south;
  private String name;
  private String descrption;

  //konstruktør
  public void setEast(Room room) {
    this.east = room;
  }
public void setNorth (Room room){
    this.north = room;
}
public void setSouth(Room room){
    this.south = room;
}
public void setWest (Room room){
    this.west = room;
}
  public Room(String name, String descetption) {
    this.name = name;
    this.descrption = descetption;


  }
}
