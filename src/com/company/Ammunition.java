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
  /*public String toString(int ammunition) {
    return System.out.printf("%10d",);
  }

   */
}
