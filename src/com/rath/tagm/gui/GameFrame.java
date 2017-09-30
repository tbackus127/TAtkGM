package com.rath.tagm.gui;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

  private static final long serialVersionUID = 1L;

  public GameFrame() {
    super("TAtkGM");
    initGUI();
  }

  private void initGUI() {

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
