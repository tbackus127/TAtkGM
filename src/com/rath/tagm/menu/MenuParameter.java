
package com.rath.tagm.menu;

/**
 * A type of menu component that can take a value and be changed.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public class MenuParameter extends MenuEntry {
  
  /** The value of this menu parameter. */
  private int value;
  
  /** The mimimum value this parameter can be. */
  private final int minValue;
  
  /** The maximum value this parameter can be. */
  private final int maxValue;
  
  /**
   * Default constructor.
   * 
   * @param t the label of this parameter.
   * @param min the minimum value of this parameter.
   * @param max the maximum value of this parameter.
   */
  private MenuParameter(final String t, final int min, final int max) {
    super(t);
    this.minValue = min;
    this.maxValue = max;
  }
  
  /**
   * Constructs a MenuParameter, but with a default value.
   * 
   * @param t the label of this parameter.
   * @param def the default value of this paramter.
   * @param min the minimum value of this parameter.
   * @param max the maximum value of this parameter.
   */
  public MenuParameter(final String t, final int def, final int min, final int max) {
    this(t, min, max);
    this.setValue(def);
  }
  
  /**
   * Gets this parameter's max value.
   * 
   * @return an int.
   */
  public int getMaxValue() {
    return this.maxValue;
  }
  
  /**
   * Gets the parameter's current value.
   * 
   * @return an int.
   */
  public int getValue() {
    
    return value;
  }
  
  /**
   * Adds an amount to the current value, capping at the minimum and maximum.
   * 
   * @param n the amount to add, if positive, or subtract, if negative.
   */
  public void addToValue(int n) {
    if (this.value + n >= this.maxValue) {
      this.value = this.maxValue;
    } else if (this.value - n < this.minValue) {
      this.value = this.minValue;
    } else {
      this.value += n;
    }
  }
  
  /**
   * Sets the current value to a given number.
   * 
   * @param n the number to set the current value to.
   */
  public void setValue(int n) {
    if (n < this.minValue)
      this.value = this.minValue;
    else if (n > this.maxValue)
      this.value = this.maxValue;
    else
      this.value = n;
  }
  
}
