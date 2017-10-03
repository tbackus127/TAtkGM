
package com.rath.tagm.gui;

import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * The JFrame window for this game.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public class GameFrame extends JFrame {
  
  /** Serial UID. */
  private static final long serialVersionUID = 1L;
  
  /**
   * Default contructor.
   */
  public GameFrame() {
    super("TAtkGM");
    initGUI();
  }
  
  /**
   * Initializes and creates the GUI.
   */
  private final void initGUI() {
    
    final GamePanel gamePanel = new GamePanel();
    add(gamePanel);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(getPreferredSize());
    setResizable(false);
    setLocationRelativeTo(null);
    setVisible(true);
    requestFocus();
  }
  
  @Override
  public Dimension getPreferredSize() {
    
    return new Dimension(640, 480);
  }
  
  @Override
  public Dimension getMaximumSize() {
    
    return getPreferredSize();
  }
  
  @Override
  public Dimension getMinimumSize() {
    
    return getPreferredSize();
  }
  
}
