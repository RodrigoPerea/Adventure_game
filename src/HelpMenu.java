public class HelpMenu {
  private void newLine(){
    System.out.println();
  }


  public class HelpStringBuilder {
    public String red = "\u001B[31m";
    public String fReset = "\u001B[0m";
    public String green = "\u001B[32m";
    public String blue = "\u001B[34m";
    public String yellow = "\u001B[33m";
    public String magenta = "\u001B[35m";

    public String build() {
      String str = new String();


      newLine();
      System.out.println(red + "THE STORY" + fReset);
      System.out.println("   We are in 2023, and the world leaders of the superpowers have ended up in a war with chemical weapons.\n"
          + "   Now the human race has begun to mutate, and become carnivorous, and aggressive.\n" +
          "   You were in a large mall when the attacks took place, seeking shelter in the parking basement.\n" +
          "   You have heard via a car radio that the military has begun evacuating to a safe zone.\n" +
          "   You therefore have to go up to the roof, of the mall so they can pick you up by helicopter.\n" +
          "   But be careful, because you must not be bitten or attacked by the mutations.");
      newLine();
      System.out.println("............................................................");
      System.out.println("   NAVIGATION");
      newLine();
      System.out.println("   You navigate around the " + yellow + "The New World" + fReset + " by typing on the keybord.");
      newLine();
      System.out.println("   Type: |" + blue + " go north " + fReset + "| to move north");
      System.out.println("   Type: |" + blue + " go east " + fReset + " | to move east");
      System.out.println("   Type: |" + blue + " go south " + fReset + "| to move south");
      System.out.println("   Type: |" + blue + " go west " + fReset + " | to move west");
      newLine();
      System.out.println("\n   EXSTRA COMANDS:");
      System.out.println("   ............................................");
      System.out.println("   Type: |" + blue + " look " + fReset + "| See whats in the room");
      System.out.println("   Type: |" + blue + " help " + fReset + "| Go to the help menu");
      System.out.println("   Type: |" + blue + " exit " + fReset + "| To exit the game");
      newLine();
      System.out.println(red + "   Continue to find a safe to the roof! TYPE HERE" + fReset);
      newLine();
      newLine();
      newLine();
      return str;

    }

  }
  }
