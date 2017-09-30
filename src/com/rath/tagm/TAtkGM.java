
package com.rath.tagm;

import javax.swing.SwingUtilities;

import com.rath.tagm.gui.GameFrame;

/**
 * This program is an extension of popular panel swapping games, with an increased skill ceiling.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class TAtkGM {

  /**
   * Main method.
   * 
   * @param args runtime arguments; currently unused.
   */
  public static final void main(final String[] args) {
    
    SwingUtilities.invokeLater(new Runnable() {
      
      @Override
      public void run() {
        
        @SuppressWarnings("unused")
        final GameFrame f = new GameFrame();
      }
    });
    
  }
  
}
