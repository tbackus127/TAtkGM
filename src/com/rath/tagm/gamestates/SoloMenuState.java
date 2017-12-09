
package com.rath.tagm.gamestates;

import java.awt.Graphics;
import java.util.List;

import com.rath.tagm.gui.GamePanel;
import com.rath.tagm.menu.MenuSegue;

/**
 * The menu for solo play.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class SoloMenuState extends MenuState {

  /**
   * Default contructor.
   */
  public SoloMenuState(final GamePanel p) {
    super(p, buildMenuChoices());
  }

  private static List<MenuSegue> buildMenuChoices() {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void draw(Graphics g) {
    // TODO Auto-generated method stub

  }

  @Override
  public void onUp(boolean pressed) {

    // TODO Auto-generated method stub

  }

  @Override
  public void onDown(boolean pressed) {

    // TODO Auto-generated method stub

  }

  @Override
  public void onLeft(boolean pressed) {

    // TODO Auto-generated method stub

  }

  @Override
  public void onRight(boolean pressed) {

    // TODO Auto-generated method stub

  }

  @Override
  public void onSelect(boolean pressed) {

    // TODO Auto-generated method stub

  }

  @Override
  public void onBack(boolean pressed) {

    // TODO Auto-generated method stub

  }

}
