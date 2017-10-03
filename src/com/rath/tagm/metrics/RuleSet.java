
package com.rath.tagm.metrics;

import com.rath.tagm.board.Panel;
import com.rath.tagm.util.Direction;

/**
 * The collection of game rules for a game type.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public abstract class RuleSet {
  
  /** The initial panel configuration for this game type. */
  public abstract Panel[][] getInitialPanelConfig();
  
  /** The starting score for this game type. */
  public abstract int getInitialScore();
  
  /** The initial time for this game type. */
  public abstract GameTime getInitialTime();
  
  /** The direction the timer will count. */
  public abstract Direction getTimeDirection();
  
  /** The starting number of ticks before the stack raises. */
  public abstract int getInitialStackShiftDelay();
  
  /** The starting number of pixels the stack will raise. */
  public abstract int getInitialStackShiftAmount();
  
  /** The speed data for this game type. */
  public abstract SpeedCurve getSpeedCurve();
  
}
