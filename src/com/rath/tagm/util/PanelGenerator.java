
package com.rath.tagm.util;

import com.rath.tagm.board.Panel;
import com.rath.tagm.metrics.RuleSet;

/**
 * This class is responsible for generating panels randomly.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public class PanelGenerator {
  
  /**
   * Creates an initial panel configuration for the classic game type.
   * 
   * @param rs the rule set the game is using.
   * @return a 2D array of Panels in the configuration.
   */
  public static Panel[][] createClassicConfig(final RuleSet rs) {
    
    // TODO: This
    return null;
  }
  
  /**
   * Generates a row of panels semi-randomly using the previous two rows to ensure a match is not automatically
   * generated.
   * 
   * @param rs the rule set the game is using (for available panels, etc.).
   * @param prevRow the row directly above the row being generated.
   * @param prevprevRow the row directly above the prevRow row.
   * @return a new row of Panels as an array.
   */
  public Panel[] generateRow(final RuleSet rs, final Panel[] prevRow, final Panel[] prevprevRow) {
    
    // TODO: This
    return null;
  }
}
