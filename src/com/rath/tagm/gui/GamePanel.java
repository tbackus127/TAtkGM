
package com.rath.tagm.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JPanel;

import com.rath.tagm.audio.AudioType;
import com.rath.tagm.gamestates.GameState;
import com.rath.tagm.gamestates.TitleScreenState;
import com.rath.tagm.img.SpriteRegistry;
import com.rath.tagm.img.SpriteType;
import com.rath.tagm.util.ConfigFetcher;
import com.rath.tagm.util.ThemeFileFetcher;

/**
 * The rendering area of the window.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class GamePanel extends JPanel {

  /** Serial UID. */
  private static final long serialVersionUID = 1L;

  /** The starting state of this game. */
  private final GameState DEFAULT_STATE = new TitleScreenState(this);

  /** The current state of the game. */
  private GameState state;

  /**
   * Creates a new panel with the specified state.
   * 
   * @param s the GameState to set the panel to.
   */
  public GamePanel() {
    super();
    this.state = DEFAULT_STATE;
    setBackground(Color.RED);

    final String theme = ConfigFetcher.getValue("theme");
    final ThemeFileFetcher tff = new ThemeFileFetcher(theme);
    try {
      loadSprites(tff);
      loadAudio(tff);
    } catch (IOException e) {
      e.printStackTrace();
    }
    // setup tick timer here
  }

  /**
   * Changes the state to the given state.
   * 
   * @param st the GameState to set the current to.
   */
  public void changeState(final GameState st) {

    this.state = st;
  }

  @Override
  public void paintComponent(Graphics g) {

    this.state.draw(g);
  }

  private static final void loadSprites(final ThemeFileFetcher tff) throws IOException {

    for (SpriteType st : SpriteType.values()) {
      SpriteRegistry.loadSprite(tff, st.getFileName());
    }
  }

  private static final void loadAudio(final ThemeFileFetcher tff) throws IOException {

    
    for (AudioType at : AudioType.values()) {
      
    }

  }

}
