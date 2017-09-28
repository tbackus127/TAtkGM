
package com.rath.tagm.board;

import com.rath.tagm.gamemodes.RuleSet;
import com.rath.tagm.gamestates.PlayState;
import com.rath.tagm.util.Coord;

public class Board {
  
  private final Panel[][] panels;
  private final RuleSet rules;
  
  public Board(final PlayState ps) {
    rules = ps.getRuleSet();
    this.panels = rules.getInitialPanelConfig();
  }
  
  public Panel getPanelAt(final Coord c) {
    
    return this.panels[c.getX()][c.getY()];
  }
  
  public void dropGarbage(final int startX, final int len) {
    // TODO this
  }
  
  public void setPanelAt(final Coord c, final Panel p) {
    
    this.panels[c.getX()][c.getY()] = p;
  }
  
  public void swapPanelsAt(final Coord c) {
    final int x = c.getX();
    final int x2 = (x < panels[0].length - 1) ? x + 1 : 0;
    final int y = c.getY();
    final Panel temp = panels[x][y];
    panels[x][y] = panels[x2][y];
    panels[x2][y] = temp;
  }
  
  public void tickPanels() {
    for (int i = 0; i < panels.length; i++) {
      for (int j = 0; j < panels[i].length; j++) {
        panels[i][j].tick();
      }
    }
  }
  
}
