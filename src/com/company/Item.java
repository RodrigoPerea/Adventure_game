package com.company;

public abstract class Item {

  private String name;
  private String description;
  private int weight;
  private int healthPoints;
  //private int damage;

  public Item(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getWeight() {
    return weight;
  }

  public void setHealthPoints(int healthPoints) {
    this.healthPoints = healthPoints;
  }
  public int getHealthPoints() {
    return healthPoints;
  }


  /*
  public void setDamage(int damage) {
    this.damage = damage;
  }
  public int getDamage() {
    return damage;
  }
   */
}