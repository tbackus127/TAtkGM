
package com.rath.tagm.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.rath.tagm.audio.BGMPlayer;
import com.rath.tagm.audio.SFXPlayer;
import com.rath.tagm.gamestates.GameState;
import com.rath.tagm.gamestates.TitleScreenState;
import com.rath.tagm.img.SpriteRegistry;
import com.rath.tagm.img.SpriteType;
import com.rath.tagm.util.ConfigFetcher;
import com.rath.tagm.util.DP;
import com.rath.tagm.util.ThemeFileFetcher;

/**
 * The rendering area of the window.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class GamePanel extends JPanel {

  /** The target number of frames per second. */
  private static final int TARGET_FRAMERATE = 60;

  /** Serial UID. */
  private static final long serialVersionUID = 1L;

  /** The starting state of this game. */
  private final GameState DEFAULT_STATE = new TitleScreenState(this);

  /** The current state of the game. */
  private GameState state;

  /** The tick timer. */
  private final Timer tickTimer;

  /**
   * Creates a new panel with the specified state.
   * 
   * @param s the GameState to set the panel to.
   */
  public GamePanel() {
    super();
    this.state = DEFAULT_STATE;
    setBackground(Color.RED);

    ConfigFetcher.buildMap();
    final String theme = ConfigFetcher.getValue("theme");
    DP.l("Theme is set to \"" + theme + "\".");
    final ThemeFileFetcher tff = new ThemeFileFetcher(theme);
    try {
      loadSprites(tff);
      loadAudio(tff);
    } catch (IOException e) {
      e.printStackTrace();
    }

    this.tickTimer = new Timer((int) (1000 / TARGET_FRAMERATE), new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {

        state.doGameTick();

      }

    });
  }

  /**
   * Changes the state to the given state without a transition.
   * 
   * @param st the GameState to set the current to.
   */
  public void changeState(final GameState st) {

    this.state = st;
  }

  /**
   * Performs a transition to the given game state.
   * 
   * @param newState the next GameState to start rendering and ticking after fading out/in.
   */
  public void transitionToState(final GameState newState) {
    // TODO: this
  }

  @Override
  public void paintComponent(Graphics g) {

    this.state.draw(g);
  }

  /**
   * Loads the current theme's sprites into memory.
   * 
   * @param tff the ThemeFileFetcher object already constructed with a theme folder to load from.
   * @throws IOException if the sprite's image file is not found.
   */
  private static final void loadSprites(final ThemeFileFetcher tff) throws IOException {

    for (SpriteType st : SpriteType.values()) {
      DP.l("Loading sprite " + st.getFileName());
      SpriteRegistry.loadSprite(tff, st);
    }
  }

  /**
   * Loads the current theme's audio clips into memory.
   * 
   * @param tff the ThemeFileFetcher object already constructed with a theme folder to load from.
   * @throws IOException if the audio file is not found.
   */
  private static final void loadAudio(final ThemeFileFetcher tff) throws IOException {

    try {
      BGMPlayer.buildClipMap(tff);
      SFXPlayer.buildClipMap(tff);
    } catch (UnsupportedAudioFileException e) {
      e.printStackTrace();
    } catch (LineUnavailableException e) {
      e.printStackTrace();
    }
  }

}
