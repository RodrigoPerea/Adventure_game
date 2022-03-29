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

  public void musicAmbient() {
    Ambient song = new Ambient();
    song.musicStart();
  }

  public void mainMenu() {


    welcomeMessage();
    EkstraCommands();
    musicAmbient();
    GameControls();
  }

  public void GameControls() {
    GameControls controls = new GameControls();
    controls.Controls();

  }
}