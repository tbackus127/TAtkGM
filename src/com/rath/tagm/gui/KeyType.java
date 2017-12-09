package com.rath.tagm.gui;

// @formatter:off
/**
 * This enum contains the possible key types the game uses.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public enum KeyType {
  KEY_UP("keyUp"),
  KEY_DOWN("keyDown"),
  KEY_LEFT("keyLeft"),
  KEY_RIGHT("keyRight"),
  KEY_BUTTON_1("keyButton1"),
  KEY_BUTTON_2("keyButton2"),
  KEY_UNDO("keyUndo"),
  KEY_STACK_RAISE("keyStackRaise"),
  KEY_PAUSE("keyPause");
// @formatter:on

  /** The name of the config title for this keybind. */
  private final String configVal;

  /**
   * Default constructor.
   * 
   * @param configVal the config title as a String.
   */
  private KeyType(final String configVal) {
    this.configVal = configVal;
  }

  /**
   * Gets the config title for this keybind.
   * 
   * @return the title as a String.
   */
  public String getConfigVal() {

    return this.configVal;
  }
}
