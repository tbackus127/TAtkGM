package com.rath.tagm.metrics;

import com.rath.tagm.util.Direction;

public class GameStats {

  private final GameTime time;
  private int score;
  private int stackShiftDelay;
  private int stackShiftAmount;

  public GameStats(final RuleSet rs) {
    this.time = new GameTime();
    this.score = 0;
    this.stackShiftDelay = rs.getInitialStackShiftDelay();
    this.stackShiftAmount = rs.getInitialStackShiftAmount();
  }

  public void tickTime(final Direction dir) {

    this.time.tick(dir);
  }

  public GameTime getTime() {

    return this.time;
  }

  public int getScore() {

    return this.score;
  }

  public int getStackShiftDelay() {

    return this.stackShiftDelay;
  }

  public int getStackShiftAmount() {

    return this.stackShiftAmount;
  }

}
