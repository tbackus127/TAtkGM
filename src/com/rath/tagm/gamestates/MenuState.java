
package com.rath.tagm.gamestates;

import java.util.List;

import com.rath.tagm.menu.Controllable;
import com.rath.tagm.menu.MenuSegue;

/**
 * A base class for menu scenes.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public abstract class MenuState extends GameState implements Controllable {
  
  /** A list of entries in this menu. */
  protected final List<MenuSegue> entries;
  
  /**
   * Default constructor.
   * 
   * @param en the List of MenuEntry objects.
   */
  protected MenuState(final List<MenuSegue> en) {
    this.entries = en;
  }
  
  /**
   * Gets the list of entries.
   * 
   * @return the List of MenuEntry objects.
   */
  public List<MenuSegue> getEntries() {
    return this.entries;
  }
  
}
