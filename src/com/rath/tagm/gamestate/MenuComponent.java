package com.rath.tagm.gamestate;


public abstract class MenuComponent {

  private final String text;
  
  protected MenuComponent(final String t) {
    this.text = t;
  }
  
  public String getText() {
    return this.text;
  }
  
}
