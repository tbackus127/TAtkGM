package com.rath.tagm.board;

import com.rath.tagm.gamestate.PlayState;
import com.rath.tagm.gamestate.RuleSet;
import com.rath.tagm.util.Coord;

public class Board {

  private final Panel[][] panels;

  public Board(final PlayState ps) {
    final RuleSet rules = ps.getRuleSet();
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
  
  public void tickPanels() {
    for(int i = 0; i < panels.length; i++) {
      for(int j = 0; j < panels[i].length; j++) {
        panels[i][j].tick();
      }
    }
  }

}
