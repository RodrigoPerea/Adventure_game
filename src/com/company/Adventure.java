package com.company;

public class Adventure {


  //attributter
  //private String name; //evt. til senere brug
  // private String desception; //evt. til senere brug

  //private boolean yesNo;
  public Room currentRoom;


  public void rooms() {
    Room room1 = new Room("rum1", "beskrivelse1");
    Room room2 = new Room("rum2", "beskrivelse2");
    Room room3 = new Room("rum3", "beskrivelse3");
    Room room4 = new Room("rum4", "beskrivelse4");
    Room room5 = new Room("rum5", "beskrivelse5");
    Room room6 = new Room("rum6", "beskrivelse6");
    Room room7 = new Room("rum7", "beskrivelse7");
    Room room8 = new Room("rum8", "beskrivelse8");
    Room room9 = new Room("rum9", "beskrivelse9");

    //movement
    //room1
    room1.setEast(room2);
    room1.setSouth(room4);


    //room2
    room2.setEast(room3);
    room2.setWest(room1);

    //room3
    room3.setWest(room2);
    room3.setSouth(room6);

    //room4
    room4.setNorth(room1);
    room4.setSouth(room7);

    //room5
    room5.setSouth(room8);

    //room6
    room6.setNorth(room3);
    room6.setSouth(room9);

    //room7
    room7.setNorth(room4);
    room7.setEast(room8);

    //room8
    room8.setNorth(room5);
    room8.setEast(room9);
    room8.setWest(room7);

    //room9
    room9.setNorth(room6);
    room9.setWest(room8);
    currentRoom = room1;

    //currentRoom.getNorth();
    if (currentRoom.getNorth() != null) { //tjekker for om den er =null
      currentRoom = currentRoom.getNorth();//skiftet plads
    } else if (currentRoom.getSouth() != null) { //tjekker for om den er =null
      currentRoom = currentRoom.getSouth();//skiftet plads
    }  else if (currentRoom.getEast() != null) { //tjekker for om den er =null
      currentRoom = currentRoom.getEast();//skiftet plads
    } else if (currentRoom.getWest() != null) { //tjekker for om den er =null
      currentRoom = currentRoom.getWest();//skiftet plads
    } else {
      System.out.println("wrong way");
  }
      //hvis den er =null printer den dette.
}
}





