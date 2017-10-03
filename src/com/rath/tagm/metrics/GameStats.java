
package com.rath.tagm.metrics;

import com.rath.tagm.util.Direction;

/**
 * Gameplay data, such as score, current time, speed level, etc.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public class GameStats {
  
  /** The current time. */
  private final GameTime time;
  
  /** The player's current score. */
  private int score;
  
  /** The current ticks before a stack raise. */
  private int stackShiftDelay;
  
  /** The current number of pixels the stack will raise. */
  private int stackShiftAmount;
  
  /**
   * Default constructor.
   * 
   * @param rs the RuleSet to initialize the stats by.
   */
  public GameStats(final RuleSet rs) {
    this.time = new GameTime();
    this.score = 0;
    this.stackShiftDelay = rs.getInitialStackShiftDelay();
    this.stackShiftAmount = rs.getInitialStackShiftAmount();
  }
  
  /**
   * Ticks the time up or down.
   * 
   * @param dir The direction to tick the timer, either Direction.UP or Direction.DOWN.
   */
  public void tickTime(final Direction dir) {
    if (dir == Direction.UP || dir == Direction.DOWN) {
      this.time.tick(dir);
    }
  }
  
  /**
   * Gets the current time game time.
   * 
   * @return a GameTime object with four components: hours, minutes, seconds, and ticks.
   */
  public GameTime getTime() {
    
    return this.time;
  }
  
  /**
   * Gets the player's current score.
   * 
   * @return an int.
   */
  public int getScore() {
    
    return this.score;
  }
  
  /**
   * Gets the number of ticks before a stack raise.
   * 
   * @return an int.
   */
  public int getStackShiftDelay() {
    
    return this.stackShiftDelay;
  }
  
  /**
   * Gets the number of pixels the stack will automatically raise.
   * 
   * @return an int.
   */
  public int getStackShiftAmount() {
    
    return this.stackShiftAmount;
  }
  
}
