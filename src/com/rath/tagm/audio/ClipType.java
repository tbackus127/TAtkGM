
package com.rath.tagm.audio;

/**
 * This enum contains the different types of sound effects and music.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public enum ClipType {
  
  /** Cursor movement. */
  CURSOR("cursor"),
  
  /** Selecting a choice in a menu. */
  CONFIRM("confirm"),
  
  /** Cancelling a choice in a menu. */
  CANCEL("cancel"),
  
  /** A small fanfare. */
  FANFARE_SM("fanfare-sm"),
  
  /** A moderate fanfare. */
  FANFARE_MD("fanfare-md"),
  
  /** A large fanfare. */
  FANFARE_LG("fanfare-lg");
  
  /** The file name (minus the extension) of this audio file found in its respective theme. */
  private final String fileName;
  
  /**
   * Default constructor. Sets a value's file name.
   * 
   * @param n the file name as a String.
   */
  private ClipType(final String n) {
    this.fileName = n;
  }
  
  @Override
  public String toString() {
    return this.fileName;
  }
}
