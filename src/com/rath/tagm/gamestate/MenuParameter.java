package com.rath.tagm.gamestate;


public class MenuParameter extends MenuComponent {

  private int value;
  
  private MenuParameter(String t) {
    super(t);
  }
  
  public MenuParameter(final String t, final int def) {
    this(t);
    this.setValue(def);
  }

  public int getValue() {

    return value;
  }

  public void setValue(int value) {

    this.value = value;
  }

}
