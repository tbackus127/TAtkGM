
package com.rath.tagm.gamestates;

import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * The title screen scene.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class TitleScreenState extends TitleState {
  
  @Override
  public void doGameTick() {
    
    // TODO Auto-generated method stub
    
  }
  
  @Override
  public void draw(Graphics g) {
    
    final Graphics2D g2 = (Graphics2D) g;
    
    g2.fillRect(0, 0, 640, 480);
  }
  
  @Override
  public void onUp() {
    
    onSelect();
  }
  
  @Override
  public void onDown() {
    
    onSelect();
  }
  
  @Override
  public void onLeft() {
    
    onSelect();
  }
  
  @Override
  public void onRight() {
    
    onSelect();
  }
  
  @Override
  public void onSelect() {
    // TODO this one
  }
  
  @Override
  public void onBack() {
    
    onSelect();
  }
  
}
