package com.company;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Player {
  public String red = "\u001B[31m";
  public String fReset = "\u001B[0m";
  public String yellow = "\u001B[33m"; //TODO: tilføjet
  public String green = "\u001B[32m";
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
  private int dicValue; //TODO: til kamp
  Enemy currentEnemy;
  //Enemy enemyAttack;
  // Enemy currentEnemy; //TODO: tilføjet
  //Enemy enemyDamage;
  //Enemy hitByWepon;
  //Enemy enemyhp;


  //Ammunition reloade;
  //Weapon ammo;

  // Defining Player() constructor
  public Player() {
    this.playerName = "";
    this.playerHealth = 100;
    inventory = new ArrayList<>();
    this.damage = damage;
    //this.enemyAttack = enemyAttack;



  }
  public void newrollerValue (){
    this.dicValue = ThreadLocalRandom.current().nextInt(1,7);}

  //TODO: ville lave en is dead, som bare tjekerk om hp er under 0, så den kan komme ind . lykkeds ikke.
  public boolean isDead() {
    return getPlayerHealth() <= 0;
  }


  public void playerAttack() {
    System.out.println(dicValue);
    if (currentRoom.getEnemy().size() == 0) {
      System.out.println("nothing to attack here");
    } else{
      newrollerValue();
      if (dicValue>4){
        System.out.println(dicValue);
      for (int i = 0; i < currentRoom.getEnemy().size(); i++) {
        currentEnemy = currentRoom.getEnemy().get(i);
        currentWeapon.attack();
        currentEnemy.setEnemyHelth(currentEnemy.getEnemyHelth() - damage);
        System.out.println(red + "You have done " + damage + " HP damge on this zombie!" + fReset + "\nThe zombi have now " + currentEnemy.getEnemyHelth() + " left.");
        System.out.println(currentWeapon);


        if (currentEnemy.getEnemyHelth() <= 0) {
          currentRoom.getEnemy().remove(currentEnemy);
          System.out.println(red + "The zombie is dead!" + fReset);
        }

        if (playerHealth <= 0) {
          System.out.println(red + "The zombie got you. You got killed" + fReset);
          gameover();
        } else {
          currentEnemy.enemyAttack();
        }
      }
      }else
        System.out.println("The zombie was too fast and avoid your attack!");
  }

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







  public void reload() {
    boolean itemCheck = false;
    for (int i = 0; i < inventory.size(); i++) {
      if (inventory.get(i) instanceof Ammunition) {
        Ammunition potentialAmmonition = (Ammunition) inventory.get(i);
        if (potentialAmmonition.getAmmunition() > 0 && currentWeapon instanceof RangedWeapon) {
          ((RangedWeapon)currentWeapon).addAmmo(potentialAmmonition);

          inventory.remove(ammonition);
         // setAmmonition(currentWeapon);
          System.out.println("You have reloaded. You now have " + ammonition + " in your gun. Attack again to shoot");
        }
        if (!itemCheck) {
          System.out.println("You have no ammunition. find something and try again");
        }
      }
    }
  }







  public int getDicValue() { //TODO Ny til kamp
    return dicValue;
  }


  public void createValue () {
    this.dicValue = ThreadLocalRandom.current().nextInt(1, 7);
  }


  public void equipItem(String itemName) {
    boolean itemCheck = false;
    for (int i = 0; i < inventory.size(); i++) {

      if (inventory.get(i) instanceof Weapon) {
        Weapon potentialWeapon = (Weapon) inventory.get(i);


        if (potentialWeapon.getName().equalsIgnoreCase(itemName)) {
          currentWeapon = (Weapon) inventory.get(i);
          setDamage(currentWeapon.getDamage());
          System.out.println("You've equipped a " + currentWeapon +
                  "\nThis will make " + getDamage()+" HP damage to the zombis!");
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

  //TODO tilføjet
  public void gameover() {
    System.out.println(red+"Sorry "+playerName + ", but you Died!\n"+fReset) ;
    System.out.println(yellow+"GAME OVER!"+fReset);
    System.exit(0);
    return;
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



/*
  public boolean isAlive() {
    return playerAttackPoints > 0;
  }

 */


}