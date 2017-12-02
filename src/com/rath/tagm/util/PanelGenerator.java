
package com.rath.tagm.util;

import java.util.HashSet;
import java.util.Random;

import com.rath.tagm.board.NormalPanel;
import com.rath.tagm.board.Panel;
import com.rath.tagm.metrics.GameStats;
import com.rath.tagm.metrics.RuleSet;

/**
 * This class is responsible for generating panels randomly.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class PanelGenerator {

  private static final Random rand = new Random();

  /**
   * Generates a row of panels semi-randomly using the previous two rows to ensure a match is not automatically
   * generated.
   * 
   * @param rs the rule set the game is using (for available panels, etc.).
   * @param prevRow the row directly above the row being generated.
   * @param prevprevRow the row directly above the prevRow row.
   * @return a new row of Panels as an array.
   */
  public static final Panel[] generateRow(final GameStats gs, final RuleSet rs, final Panel[] prevRow,
      final Panel[] prevprevRow) {

    // Create a bag of available panels
    HashSet<Integer> panelBag;

    final int boardWidth = rs.getBoardWidth();
    DP.p("Generating row with width " + boardWidth + ":");

    final Panel[] result = new Panel[boardWidth];

    // Iterate through each panel position in a row
    for (int i = 0; i < boardWidth; i++) {

      DP.p(" Generating col " + i + ":");

      // If this is the initial generation, ignore mid-game changes to number of panels
      final int numPanelTypes = (gs != null) ? gs.getNumPanelTypes() : rs.getInitialMaxPanelTypes();
      DP.p("  #panel types: " + numPanelTypes);

      panelBag = new HashSet<Integer>();
      // Fill the bag with possible panels
      for (int p = 0; p < numPanelTypes; p++) {
        panelBag.add(p);
        DP.p("  Added id " + p + " to panel bag");
      }
      int checkPanel = -1;

      // If we're generating the first two rows, don't check vertical collisions 
      if (prevprevRow != null && prevRow != null && prevprevRow[i] != null && prevRow[i] != null) {

        DP.p("  Checking previous rows");

        // If the two panels above the current space are the same, remove that panel
        //   from the set of possible panels to generate
        if ((checkPanel = prevRow[i].getPanelID()) == prevprevRow[i].getPanelID()) {

          DP.p("   Vertical collision of " + checkPanel);
          panelBag.remove(checkPanel);
        }
      } else {
        DP.p("  Skipping vertical collision check");
      }

      // Horizontal checking; don't check for positions 0 and 1
      if (i > 1) {

        DP.p("  Checking horiz collision:");

        checkPanel = result[i - 1].getPanelID();

        // If we're checking a wrapped panel
        if (rs.doesBoardWrap() && i == boardWidth - 1) {
          if (checkPanel == result[0].getPanelID()) {
            DP.p("   Board wrap collision with " + checkPanel);
            panelBag.remove(checkPanel);
          }

        }

        // Check the previous two panels to the left that have been generated
        if (checkPanel == result[i - 2].getPanelID()) {
          DP.p("   Horizontal collision with " + checkPanel);
          panelBag.remove(checkPanel);
        }

      } else {
        DP.p("  Col is 0 or 1; skipping horiz check");
      }

      // Chose a random panel from the bag for this position
      final int randVal = rand.nextInt(panelBag.size());
      DP.p("  Chose " + randVal + " as panel ID");
      for (int pid = 0; pid < panelBag.size(); pid++) {
        if (pid == randVal) {
          result[i] = new NormalPanel(pid);
          DP.p("Generated new panel " + pid);
        }
      }

    }

    return result;
  }

  /**
   * Generates a starting layout as specified by the given RuleSet.
   * 
   * @param gs the GameStats object. Contains potentially changing information.
   * @param rs the RuleSet specification.
   * @param cfg the amount of panels to delete in each column.
   * @return a 2D Panel array.
   */
  public static Panel[][] generateInitialLayout(final RuleSet rs, final int[] cfg) {

    final Panel[][] result = new Panel[RuleSet.BOARD_HEIGHT][rs.getBoardWidth()];

    // Generate a full board
    result[0] = generateRow(null, rs, null, null);
    result[1] = generateRow(null, rs, result[0], null);
    for (int i = 2; i < RuleSet.PLAY_AREA_HEIGHT; i++) {

      result[i] = generateRow(null, rs, result[i - 1], result[i - 2]);

    }

    return result;
  }
}
