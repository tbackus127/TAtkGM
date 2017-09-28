
package com.rath.tagm.gamemodes;

import com.rath.tagm.board.Panel;
import com.rath.tagm.util.PanelRandomizer;

public class ClassicRuleSet extends RuleSet {
  
  private static final int PANELS_X = 6;
  private static final int PANELS_Y = 12;
  
  @Override
  public Panel[][] getInitialPanelConfig() {
    return PanelRandomizer.getRandomInitialConfig(PANELS_X, PANELS_Y, 6);
  }
  
}
