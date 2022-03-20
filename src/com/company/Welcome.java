package com.company;


public class Welcome {

    public String red = "\u001B[31m";
    public String fReset = "\u001B[0m";
    public String green = "\u001B[32m";
    public String blue = "\u001B[34m";
    public String yellow = "\u001B[33m";
    public String magenta = "\u001B[35m";




    private void newLine() {
        System.out.println();
    }



    public void welcomeMessage(){


        System.out.println(" ");
        System.out.println(magenta + "\n" +
                "██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗    ████████╗ ██████╗     ████████╗██╗  ██╗███████╗    ██████╗ ███████╗ █████╗ ██████╗      ██████╗███████╗███╗   ██╗████████╗███████╗██████╗ \n" +
                "██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝    ╚══██╔══╝██╔═══██╗    ╚══██╔══╝██║  ██║██╔════╝    ██╔══██╗██╔════╝██╔══██╗██╔══██╗    ██╔════╝██╔════╝████╗  ██║╚══██╔══╝██╔════╝██╔══██╗\n" +
                "██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗         ██║   ██║   ██║       ██║   ███████║█████╗      ██║  ██║█████╗  ███████║██║  ██║    ██║     █████╗  ██╔██╗ ██║   ██║   █████╗  ██████╔╝\n" +
                "██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝         ██║   ██║   ██║       ██║   ██╔══██║██╔══╝      ██║  ██║██╔══╝  ██╔══██║██║  ██║    ██║     ██╔══╝  ██║╚██╗██║   ██║   ██╔══╝  ██╔══██╗\n" +
                "╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗       ██║   ╚██████╔╝       ██║   ██║  ██║███████╗    ██████╔╝███████╗██║  ██║██████╔╝    ╚██████╗███████╗██║ ╚████║   ██║   ███████╗██║  ██║\n" +
                " ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝       ╚═╝    ╚═════╝        ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚═════╝ ╚══════╝╚═╝  ╚═╝╚═════╝      ╚═════╝╚══════╝╚═╝  ╚═══╝   ╚═╝   ╚══════╝╚═╝  ╚═╝\n" +
                "                                                                                                                                                                                                            \n" + fReset);
        System.out.println("We are in 2023, and the world leaders of the superpowers have ended up in a war with chemical weapons.\n"
                + "Now the human race has begun to mutate, and become carnivorous, and aggressive.\n" +
                "You were in a large shopping center when the attacks took place, seeking shelter in the parking basement.\n" +
                "You have heard via a car radio that the military has begun evacuating to a safe zone.\n" +
                "You therefore have to go up to the roof, of the mall so they can pick you up by helicopter.\n" +
                "But be careful, because you must not be bitten or attacked by the infected.");
        newLine();
        System.out.println("Your task now is to find your way to the roof of the rescue helicopter. " +
                "You navigate around the Center by typing:\n" +
                blue + "\"go west\" " + fReset + "or " + blue + "go north " + fReset + "or " + blue + "go south" + fReset + " or " + blue + "go east.\n" + fReset +
                "Along the way, you can find items to combat the mutations.\n");

    }
}