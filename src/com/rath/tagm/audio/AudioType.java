
package com.rath.tagm.audio;

/**
 * This enum handles values and contains directory names for theme subfolders.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public enum AudioType {
  
  /** Background music. */
  BGM("bgm"),
  
  /** Sound effects. */
  SFX("sfx");
  
  /** The directory name within a theme folder in which audio files of the given type will be. */
  private final String dirName;
  
  /**
   * Default constructor. Sets an enum's value as a String.
   * 
   * @param n the enum's value.
   */
  private AudioType(final String n) {
    this.dirName = n;
  }
  
  @Override
  public String toString() {
    return this.dirName;
  }
}
