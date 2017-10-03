
package com.rath.tagm.gamestates;

import java.awt.Graphics;

/**
 * A base class for different states of the game.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public abstract class GameState {
  
  /** Perform calculations and updates. */
  public abstract void doGameTick();
  
  /** Render the scene. */
  public abstract void draw(Graphics g);
  
}
