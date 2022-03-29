package com.company;


public class RangedWeapon extends Weapon {
    private int ammo;

    public RangedWeapon(String name, int damage, int ammo) {
        super(name, damage);
        this.ammo = ammo;

    }

    public int attack() {
        if (ammo > 0) {
            ammo = ammo - 1;
            return damage;
        } else  {
            System.out.println("you have no ammo");
            return 0;
        }
    }

    public int getAmmo(){
        return ammo;
    }


    public void addAmmo(Ammunition ammunition) {
        this.ammo += ammunition.getAmmunition();
    }
}