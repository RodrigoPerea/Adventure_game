package com.company;

public class Enemy {
    private  String enemyName;
    private  int zumbiDamage;
    private  String enemydescription;
    private int enemyHelth;
    private int enemyAttack;
    Player player = new Player();
    public String red = "\u001B[31m";
    public String fReset = "\u001B[0m";
    public String yellow = "\u001B[33m"; //TODO: tilføjet
    public String green = "\u001B[32m";

    public Enemy(String name, String zumbiDescription, int health, int enemyAttck) {
        enemyName = name;
        enemydescription = zumbiDescription;
        enemyHelth = health;
        this.enemyAttack= enemyAttack;



    }


    //TODO:metode der modtager et Weapon som parameter -
    // og så skal den enemy selv ændre sin egen health med det damage den får fra det weapon.


/*
    public Weapon hiByPlayer(){

        return hitByWepon;
    }

 */





    public int getEnemyHelth() {
        return enemyHelth;
    }


    public void setEnemyHelth(int enemyHelth) {
        this.enemyHelth = enemyHelth;

    }

    public String getEnemyName(){ //TODO: ny til enemis
        return enemyName;
    }

    public int getDamage() {
        return zumbiDamage;

    }

    public void enemyAttack (){
        player.newrollerValue();
        if (player.getDicValue() > 2){
        player.setPlayerHealth(player.getPlayerHealth() - zumbiDamage);
        System.out.println("enemy attack back. you lost" + player.getPlayerHealth() + " HP");
        if (player.getPlayerHealth() <= 0) {
            player.gameover();
        }else if (player.getDicValue()<4)
            System.out.println(green+"You avoided the zombie bite this time!"+fReset);
        } else
            System.out.println(green + "You got luckey, your still alive! The Zombie missed you." + fReset);
    }







    public String getEnemydescription() {
        return enemydescription;
    }

    public void setEnemyAttack(int enemyAttack){
        this.enemyAttack = enemyAttack;
    }

    public int getEnemyAttack(){
        return enemyAttack;
    }

    @Override
    public String toString() {
        //return enemyName + " " + description;
        StringBuilder tekst = new StringBuilder();
        tekst.append(getEnemydescription()).append("\n");
        return "This is an " + enemyName + "\nIts HP is now " + getEnemyHelth()+"."; //TODO: ændret til enemys


    }





}