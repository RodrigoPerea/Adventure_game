package com.company;

public class Liquid extends Item{

    public Liquid(String name, int healthPoints, int weight) {
        super(name);
        this.setHealthPoints(healthPoints);
    }

    @Override
    public int getHealthPoints() {
        return super.getHealthPoints();
    }

    public String toString() {
        return this.getName();
    }
}