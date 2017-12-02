package com.rath.tagm.board;


public class GarbagePanel extends Panel {

  private int layer;
  
  public GarbagePanel() {
    this(0);
  }
  
  private GarbagePanel(final int layer) {
    super(PanelType.GARBAGE, 0);
    this.layer = layer;
  }

  public final int getLayer() {
    return this.layer;
  }
  
  public final void setLayer(int n) {
    this.layer = n;
  }
  
  public final void decrementLayer() {
    this.layer--;
  }

  @Override
  public char getCharRepresentation() {
    return PanelType.GARBAGE.getPanelChar();
  }
}
