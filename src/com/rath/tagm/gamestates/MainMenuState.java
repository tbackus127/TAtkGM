
package com.rath.tagm.gamestates;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import com.rath.tagm.menu.MenuSegue;

/**
 * This class contains information for the main menu.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public class MainMenuState extends MenuState {
  
  /**
   * Default constructor.
   */
  public MainMenuState() {
    super(buildMenuChoices());
  }
  
  /**
   * Builds a list of menu choices.
   * 
   * @return a List of MenuChoice objects.
   */
  protected static List<MenuSegue> buildMenuChoices() {
    final ArrayList<MenuSegue> choices = new ArrayList<MenuSegue>();
    choices.add(new MenuSegue("Solo", new SoloMenuState()));
    choices.add(new MenuSegue("Multi", new MultiMenuState()));
    choices.add(new MenuSegue("Options", new OptionsMenuState()));
    choices.add(new MenuSegue("Exit", null));
    return choices;
  }
  
  @Override
  public void doGameTick() {
    
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
  
  @Override
  public void draw(Graphics g) {
    
    // TODO Auto-generated method stub
    
  }
  
}
