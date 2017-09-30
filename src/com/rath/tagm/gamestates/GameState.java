package com.rath.tagm.gamestates;

import java.awt.Graphics;

public abstract class GameState {

  public abstract void doGameTick();
  public abstract void draw(Graphics g);

}
