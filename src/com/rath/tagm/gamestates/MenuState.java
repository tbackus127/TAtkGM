package com.rath.tagm.gamestates;

import java.util.List;

import com.rath.tagm.menu.Controllable;
import com.rath.tagm.menu.MenuChoice;

public abstract class MenuState extends GameState implements Controllable {
  
  protected final List<MenuChoice> choices;
  
  protected MenuState(final List<MenuChoice> ch) {
    this.choices = ch;
  }
  
  public List<MenuChoice> getChoices() {
    return this.choices;
  }
  
}
