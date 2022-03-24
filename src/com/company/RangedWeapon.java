package com.company;


public class RangedWeapon extends Weapon {
    private int ammo;

    public RangedWeapon(String name, int damage, int ammo) {
        super(name, damage);
        this.ammo = ammo;

    }
    public int getAmmo(){
        return ammo;
    }




}