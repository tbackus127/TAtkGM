
package com.rath.tagm.menu;

import com.rath.tagm.gamestates.GameState;

/**
 * A menu entry that changes the game's state when selected.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public class MenuSegue extends MenuEntry {
  
  /** The state to change to when this is selected. */
  private final GameState nextState;
  
  /**
   * Default constructor.
   * 
   * @param t the label for this entry.
   * @param n the state to change to.
   */
  public MenuSegue(final String t, final GameState n) {
    super(t);
    this.nextState = n;
  }
  
  /**
   * Gets the state to change to.
   * 
   * @return a GameState to set the current state to.
   */
  public GameState getNextState() {
    
    return nextState;
  }
}
