
package com.rath.tagm.metrics;

import com.rath.tagm.board.Panel;
import com.rath.tagm.util.Direction;
import com.rath.tagm.util.PanelGenerator;

/**
 * The set of parameters and rules that defines the classic panel swapping experience.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public class ClassicRuleSet extends RuleSet {
  
  /** Default score for this game mode. */
  private static final int SCORE = 0;
  
  /** Default time setting for this game mode. */
  private static final GameTime TIME = new GameTime(0, 0, 0, 0);
  
  /** The direction the timer counts. */
  private static final Direction DIR = Direction.UP;
  
  /** The speed curve data for this game mode. */
  private static final SpeedCurve SPEED_CURVE = new ClassicSpeedCurve();
  
  /** How many pixels the stack will raise each shift. */
  private static final int SHIFT_AMOUNT = SPEED_CURVE.getStackShiftAmount(SCORE);
  
  /** How many ticks the stack waits before raising. */
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
  
//@formatter:off
/*
 * Speed Levels
 * Influenced by #panels cleared 
 * SpdLv  Panels  Frames per Raise 
 * 1      0       ? 
 * 2      9       ?
 * 3      21      ?
 * 4      33      ?
 * 5      45      ?
 * 6      57      ? 
 * 7      69      ?
 * 8      83      ? 
 * 
 * Scoring: 
 * 
 * Stack Raise: +1 
 * Panel Pops: +10 
 * 
 * Combo  Bonus
 * 4      20 
 * 5      30 
 * 6      50 
 * 7      60 
 * 8      ?? 
 * 9      80 
 * 10     ?? 
 * 11     ?? 
 * 12     170
 * 
 * Chain  Bonus 
 * x2     50
 * x3     80 
 * x4     150 
 * x5     300 
 * x6     400 
 * x7     500 
 * x8     700 
 * x9     900 
 * x10    1100
 * x11    1300
 * x12    1500
 * x?     0
 */
//@formatter:on

}
