package com.rath.tagm.gui;

import java.awt.Graphics;

import javax.swing.JPanel;

import com.rath.tagm.gamestate.GameState;
import com.rath.tagm.gamestate.TitleScreenState;

public class GamePanel extends JPanel {

  private static final long serialVersionUID = 1L;
  private static final GameState DEFAULT_STATE = new TitleScreenState();
  private GameState state;

  public GamePanel() {
    this(DEFAULT_STATE);
  }

  private GamePanel(final GameState s) {
    super();
    this.state = s;
  }

  public void changeState(final GameState st) {

    this.state = st;
  }

  @Override
  public void paintComponent(Graphics g) {
    this.state.draw(g);
  }

}
