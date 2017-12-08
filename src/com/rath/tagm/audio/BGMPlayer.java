
package com.rath.tagm.audio;

import java.io.IOException;
import java.util.HashMap;

import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.rath.tagm.util.DP;
import com.rath.tagm.util.ThemeFileFetcher;

/**
 * This class handles playing audio.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class BGMPlayer {

  /** The map of clip names to the pre-loaded sound clip. */
  private static HashMap<ClipType, Clip> clipMap = new HashMap<ClipType, Clip>();

  /**
   * Loads the clip map from audio files stored on the disk.
   * 
   * @param tff a ThemeFileFetcher constructed with a given theme.
   * @return a HashMap mapping the clip type to its pre-loaded Clip object.
   * @throws UnsupportedAudioFileException if the audio file is unsupported.
   * @throws IOException if the file is missing, unreadable, or corrupt.
   * @throws LineUnavailableException if the audio line is unavailable.
   */
  public static final void buildClipMap(final ThemeFileFetcher tff) {

    for (ClipType t : ClipType.values()) {

      final Clip c = tff.getAudioClip(AudioType.BGM, t);

      if (c != null) {
        DP.l("Clip " + t + " registered.");
        clipMap.put(t, c);
      } else {
        System.err.println("Clip not registered.");
      }
    }

  }

  /**
   * Plays an audio clip without first rewinding.
   * 
   * @param t the type of clip to play as a ClipType value.
   */
  public static final void play(final ClipType t) {

    clipMap.get(t).start();
  }

  /**
   * Plays an audio clip from the beginning.
   * 
   * @param t the type of clip to replay as a ClipType value.
   */
  public static final void replay(final ClipType t) {

    final Clip c = clipMap.get(t);
    c.setFramePosition(0);
    c.start();
  }

  /**
   * Stops an already-playing audio clip.
   * 
   * @param t the type of clip to stop as a ClipType value.
   */
  public static final void stop(final ClipType t) {

    final Clip c = clipMap.get(t);
    c.stop();
    c.setFramePosition(0);
  }
}
