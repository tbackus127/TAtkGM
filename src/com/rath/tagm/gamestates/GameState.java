
package com.rath.tagm.gamestates;

import java.awt.Graphics;

import com.rath.tagm.gui.GamePanel;

/**
 * A base class for different states of the game.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public abstract class GameState {

  /** A handle to the GamePanel to allow the state to change. */
  protected final GamePanel gamePanel;

  /**
   * Constructor called by child classes.
   * 
   * @param panel reference to the GamePanel running this state.
   */
  protected GameState(final GamePanel panel) {
    this.gamePanel = panel;
  }

  /** Perform calculations and updates. */
  public abstract void doGameTick();

  /** Render the scene. */
  public abstract void draw(Graphics g);

}
