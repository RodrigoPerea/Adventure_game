package com.company;

public class Main {

  public static int main(String[] args) {

    Menu run = new Menu();

    run.mainMenu();
    // opretter rummene, me dhvilken værdi det er mulgit at flytte.
    Room room1 = new Room(null, 2, 3, null);
    Room room2 = new Room(null, 2, 3, 4);
    Room room3 = new Room(null, null, 3, 4);
    Room room4 = new Room(1, 2, 3, null);
    Room room5 = new Room(1, 2, 3, 4);
    Room room6 = new Room(1, null, 3, 4);
    Room room7 = new Room(1, 2, null, null);
    Room room8 = new Room(1, 2, null, 4);
    Room room9 = new Room(1, null, null, 4);
    int player = 1;
    player = currentRoom(player);

  }

      private static int currentRoom ( int player){
        return player;
      }
    }

