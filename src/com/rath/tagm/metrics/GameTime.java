package com.rath.tagm.metrics;

import com.rath.tagm.util.Direction;

public class GameTime {

  private static final int MAX_HOURS = 99;

  private int ticks;
  private int seconds;
  private int minutes;
  private int hours;

  public GameTime(final int h, final int m, final int s, final int t) {
    this.hours = h;
    this.minutes = m;
    this.seconds = s;
    this.ticks = t;
  }

  public GameTime() {
    this(0, 0, 0, 0);
  }

  public void tick(final Direction dir) {

    switch (dir) {
      case UP:
        tickUp();
      break;
      case DOWN:
        tickDown();
      default:
      break;
    }
  }

  private void tickDown() {

  }

  private void tickUp() {

    if (ticks >= 59) {

      if (seconds >= 59) {

        if (minutes >= 59) {

          if (hours < MAX_HOURS) {
            hours++;
            minutes = 0;
            seconds = 0;
            ticks = 0;
          }

        } else {
          minutes++;
          seconds = 0;
          ticks = 0;
        }
      } else {
        seconds++;
        ticks = 0;
      }
    } else {
      ticks++;
    }
  }

  public boolean isZero() {

    return (ticks & seconds & minutes & hours) == 0;
  }

  public int getTicks() {

    return ticks;
  }

  public int getSeconds() {

    return seconds;
  }

  public int getMinutes() {

    return minutes;
  }

  public int getHours() {

    return hours;
  }
}
