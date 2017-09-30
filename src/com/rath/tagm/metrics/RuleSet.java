package com.rath.tagm.metrics;

import com.rath.tagm.board.Panel;
import com.rath.tagm.util.Direction;

public abstract class RuleSet {
  
  public abstract Panel[][] getInitialPanelConfig();
  public abstract int getInitialScore();
  public abstract GameTime getInitialTime();
  public abstract Direction getTimeDirection();
  public abstract int getInitialStackShiftDelay();
  public abstract int getInitialStackShiftAmount();
  public abstract SpeedCurve getSpeedCurve();
  
}
