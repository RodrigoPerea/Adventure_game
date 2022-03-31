package com.company;

public class Enemy {
    private  String enemyName;
    private  int zumbiDamage;
    private  String enemydescription;
    private int enemyHelth;
    private int enemyAttack;
    Player player = new Player();


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