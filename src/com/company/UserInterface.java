package com.company;

public class UserInterface {


  public void welcomeMessage() {
    Welcome welcome = new Welcome();
    welcome.welcomeMessage();

  }

  public void EkstraCommands() {
    EkstraCommands commands = new EkstraCommands();
    commands.EkstraCommands();
  }

  public void mainMenu() {

    welcomeMessage();
    EkstraCommands();
    GameControls();

  }

  public void GameControls() {
    GameControls controls = new GameControls();
    controls.Controls();

  }
}