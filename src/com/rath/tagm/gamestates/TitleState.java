
package com.rath.tagm.gamestates;

import com.rath.tagm.gui.GamePanel;
import com.rath.tagm.menu.Controllable;

/**
 * A base class for titles, splash screens, and other miscellaneous states.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public abstract class TitleState extends GameState implements Controllable {

  protected TitleState(GamePanel p) {
    super(p);
  }
}
