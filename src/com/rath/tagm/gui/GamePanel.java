
package com.rath.tagm.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.rath.tagm.gamestates.GameState;
import com.rath.tagm.gamestates.TitleScreenState;

/**
 * The rendering area of the window.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public class GamePanel extends JPanel {
  
  /** Serial UID. */
  private static final long serialVersionUID = 1L;
  
  /** The starting state of this game. */
  private static final GameState DEFAULT_STATE = new TitleScreenState();
  
  /** The current state of the game. */
  private GameState state;
  
  /**
   * Default constructor. Starts the game with the default state.
   */
  public GamePanel() {
    this(DEFAULT_STATE);
  }
  
  /**
   * Creates a new panel with the specified state.
   * 
   * @param s the GameState to set the panel to.
   */
  private GamePanel(final GameState s) {
    super();
    this.state = s;
    setBackground(Color.RED);
  }
  
  /**
   * Changes the state to the given state.
   * 
   * @param st the GameState to set the current to.
   */
  public void changeState(final GameState st) {
    
    this.state = st;
  }
  
  @Override
  public void paintComponent(Graphics g) {
    this.state.draw(g);
  }
  
}
