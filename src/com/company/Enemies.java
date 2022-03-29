package com.company;

public class Enemies {
    private final String enemyName;
    private final int damage;

    private int currentHealth;

    public Enemies(String name, int health, int dmg) {
        enemyName = name;
        currentHealth = health;
        damage = dmg;

    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getDamage() {
        return damage;

    }

    public String getEnemyName(){
        return enemyName;
    }

    @Override
    public String toString() {
        return "Name: " + enemyName + " Health: " + getCurrentHealth();
    }
}