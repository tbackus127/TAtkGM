
package com.rath.tagm.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.rath.tagm.audio.AudioType;
import com.rath.tagm.audio.ClipType;
import com.rath.tagm.img.SpriteType;

/**
 * This class handles fetching certain files in a given theme folder.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class ThemeFileFetcher {

  /** The default theme to use when none is given. */
  private static final String DEFAULT_THEME = "default";

  /** The current theme name. */
  private String theme;

  /**
   * Default constructor. Sets the theme to the default theme.
   */
  public ThemeFileFetcher() {
    this(DEFAULT_THEME);
  }

  /**
   * Sets the default theme to the one specified.
   * 
   * @param themeName the theme name to create this fetcher with.
   */
  public ThemeFileFetcher(final String themeName) {
    this.setTheme(themeName);
  }

  /**
   * Loads a given audio clip from a theme directory.
   * 
   * @param audioName the type of clip to load.
   * @return the pre-loaded audio data as a Clip object.
   * @throws UnsupportedAudioFileException if the audio file is unsupported.
   * @throws IOException if the file is missing, unreadable, or corrupt.
   * @throws LineUnavailableException if the audio line is unavailable.
   */
  public Clip getAudioClip(final AudioType audioType, final ClipType audioName) {

    final File audioFile = new File(
        "../themes/" + this.theme + "/snd/" + audioType.getDirectoryName() + "/" + audioName + ".wav");

    AudioInputStream ais;
    try {
      ais = AudioSystem.getAudioInputStream(audioFile);
    } catch (UnsupportedAudioFileException e) {
      System.err.println("Unsupported audio file \"" + audioFile + "\".");
      return null;
    } catch (IOException e) {
      System.err.println("Cannot find audio file \"" + audioFile + "\".");
      return null;
    }

    Clip result;
    try {
      result = AudioSystem.getClip();
    } catch (LineUnavailableException e) {
      System.err.println("Line unavailable.");
      return null;
    }
    try {
      result.open(ais);
    } catch (LineUnavailableException e) {
      System.err.println("Line unavailable.");
      return null;
    } catch (IOException e) {
      System.err.println("Cannot open audio file \"" + audioFile + "\".");
      return null;
    }
    return result;
  }

  /**
   * Loads a given image from a theme directory.
   * 
   * @param imageName the name of the image to load.
   * @return the pre-loaded image as a BufferedImage.
   */
  public BufferedImage getImageFile(final SpriteType type) {

    final File imageFile = new File("Themes/" + theme + "/img/" + type.getFileName());
    DP.l(imageFile.getAbsolutePath());
    BufferedImage result = null;
    try {
      result = ImageIO.read(imageFile);
    } catch (IOException e) {
      System.err.println("Can't find image file \"" + imageFile + "\".");
    }
    return result;
  }

  /**
   * Gets the current theme.
   * 
   * @return the theme name as a String.
   */
  public String getTheme() {

    return this.theme;
  }

  /**
   * Sets the current theme.
   * 
   * @param theme the new theme to fetch files from.
   */
  public void setTheme(String theme) {

    this.theme = theme;
  }

}
