
package com.rath.tagm.gamestates;

import java.util.List;

import com.rath.tagm.gui.GamePanel;
import com.rath.tagm.menu.Controllable;
import com.rath.tagm.menu.MenuSegue;

/**
 * A base class for menu scenes.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public abstract class MenuState extends GameState implements Controllable {

  /** The currently selected menu option. */
  protected final int menuChoice;

  /** A list of entries in this menu. */
  protected final List<MenuSegue> entries;

  /**
   * Default constructor.
   * 
   * @param en the List of MenuEntry objects.
   */
  protected MenuState(final GamePanel p, final List<MenuSegue> en) {
    super(p);
    this.entries = en;
    this.menuChoice = 0;
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
