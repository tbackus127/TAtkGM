
package com.rath.tagm.board;

/**
 * This class holds a panel's data, like its type, animation state, etc.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public abstract class Panel {
  
  /** The type of panel this is (normal, garbage, etc.). */
  protected final PanelType type;
  
  /** This Panel's current state. */
  protected PanelState state;
  
  /** The Panel's ID, for matching. */
  protected int panelID;
  
  /** The panel's internal counter for state control. */
  protected int aniTime;
  
  /**
   * Creates a new normal panel with the specified ID.
   * 
   * @param id the ID of the panel to create.
   */
  public Panel(final int id) {
    this(PanelType.NORMAL, id);
  }
  
  /**
   * Creates a new Panel with the specified type and ID.
   * 
   * @param t the type of panel to make this.
   * @param id the ID of this panel.
   */
  public Panel(final PanelType t, final int id) {
    this.type = t;
    this.state = PanelState.NORMAL;
    this.aniTime = 0;
    this.panelID = id;
  }
  
  /**
   * Performs state control operations on this panel.
   */
  public void tick() {
    // TODO: this
  }
  
  /**
   * Gets the type of this panel.
   * 
   * @return a value of the PanelType enum.
   */
  public PanelType getType() {
    
    return type;
  }
  
  /**
   * Gets the ID of this panel.
   * 
   * @return an int ID from 0.
   */
  public int getPanelID() {
    return this.panelID;
  }
  
  /**
   * Gets the current state of this panel.
   * 
   * @return the state as a PanelState enum value.
   */
  public PanelState getState() {
    
    return state;
  }
  
  public abstract char getCharRepresentation();
  
}
