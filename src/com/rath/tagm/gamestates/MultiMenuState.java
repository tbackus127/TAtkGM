package com.rath.tagm.gamestates;

import java.awt.Graphics;
import java.util.List;

import com.rath.tagm.gui.GamePanel;
import com.rath.tagm.menu.MenuSegue;

public class MultiMenuState extends MenuState {

  public MultiMenuState(final GamePanel g) {
    super(g, buildMenuChoices());
  }

  private static List<MenuSegue> buildMenuChoices() {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void doGameTick() {
    // TODO Auto-generated method stub

  }

  @Override
  public void draw(Graphics g) {
    // TODO Auto-generated method stub

  }

  @Override
  public void onUp() {
    // TODO Auto-generated method stub

  }

  @Override
  public void onDown() {
    // TODO Auto-generated method stub

  }

  @Override
  public void onLeft() {
    // TODO Auto-generated method stub

  }

  @Override
  public void onRight() {
    // TODO Auto-generated method stub

  }

  @Override
  public void onSelect() {
    // TODO Auto-generated method stub

  }

  @Override
  public void onBack() {
    // TODO Auto-generated method stub

  }

}
