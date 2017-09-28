
package com.rath.tagm.gamestates;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import com.rath.tagm.menu.MenuChoice;

public class MainMenuState extends MenuState {
  
  public MainMenuState() {
    super(buildMenuChoices());
  }
  
  protected static List<MenuChoice> buildMenuChoices() {
    final ArrayList<MenuChoice> choices = new ArrayList<MenuChoice>();
    choices.add(new MenuChoice("Solo", new SoloMenuState()));
    choices.add(new MenuChoice("Multi", new MultiMenuState()));
    choices.add(new MenuChoice("Options", new OptionsMenuState()));
    choices.add(new MenuChoice("Exit", new ExitMenuState()));
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
