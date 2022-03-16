package com.company;

import java.util.Scanner;

public class Adventure {


  public void welcomeMessage() {
    Welcome welcome = new Welcome();
    welcome.welcomeMessage();

  }

  public void EkstraCommands() {
    EkstraCommands commands = new EkstraCommands();
    commands.EkstraCommands();
  }

  public void Menu() {
    Menu menu = new Menu();
    menu.Menu();
  }

  public void mainMenu() {

    welcomeMessage();
    EkstraCommands();
    Menu();

  }

  public static void main(String[] args) {

    Adventure adventure = new Adventure();
    // starter spillet
    adventure.mainMenu();

  }
}