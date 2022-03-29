package com.company;

public class Ammunition extends Item {
  private int ammunition;


  public Ammunition(String name, int ammo) {
    super(name);
    this.ammunition = ammo;
  }

  public int getAmmunition() {
    return ammunition;
  }


 // @Override
  public String toString() {
    return ammunition +" bullets";

  }


}
