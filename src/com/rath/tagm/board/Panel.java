package com.rath.tagm.board;


public class Panel {

  protected final PanelType type;
  protected PanelState state;
  protected int aniTime;
  
  public Panel(final PanelType t) {
    this.type = t;
    this.state = PanelState.NORMAL;
    this.aniTime = 0;
  }
  
  public void tick() {
    // TODO: this
  }

  public PanelType getType() {

    return type;
  }

  public PanelState getState() {

    return state;
  }
  
}
