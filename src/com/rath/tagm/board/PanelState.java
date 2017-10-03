
package com.rath.tagm.board;

/**
 * This enum covers the different states panels can have.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public enum PanelState {
  
  /** The Panel can be swapped and dropped normally. */
  NORMAL,
  
  /** The Panel has just been matched. */
  FLASHING,
  
  /** The Panel is waiting for its turn to pop. */
  POP_QUEUED,
  
  /** The Panel is in its popping animation. */
  POPPING,
  
  /** The Panel is hanging in the air. */
  SUSPENDED,
  
  /** The Panel is currently dropping. */
  FALLING,
  
  /** The Panel is unable to be swapped. */
  LOCKED
}
