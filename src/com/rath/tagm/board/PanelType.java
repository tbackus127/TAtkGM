
package com.rath.tagm.board;

/**
 * This enum covers the types of Panels available in the game.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public enum PanelType {
  
  /** This is a standard Panel that can be swapped normally. */
  NORMAL,
  
  /** This Panel can be matched normally, but creates shock garbage instead of normal garbage. */
  SHOCK,
  
  /**
   * This Panel is not affected by gravity, and turns into normal panels when a match from normal panels or clearing
   * garbage panels touches it.
   */
  GARBAGE,
  
  /**
   * A special type of garbage that is only cleared by matching normal panels or clearing shock garbage panels that
   * touch it.
   */
  SHOCK_GARBAGE
}
