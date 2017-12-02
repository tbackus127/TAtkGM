package com.rath.tagm.board;


public class NormalPanel extends Panel {

  public NormalPanel(int id) {
    super(PanelType.NORMAL, id);
  }

  @Override
  public char getCharRepresentation() {
    return (char) ('0' + this.panelID);
  }
  

}
