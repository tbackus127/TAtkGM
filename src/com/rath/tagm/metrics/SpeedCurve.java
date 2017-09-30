package com.rath.tagm.metrics;

public abstract class SpeedCurve {

  public abstract int getStackShiftDelay(final int score);

  public abstract int getStackShiftAmount(final int score);

}
