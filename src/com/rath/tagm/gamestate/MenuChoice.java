package com.rath.tagm.gamestate;

public class MenuChoice extends MenuComponent {

  private final GameState nextState;

  public MenuChoice(final String t, final GameState n) {
    super(t);
    this.nextState = n;
  }

  public GameState getNextState() {

    return nextState;
  }
}
