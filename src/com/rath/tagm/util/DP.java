package com.rath.tagm.util;

/**
 * This class is a debug print handler.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class DP {

  /** Whether to print debug information. */
  private static final boolean DEBUG = false;

  /**
   * Debug println. Only prints if DEBUG flag is true.
   * 
   * @param s the String to print.
   */
  public static final void l(final String s) {

    if (DEBUG) {
      System.out.println(s);
    }
  }

  /**
   * Debug print. Only prints if DEBUG flag is true.
   * 
   * @param s the String to print.
   */
  public static final void p(final String s) {

    if (DEBUG) {
      System.out.print(s);
    }
  }

}
