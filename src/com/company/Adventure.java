package com.company;

import java.util.Scanner;

public class Adventure {

  public static void main(String[] args) {

    Adventure adventure = new Adventure();
    // starter spillet
    adventure.mainMenu();

  }
  public void welcomeMessage() {
    Welcome welcome = new Welcome();
    welcome.welcomeMessage();

  }

  public void EkstraCommands() {
    EkstraCommands commands = new EkstraCommands();
    commands.EkstraCommands();
  }

  public void Menu() {
    UserInterface menu = new UserInterface();
    menu.Menu();
  }

  public void mainMenu() {

    welcomeMessage();
    EkstraCommands();
    Menu();

  }

  }
