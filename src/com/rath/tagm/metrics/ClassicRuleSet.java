
package com.rath.tagm.metrics;

import java.util.ArrayList;
import java.util.Random;

import com.rath.tagm.util.Direction;

/**
 * The set of parameters and rules that defines the classic panel swapping experience.
 * 
 * @author Tim Backus tbackus127@gmail.com
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

  /** The number of maximum panel types the game begins with. */
  private static final int INIT_PANEL_IDS = 6;

  /** Whether or not the board wraps. */
  private static final boolean BOARD_WRAPS = false;

  /** The number of panels in a row. */
  private static final int BOARD_WIDTH = 6;

  /** The possible panel configurations. */
  private static final ArrayList<int[]> PANEL_CONFIGS = buildPanelConfigs();

  @Override
  public int[] getInitialPanelConfig() {

    final Random rand = new Random();
    return PANEL_CONFIGS.get(rand.nextInt(PANEL_CONFIGS.size()));

  }

  /**
   * Builds the possible pannel configurations. The values represent the number of panels to delete from the top of the
   * PLAY AREA (not board array!). So if the array is [5, 6, 3, 7, 7, 6], this configuration will start with 7, 6, 9, 5,
   * 5, and 6 panels in each column, respectively.
   * 
   * @return
   */
  private static ArrayList<int[]> buildPanelConfigs() {

    final ArrayList<int[]> result = new ArrayList<int[]>();

    int[] config1 = {3, 3, 3, 3, 3, 3};
    result.add(config1);

    return result;
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

  @Override
  public int getInitialMaxPanelTypes() {

    return INIT_PANEL_IDS;
  }

  @Override
  public boolean doesBoardWrap() {

    return BOARD_WRAPS;
  }

  @Override
  public int getBoardWidth() {

    return BOARD_WIDTH;
  }

// @formatter:off
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
// @formatter:on

}
