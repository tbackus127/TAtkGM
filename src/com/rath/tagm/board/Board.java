package com.rath.tagm.board;

import com.rath.tagm.gamestate.PlayState;
import com.rath.tagm.metrics.RuleSet;
import com.rath.tagm.util.Coord;

/**
 * This class contains panel and play area information for the game.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class Board {

  /** The panel grid. */
  private final Panel[][] panels;

  /** The current game's rule set. */
  private final RuleSet rules;

  /**
   * Default constructor.
   * 
   * @param ps the game state that needs this Board object constructed.
   */
  public Board(final RuleSet rs) {
    this.rules = rs;
    this.panels = rules.getInitialPanelConfig();
  }

  /**
   * Gets a panel at the specified coordinate.
   * 
   * @param c the Coord object with the x/y value to get.
   * @return a Panel object with the panel's data.
   */
  public Panel getPanelAt(final Coord c) {

    return this.panels[c.getX()][c.getY()];
  }

  /**
   * Drops a garbage block at the specified location.
   * 
   * @param startX the horizontal starting position for the leftmost panel for this garbage block.
   * @param len the length of the garbage block.
   */
  public void dropGarbage(final int startX, final int len) {

    // TODO this
  }

  public void setPanelAt(final Coord c, final Panel p) {

    this.panels[c.getX()][c.getY()] = p;
  }

  public void tickPanels() {

    for (int i = 0; i < panels.length; i++) {
      for (int j = 0; j < panels[i].length; j++) {
        panels[i][j].tick();
      }
    }
  }

}
