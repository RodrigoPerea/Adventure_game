package com.company;


public class ShootingWeapon extends Weapon {
    private int ammo;

    public ShootingWeapon(String name, int damage, int ammo) {
        super(name, damage);
        this.ammo = ammo;
    }

    @Override
    public int getDamage() {
        return super.getDamage();
    }
}