package com.rath.tagm.util;

/**
 * This class holds two values: an x and y value for a 2D coordinate. This class is immutable.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class Coord {

  /** The x component. */
  private final int x;

  /** The y component. */
  private final int y;

  /**
   * Default constructor.
   * 
   * @param x the x value.
   * @param y the y value.
   */
  public Coord(final int x, final int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Gets the x value.
   * 
   * @return the x component of this coordinate.
   */
  public int getX() {

    return x;
  }

  /**
   * Gets the y value.
   * 
   * @return the y component of this coordinate.
   */
  public int getY() {

    return y;
  }

}
