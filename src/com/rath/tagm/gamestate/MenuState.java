package com.rath.tagm.gamestate;

import java.util.List;

public abstract class MenuState extends GameState implements Controllable {
  
  protected final List<MenuChoice> choices;
  
  protected MenuState(final List<MenuChoice> ch) {
    this.choices = ch;
  }
  
  public List<MenuChoice> getChoices() {
    return this.choices;
  }
  
}
