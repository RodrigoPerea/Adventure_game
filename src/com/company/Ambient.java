package com.company;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Ambient {

    public void musicStart() {
        playingMusic("DeadCenter.wav");
    }

    public static void playingMusic(String filepath) {

        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(
                    new File(filepath)
            );
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
            clip.loop(5);


            Thread.sleep(100);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}