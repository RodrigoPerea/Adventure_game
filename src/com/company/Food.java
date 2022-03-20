package com.company;

public class Food extends Item{

    public Food(String name, int healthPoints, int weight) {
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