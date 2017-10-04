package com.rath.tagm.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ThemeFileFetcher {

  private static final String DEFAULT_THEME = "default";
  private String theme;

  public ThemeFileFetcher() {
    this(DEFAULT_THEME);
  }

  public ThemeFileFetcher(final String theme) {
    this.setTheme(theme);
  }

  /**
   * Loads and readies an audio clip to be played.
   * 
   * @param audioName
   * @return
   * @throws UnsupportedAudioFileException
   * @throws IOException
   * @throws LineUnavailableException
   */
  public Clip getAudioClip(final String audioName)
      throws UnsupportedAudioFileException, IOException, LineUnavailableException {

    final File audioFile = new File("../themes/" + this.theme + "/" + audioName + ".wav");
    final AudioInputStream ais = AudioSystem.getAudioInputStream(audioFile);
    final Clip result = AudioSystem.getClip();
    result.open(ais);
    
    // Use clip.setFramePosition(0) to rewind!
    
    return result;
  }

  public BufferedImage getImageFile(final String imageName) {

    return null;

  }

  public String getTheme() {

    return this.theme;
  }

  public void setTheme(String theme) {

    this.theme = theme;
  }

}
