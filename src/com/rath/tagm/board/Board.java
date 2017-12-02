
package com.rath.tagm.board;

import com.rath.tagm.metrics.GameStats;
import com.rath.tagm.metrics.RuleSet;
import com.rath.tagm.util.Coord;
import com.rath.tagm.util.PanelGenerator;

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
    this.panels = PanelGenerator.generateInitialLayout(this.rules, rules.getInitialPanelConfig());
  }

  /**
   * Gets the specified row of panels.
   * 
   * @param rowNum the row number (zero-indexed) to get.
   * @return a Panel array.
   */
  public final Panel[] getRow(final int rowNum) {

    return this.panels[rowNum];
  }

  /**
   * Adds a new row to the bottom of the stack while shifting the rest up.
   * 
   * @param row the row of panels to add as a Panel array.
   */
  public final void appendRow(final Panel[] row) {

    for (int i = 0; i < panels.length - 1; i++) {
      panels[i] = panels[i + 1];
    }
    panels[RuleSet.PLAY_AREA_HEIGHT - 1] = row;
  }

  /**
   * Gets a panel at the specified coordinate.
   * 
   * @param c the Coord object with the x/y value to get.
   * @return a Panel object with the panel's data.
   */
  public final Panel getPanelAt(final Coord c) {

    return this.panels[c.getX()][c.getY()];
  }

  /**
   * Drops a garbage block at the specified location.
   * 
   * @param startX the horizontal starting position for the leftmost panel for this garbage block.
   * @param len the length of the garbage block.
   */
  public final void dropGarbage(final int startX, final int len) {

    // TODO this
  }

  /**
   * Sets the panel at a given coordinate to another panel type.
   * 
   * @param c the Coord object containing the x and y values.
   * @param p the new type of Panel.
   */
  public final void setPanelAt(final Coord c, final Panel p) {

    this.panels[c.getX()][c.getY()] = p;
  }

  /**
   * Swaps two panels at a specified cursor position.
   * 
   * @param c the coordinate of the left panel in the swap.
   */
  public final void swapPanelsAt(final Coord c) {

    final int x = c.getX();
    final int x2 = (x < panels[0].length - 1) ? x + 1 : 0;
    final int y = c.getY();
    final Panel temp = panels[x][y];
    panels[x][y] = panels[x2][y];
    panels[x2][y] = temp;
  }

  /**
   * Advances the panels' animation timers.
   */
  public final void tickPanels() {

    for (int i = 0; i < panels.length; i++) {
      for (int j = 0; j < panels[i].length; j++) {
        panels[i][j].tick();
      }
    }
  }

  /**
   * Performs panel updates starting from where panels were swapped.
   * 
   * @param swapPos the position of the cursor where the panels were swapped.
   */
  private final void updatePanels(final Coord swapPos) {
    //TODO propogate panel changes from swap and tick accordingly
  }

  /**
   * Provides a way to get an ASCII representation of a row.
   * 
   * @param row the row of Panels as an array.
   * @return the String representation of the panels.
   */
  public static final String getRowString(final Panel[] row) {

    String result = "";
    for (int i = 0; i < row.length; i++) {
      result += row[i].getCharRepresentation();
    }
    return result;
  }

}
