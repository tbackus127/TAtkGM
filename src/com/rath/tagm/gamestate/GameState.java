package com.rath.tagm.gamestate;

import java.awt.Graphics;

public abstract class GameState {

  public abstract void doGameTick();
  public abstract void draw(Graphics g);

}
