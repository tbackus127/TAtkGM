
package com.rath.tagm.board;

/**
 * This enum covers the types of Panels available in the game.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public enum PanelType {

  /** This is a standard Panel that can be swapped normally. */
  NORMAL("panel-norm-"),

  /** This Panel can be matched normally, but creates shock garbage instead of normal garbage. */
  SHOCK("panel-shock-"),

  /**
   * This Panel is not affected by gravity, and turns into normal panels when a match from normal panels or clearing
   * garbage panels touches it.
   */
  GARBAGE("panel-garbage-"),

  /**
   * A special type of garbage that is only cleared by matching normal panels or clearing shock garbage panels that
   * touch it.
   */
  SHOCK_GARBAGE("shock-garbage-");

  /** The prefix for the panels' sprite image files. */
  private final String prefix;

  /**
   * Default constructor. Sets file prefix and character representation data.
   * 
   * @param p the filename prefix for this panel type.
   * @param c the character to represent this panel as on the terminal.
   */
  private PanelType(final String p) {
    this.prefix = p;
  }

  /**
   * Gets the prefix label.
   * 
   * @return the prefix as a String.
   */
  public String getPrefix() {

    return prefix;
  }
}
