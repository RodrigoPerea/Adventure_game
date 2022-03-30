package com.company;

public class Story {

    public String red = "\u001B[31m";
    public String fReset = "\u001B[0m";
    public String green = "\u001B[32m";
    public String blue = "\u001B[34m";
    public String yellow = "\u001B[33m";
    public String magenta = "\u001B[35m";


    private void newLine() {
        System.out.println();
    }


    public void storyMessage() {


        System.out.println(green + "╔════════════════════════════════════════════════════STORY═════════════════════════════════════════════════════════╗" + fReset +
                "\n         We are in 2023, and the world leaders of the superpowers have ended up in a war with chemical weapons.\n"
                + "         Now the human race has begun to mutate, and become carnivorous, and aggressive.\n" +
                "         You were in a large shopping center when the attacks took place, seeking shelter in the parking basement.\n" +
                "         You have heard via a car radio that the military has begun evacuating to a safe zone.\n" +
                "         You therefore have to go up to the roof, of the mall so they can pick you up by helicopter.\n" +
                "         But be careful, because you must not be bitten or attacked by the infected.\n" +
                green + "╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝" + fReset);
        newLine();
    }
}
