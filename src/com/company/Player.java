package com.company;

import java.util.ArrayList;

public class Player {

  // Instance variables
  private String playerName;
  private int playerHealth;
  private ArrayList<Item> inventory;
  //private ArrayList<Item> food;
  private Room currentRoom;
  Item currentItem;
  Weapon currentWeapon;
  private int damage;
  Ammunition ammonition;
  //Ammunition reloade;
  //Weapon ammo;

  // Defining Player() constructor
  public Player() {
    this.playerName = "";
    this.playerHealth = 100;
    inventory = new ArrayList<>();
  }

  public boolean playerCheckItem(Item itemName) {
    for (Item item : inventory) {
      if (inventory.equals(itemName)) {
        return true; // if the item exists
      }
    }
    return false; // if the item doesn't exist
  }

  // Take item
  public void takeItem(String itemName) {
    boolean itemCheck = false;
    for (int i = 0; i < currentRoom.getLoot().size(); i++) {
      currentItem = currentRoom.getLoot().get(i);
      if (currentItem.getName().equals(itemName)) {
        inventory.add(currentItem);
        getCurrentRoom().getLoot().remove(i);
        System.out.println("You've picked up: " + currentItem);
        itemCheck = true;
      }
    }
    if (!itemCheck) {
      System.out.println("There is no item with that name here");
    }
  }

  // Drop item
  public void dropItem(String itemName) {
    boolean itemCheck = false;
    for (int i = 0; i < inventory.size(); i++) {
      currentItem = inventory.get(i);
      if (inventory.get(i).getName().equalsIgnoreCase(itemName)) {
        inventory.remove(i);
        getCurrentRoom().getLoot().add(currentItem);
        System.out.println("You've dropped: '" + currentItem + "' in " + currentRoom);
      }
    }
  }

  // Health
  public void showHealth() {
    if (playerHealth == 100) {
      System.out.println("You're HP is full" +
              "\n Player HP: " + playerHealth);
    } else if (playerHealth > 25 && playerHealth < 50) {
      System.out.println(" Player HP: " + playerHealth);
    } else if (playerHealth < 25) {
      System.out.println("You are low on HP! " +
              "\n Player HP: " + playerHealth);
    }

  }


  public void addHealth(int addHealth) {
    this.playerHealth = this.playerHealth + addHealth;
    if (playerHealth > 100) { // PlayerHP limit is 100
      this.playerHealth = 100;
    }
  }






  // Forsøg på at reloade, tilføje det til curent room, og fjerne fra inventorry.
  public void reload() {
    boolean itemCheck = false;
    for (int i = 0; i < inventory.size(); i++) {
      if (inventory.get(i) instanceof Ammunition) {
        Ammunition potentialAmmonition = (Ammunition) inventory.get(i);
        if (potentialAmmonition.getAmmunition() > 0 && currentWeapon instanceof RangedWeapon) {
          ((RangedWeapon)currentWeapon).addAmmo(potentialAmmonition);

          inventory.remove(ammonition);
         // setAmmonition(currentWeapon);
          System.out.println("You have reloaded. You have now " + ammonition + " in your gun. Attack agin to shoot");
        }
        if (!itemCheck) {
          System.out.println("You have no ammunition. find somthing and try agin");
        }
      }
    }
  }







      //TODO: få sout ny ammo status efter hvert attack

  public void playerAttack(){
    currentWeapon.attack();
    System.out.println("you have used:" + damage);

  }

  public void equipItem(String itemName) {
    boolean itemCheck = false;
    for (int i = 0; i < inventory.size(); i++) {

      if (inventory.get(i) instanceof Weapon) {
        Weapon potentionWepon = (Weapon) inventory.get(i);


        if (potentionWepon.getName().equalsIgnoreCase(itemName)) {
          currentWeapon = (Weapon) inventory.get(i);
          setDamage(currentWeapon.getDamage());
          System.out.println("You've equipped: " + currentWeapon +
                  "\n Current damage: " + getDamage());
          itemCheck = true;
        }

      }

    }if (!itemCheck) {
      System.out.println("You can't equip that!");

    }
  }



  public void eatFood(String foodName) {
    boolean foodCheck = true;
    for (int i = 0; i < inventory.size(); i++) {
      if (inventory.get(i) instanceof Food || inventory.get(i) instanceof Liquid ) {
        addHealth(( inventory.get(i)).getHealthPoints()); // Adding health when eating
        System.out.println("You ate: " + foodName + "\nYour current health is: " + getPlayerHealth());
      }
      inventory.remove(i);
      foodCheck = false;

    }
    if (foodCheck) {
      System.out.println("You can't eat that!");

    }
  }



  public void setDamage(int damage) {
    this.damage = currentWeapon.getDamage();
  }

  public int getDamage() {
    return damage;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public String getPlayerName() {
    return playerName;
  }

  public void setPlayerHealth(int playerHealth) {
    this.playerHealth = playerHealth;
  }

  public int getPlayerHealth() {
    return playerHealth;
  }

  public void setInventory(ArrayList<Item> inventory) {
    this.inventory = inventory;
  }

  public ArrayList<Item> getInventory() {
    return inventory;
  }

  public void setCurrentRoom(Room currentRoom) {
    this.currentRoom = currentRoom;
  }

  public Room getCurrentRoom() {
    return currentRoom;
  }

  public Ammunition getAmmunition(){
    return ammonition;
  }

  public void setAmmunition(){

  }

}