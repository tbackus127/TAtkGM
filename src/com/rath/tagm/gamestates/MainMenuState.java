
package com.rath.tagm.gamestates;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import com.rath.tagm.gui.GamePanel;
import com.rath.tagm.menu.MenuSegue;

/**
 * This class contains information for the main menu.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class MainMenuState extends MenuState {

  /**
   * Default constructor.
   */
  public MainMenuState(final GamePanel g) {
    super(g, buildMenuChoices(g));
  }

  /**
   * Builds a list of menu choices.
   * 
   * @return a List of MenuChoice objects.
   */
  protected static List<MenuSegue> buildMenuChoices(final GamePanel p) {

    final ArrayList<MenuSegue> choices = new ArrayList<MenuSegue>();
    choices.add(new MenuSegue("Solo", new SoloMenuState(p)));
    choices.add(new MenuSegue("Multi", new MultiMenuState(p)));
    choices.add(new MenuSegue("Options", new OptionsMenuState(p)));
    choices.add(new MenuSegue("Exit", null));
    return choices;
  }

  @Override
  public void doGameTick() {

    // TODO Auto-generated method stub

  }

  @Override
  public void onUp(final boolean pressed) {

    // TODO Auto-generated method stub

  }

  @Override
  public void onDown(final boolean pressed) {

    // TODO Auto-generated method stub

  }

  @Override
  public void onLeft(final boolean pressed) {

    // TODO Auto-generated method stub

  }

  @Override
  public void onRight(final boolean pressed) {

    // TODO Auto-generated method stub

  }

  @Override
  public void onSelect(final boolean pressed) {

    // TODO Auto-generated method stub

  }

  @Override
  public void onBack(final boolean pressed) {

    // TODO Auto-generated method stub

  }

  @Override
  public void draw(Graphics g) {

    final Graphics2D g2 = (Graphics2D) g;
    g2.setColor(Color.CYAN);
    g2.fillRect(0, 0, 640, 480);
    

  }

}
