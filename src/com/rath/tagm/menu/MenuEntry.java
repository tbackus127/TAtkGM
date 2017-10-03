
package com.rath.tagm.menu;

/**
 * A component of a menu that can be selected.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public class MenuEntry extends MenuComponent {
  
  /** The label this component should have. */
  private final String label;
  
  /**
   * Default constructor.
   * 
   * @param t the label this component should have.
   */
  protected MenuEntry(final String l) {
    this.label = l;
  }
  
  /**
   * Gets this component's label.
   * 
   * @return the label as a String.
   */
  public String getLabel() {
    return this.label;
  }
}
