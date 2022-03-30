package com.company;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class FootstepsSFX {

    public void FootstepsStart() {
        playingMusic("C:\\Users\\simon\\Desktop\\Zombie\\footsteps-4.wav");
    }

    public static void playingMusic(String filepath) {
        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(
                    new File(filepath)
            );
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();

            Thread.sleep(100);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}