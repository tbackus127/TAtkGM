package com.rath.tagm.board;

/**
 * This class contains data for standard panels.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class NormalPanel extends Panel {

  /**
   * Constructs a new standard panel with the specified ID.
   * 
   * @param id the ID of this panel as an int.
   */
  public NormalPanel(int id) {
    super(PanelType.NORMAL, id);
  }

  @Override
  public char getCharRepresentation() {

    return (char) ('0' + this.panelID);
  }

}
