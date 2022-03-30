package com.company;

import java.util.ArrayList;

public class Player {
  public String red = "\u001B[31m";
  public String fReset = "\u001B[0m";
  public String green = "\u001B[32m";
  // Instance variables
  private String playerName;
  private int playerHealth;
  private int playerAttackPoints; //TODO: lavet så vi kan sætte denn lig emd liv, så vi kan slutte spillet hvis en af dem ahr 0. dvs zombi dør elelr player dør.
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
    this.damage= damage;
    this.playerAttackPoints = getPlayerAttackPoints(); //TODO skal måske elelr burde kunne hentes fra current wepon
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
          System.out.println("You have reloaded. You now have " + ammonition + " in your gun. Attack again to shoot");
        }
        if (!itemCheck) {
          System.out.println("You have no ammunition. find something and try again");
        }
      }
    }
  }







      //TODO: få sout ny ammo status efter hvert attack
//TODO: har prøver at lægge HELE kampen her ind, så der er mindr ei game controle. Jeg overvejede faktsik, o
// vi ikek abre skulle gør det mega simpelt, og bruge Radom funktionen, lgie som med terning spillet? så
// kunne vi bare give en radom imellem 1&10, og slette alt havd våbenrrne kunne :D :D .
// evt bruge den tila t lade zombi dø, eller noget. det ville være mega nemt.lægge randomværdien til en
// attriut og tjekke med helth. men pt gør vi det her. tror ejg er godt på vej. vi skal abre have den tila t
// lægge det korrekt player attackpoints trtor jeg.

//
  public void playerAttack(Player player, Enemies enemis){

    while (player.isAlive() && enemis.isAlive()){
      currentWeapon.attack();
      enemis.setCurrentHealth(enemis.getCurrentHealth()-getPlayerAttackPoints());
      System.out.println(red+ "The zombie lost " + damage+ " damage!"+fReset);
      System.out.println("The zombia have now "+enemis.getCurrentHealth()+" helth left!");
      if (currentWeapon instanceof RangedWeapon){
        System.out.println("you have "+ ammonition+" letf in your gun");
      }else if (currentWeapon instanceof MeleeWeapon){
        System.out.println("Be carefull not to hit too hard, it might brake!!!");
      }
    } if (!player.isAlive()){
      System.out.println("You got eaten by hungry zombies.\n"+red+"GAME OVER"+fReset);
      System.exit(0);
    }else if (!enemis.isAlive()){
      System.out.println(green+"You killed the zombie. Welldome!!"+fReset);
    }
  }


  public void equipItem(String itemName) {
    boolean itemCheck = false;
    for (int i = 0; i < inventory.size(); i++) {

      if (inventory.get(i) instanceof Weapon) {
        Weapon potentialWeapon = (Weapon) inventory.get(i);


        if (potentialWeapon.getName().equalsIgnoreCase(itemName)) {
          currentWeapon = (Weapon) inventory.get(i);
          setDamage(currentWeapon.getDamage());
          System.out.println("You've equipped: " + currentWeapon +
                  "\nThis will make: " + getDamage()+"to the zombis");
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
//TODO: to sting i item (alle dem dder printe ud, og en to skring kalder i player
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

  public int getPlayerAttackPoints() {
    return playerAttackPoints;
  }

  public boolean isAlive() {
    return playerAttackPoints > 0;
  }


}