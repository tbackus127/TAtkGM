
package com.rath.tagm.metrics;

/**
 * This class contains the stack speed data.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public abstract class SpeedCurve {
  
  /**
   * Gets the number of ticks before the stack will raise automatically.
   * 
   * @param totalPanelPops the total amount of panels that have been cleared this game.
   * @return an int.
   */
  public abstract int getStackShiftDelay(final int totalPanelPops);
  
  /**
   * Gets the number of pixels the stack will shift when it raises automatically.
   * 
   * @param totalPanelPops the total amount of panels that have been cleared this game.
   * @return an int.
   */
  public abstract int getStackShiftAmount(final int totalPanelPops);
  
}
