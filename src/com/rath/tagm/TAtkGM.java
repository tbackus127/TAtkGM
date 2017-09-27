package com.rath.tagm;

import javax.swing.SwingUtilities;

import com.rath.tagm.gui.GameFrame;

public class TAtkGM {

  public static final void main(final String[] args) {

    SwingUtilities.invokeLater(new Runnable() {

      @Override
      public void run() {

        final GameFrame f = new GameFrame();
      }
    });

  }

}
