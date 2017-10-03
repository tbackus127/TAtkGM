
package com.rath.tagm.menu;

/**
 * An interface for anything controllable in this game.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public interface Controllable {
  
  /** What should happen when the player presses the UP key. */
  public void onUp();
  
  /** What should happen when the player presses the DOWN key. */
  public void onDown();
  
  /** What should happen when the player presses the LEFT key. */
  public void onLeft();
  
  /** What should happen when the player presses the RIGHT key. */
  public void onRight();
  
  /** What should happen when the player presses the SELECT key. */
  public void onSelect();
  
  /** What should happen when the player presses the BACK key. */
  public void onBack();
  
}
