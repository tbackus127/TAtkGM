
package com.rath.tagm.audio;

import java.io.IOException;
import java.util.HashMap;

import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.rath.tagm.util.ThemeFileFetcher;

/**
 * This class handles playing audio.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public class ClipPlayer {
  
  /** The map of clip names to the pre-loaded sound clip. */
  private final HashMap<ClipType, Clip> clipMap;
  
  /**
   * Default constructor.
   * 
   * @param audioType the type of audio this player will handle (sound effects, music, etc.).
   * @throws UnsupportedAudioFileException if the audio file is unsupported.
   * @throws IOException if the file is missing, unreadable, or corrupt.
   * @throws LineUnavailableException if the audio line is unavailable.
   */
  public ClipPlayer(final String themeName, final String audioType)
      throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    clipMap = buildClipMap(themeName, audioType);
  }
  
  /**
   * Plays an audio clip without first rewinding.
   * 
   * @param t the type of clip to play as a ClipType value.
   */
  public final void play(final ClipType t) {
    this.clipMap.get(t).start();
  }
  
  /**
   * Plays an audio clip from the beginning.
   * 
   * @param t the type of clip to replay as a ClipType value.
   */
  public final void replay(final ClipType t) {
    final Clip c = this.clipMap.get(t);
    c.setFramePosition(0);
    c.start();
  }
  
  /**
   * Stops an already-playing audio clip.
   * 
   * @param t the type of clip to stop as a ClipType value.
   */
  public final void stop(final ClipType t) {
    final Clip c = this.clipMap.get(t);
    c.stop();
    c.setFramePosition(0);
  }
  
  /**
   * Loads the clip map from audio files stored on the disk.
   * 
   * @param audioType the type of clip to play as a ClipType value.
   * @return a HashMap mapping the clip type to its pre-loaded Clip object.
   * @throws UnsupportedAudioFileException if the audio file is unsupported.
   * @throws IOException if the file is missing, unreadable, or corrupt.
   * @throws LineUnavailableException if the audio line is unavailable.
   */
  private final HashMap<ClipType, Clip> buildClipMap(final String themeName, final String audioType)
      throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    
    final HashMap<ClipType, Clip> result = new HashMap<ClipType, Clip>();
    ThemeFileFetcher fetcher = new ThemeFileFetcher(themeName);
    
    for (ClipType t : ClipType.values()) {
      result.put(t, fetcher.getAudioClip(t));
    }
    
    return result;
    
  }
}
