
package com.rath.tagm.metrics;

import com.rath.tagm.util.Direction;

/**
 * This class contains the current game time with four components: hours, minutes, seconds, and ticks.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public class GameTime {
  
  /** The maximum number of hours to track. */
  private static final int MAX_HOURS = 99;
  
  /** Game ticks. */
  private int ticks;
  
  /** Seconds (60 ticks). */
  private int seconds;
  
  /** Minutes. */
  private int minutes;
  
  /** Hours. */
  private int hours;
  
  /**
   * Initializes the time to a specific point.
   * 
   * @param h hours.
   * @param m minutes.
   * @param s seconds.
   * @param t ticks.
   */
  public GameTime(final int h, final int m, final int s, final int t) {
    this.hours = h;
    this.minutes = m;
    this.seconds = s;
    this.ticks = t;
  }
  
  /**
   * Default constructor. Initializes the time to 00:00:00.00.
   */
  public GameTime() {
    this(0, 0, 0, 0);
  }
  
  /**
   * Ticks the time in a certain direction.
   * 
   * @param dir the Direction to tick - either UP or DOWN.
   */
  public void tick(final Direction dir) {
    
    switch (dir) {
      case UP:
        tickUp();
      break;
      case DOWN:
        tickDown();
      default:
      break;
    }
  }
  
  /**
   * Decreases the timer by a tick.
   */
  private void tickDown() {
    
    // TODO: This
    
  }
  
  /**
   * Increases the timer by a tick.
   */
  private void tickUp() {
    
    if (ticks >= 59) {
      
      if (seconds >= 59) {
        
        if (minutes >= 59) {
          
          if (hours < MAX_HOURS) {
            hours++;
            minutes = 0;
            seconds = 0;
            ticks = 0;
          }
          
        } else {
          minutes++;
          seconds = 0;
          ticks = 0;
        }
      } else {
        seconds++;
        ticks = 0;
      }
    } else {
      ticks++;
    }
  }
  
  /**
   * Checks if the time has run out.
   * 
   * @return true if the time is 00:00:00.00, false if not.
   */
  public boolean isZero() {
    
    return (ticks & seconds & minutes & hours) == 0;
  }
  
  /**
   * Gets the ticks component.
   * 
   * @return an int.
   */
  public int getTicks() {
    
    return ticks;
  }
  
  /**
   * Gets the seconds component.
   * 
   * @return an int.
   */
  public int getSeconds() {
    
    return seconds;
  }
  
  /**
   * Gets the minutes component.
   * 
   * @return an int.
   */
  public int getMinutes() {
    
    return minutes;
  }
  
  /**
   * Gets the hours component.
   * 
   * @return an int.
   */
  public int getHours() {
    
    return hours;
  }
}
