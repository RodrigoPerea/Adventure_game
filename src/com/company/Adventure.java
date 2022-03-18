package com.company;

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
    UserInterface userInterface = new UserInterface();
    userInterface.Menu();
  }

  public void mainMenu() {

    welcomeMessage();
    EkstraCommands();
    Menu();

  }

  public static void main(String[] args) {
RunGame rungame = new  RunGame();
    Adventure adventure = new Adventure();
    // starter spillet
    adventure.mainMenu();

  }
}