package com.rath.tagm.metrics;

import com.rath.tagm.board.Panel;
import com.rath.tagm.util.Direction;
import com.rath.tagm.util.PanelGenerator;

public class ClassicRuleSet extends RuleSet {

  private static final int SCORE = 0;
  private static final GameTime TIME = new GameTime(0, 0, 0, 0);
  private static final Direction DIR = Direction.UP;
  private static final SpeedCurve SPEED_CURVE = new ClassicSpeedCurve();
  private static final int SHIFT_AMOUNT = SPEED_CURVE.getStackShiftAmount(SCORE);
  private static final int SHIFT_DELAY = SPEED_CURVE.getStackShiftDelay(SCORE);

  @Override
  public Panel[][] getInitialPanelConfig() {

    return PanelGenerator.createClassicConfig(this);
  }

  @Override
  public int getInitialStackShiftDelay() {

    return SHIFT_DELAY;
  }

  @Override
  public int getInitialStackShiftAmount() {

    return SHIFT_AMOUNT;
  }

  @Override
  public int getInitialScore() {

    return SCORE;
  }

  @Override
  public GameTime getInitialTime() {

    return TIME;
  }

  @Override
  public Direction getTimeDirection() {

    return DIR;
  }

  @Override
  public SpeedCurve getSpeedCurve() {

    return SPEED_CURVE;
  }

}
