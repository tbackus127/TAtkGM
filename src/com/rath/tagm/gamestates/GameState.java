
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
  
  /** The number of ticks that have elapsed thus far. */
  protected int tickCount;

  /**
   * Constructor called by child classes.
   * 
   * @param panel reference to the GamePanel running this state.
   */
  protected GameState(final GamePanel panel) {
    this.gamePanel = panel;
    this.tickCount = 0;
  }

  /** Perform calculations and updates. */
  public synchronized void doGameTick() {
    this.tickCount++;
  };

  /** Render the scene. */
  public abstract void draw(Graphics g);

}
