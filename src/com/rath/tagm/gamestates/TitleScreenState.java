
package com.rath.tagm.gamestates;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import com.rath.tagm.gui.GamePanel;
import com.rath.tagm.img.SpriteRegistry;
import com.rath.tagm.img.SpriteType;

/**
 * The title screen scene.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class TitleScreenState extends TitleState {

  /**
   * Default constructor.
   * 
   * @param p a reference to the render panel.
   */
  public TitleScreenState(GamePanel p) {
    super(p);
  }

  @Override
  public void doGameTick() {
    
    // TODO: animation stuff here
    
    super.doGameTick();
  }

  @Override
  public void draw(Graphics g) {

    final Graphics2D g2 = (Graphics2D) g;
    g2.drawImage(SpriteRegistry.getSprite(SpriteType.BG_TITLE), 0, 0, 640, 480, null);

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

    gamePanel.transitionToState(new MainMenuState(gamePanel));
  }

  @Override
  public void onBack() {

    onSelect();
  }

}
