package com.company;

public class Weapon extends Item {

    public Weapon(String name, int damage) {
        super(name);
        this.setDamage(damage);
    }

    public void setDamage(int damage) {
    }

    @Override
    public int getDamage() {
        return super.getDamage();
    }

    public String toString() {
        return this.getName();
    }
}