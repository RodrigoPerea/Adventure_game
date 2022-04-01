package com.company;

public abstract class Weapon extends Item {
    protected int damage;


    public Weapon(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    public int attack (){
        return damage;
    }

    public int  getDamage(){
        return damage;
    }

    public String toString() {
        return this.getName();
    }
}