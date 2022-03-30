package com.company;

public class Enemies {
    private  String enemyName;
    private  int zumbiDamage;
    private  String description;
    private int currentHealth;
    private int playerAttackPoint;


    public Enemies(String name, String zumbiDescription,  int health, int zumbiHitsPower) {
        enemyName = name;
        description = zumbiDescription;
        currentHealth = health;
        zumbiDamage = zumbiHitsPower;



    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getDamage() {
        return zumbiDamage;

    }

    public String getEnemyName(){
        return enemyName;
    }
    public String getDescription() {
        return description;
    }

    public int getPlayerAttackPoint() {
        return playerAttackPoint;
    }

    public boolean isAlive(){
        return playerAttackPoint > 0;
    }

    @Override
    public String toString() {
        return enemyName + " " + description;
        //return "Name: " + enemyName + " Health: " + getCurrentHealth();
    }


}