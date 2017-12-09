package com.rath.tagm.menu;

/**
 * This interface contains methods that apply only to gameplay rather than global controls.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public interface ControllableExt {

  /** What should happen when the player presses the UNDO key. */
  public void onUndo(final boolean pressed);

  /** What should happen when the player presses the RAISE STACK key. */
  public void onRaiseStack(final boolean pressed);

  /** What should happen when the player presses the PAUSE key. */
  public void onPause(final boolean pressed);
}
