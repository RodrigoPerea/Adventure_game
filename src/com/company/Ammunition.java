package com.company;

public class Ammunition extends RangedWeapon {
  private int ammunition;

  public Ammunition(String name, int damage, int ammo) {
    super(name, damage, ammo);
    this.ammunition = ammunition;
  }
  public int getAmmunition(int ammo){
    return ammunition;
  }
}