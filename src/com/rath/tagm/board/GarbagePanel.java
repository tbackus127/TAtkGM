package com.rath.tagm.board;

/**
 * This class contains data and methods used for garbage panels.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class GarbagePanel extends Panel {

  private static final char PANEL_CHAR = '@';

  /**
   * What layer of garbage this panel is (0 is on the bottom; a 2-layer garbage block's bottom layer will be layer=0,
   * and its top layer is layer=1)
   */
  private int layer;

  /** If this panel represents the leftmost panel in the garbage block. */
  private boolean isStartPanel;

  /**
   * Default constructor. Constructs a single-layer garbage panel.
   * 
   * @param s whether or not this panel is the leftmost panel in a garbage block.
   */
  public GarbagePanel(final boolean s) {
    this(s, 0);
  }

  /**
   * Constructs a garbage panel with the specified layer.
   * 
   * @param s whether or not this panel is the leftmost panel in a garbage block.
   * @param layer the layer of a garbage block this panel is in.
   */
  private GarbagePanel(final boolean s, final int layer) {
    super(PanelType.GARBAGE, 0);
    this.layer = layer;
    this.isStartPanel = s;
  }

  /**
   * Gets this panel's garbage layer.
   * 
   * @return an int.
   */
  public final int getLayer() {

    return this.layer;
  }

  /**
   * Sets this panel's garbage layer.
   * 
   * @param n the layer to set this panel to.
   */
  public final void setLayer(int n) {

    this.layer = n;
  }

  /**
   * Subtracts one from this panel's garbage layer.
   */
  public final void decrementLayer() {

    if (layer > 0) {
      this.layer--;
    }
  }

  /**
   * Returns whether or not this panel is the leftmost panel in a garbage block. Used for rendering.
   * 
   * @return true if this panel should be treated as a separate garbage block from its left neighbor.
   */
  public boolean isStartPanel() {

    return isStartPanel;
  }

  @Override
  public char getCharRepresentation() {

    return PANEL_CHAR;
  }
}
