
package com.rath.tagm.gamestates;

import java.awt.Graphics;

import com.rath.tagm.board.Board;
import com.rath.tagm.gui.GamePanel;
import com.rath.tagm.metrics.ClassicRuleSet;
import com.rath.tagm.metrics.GameStats;
import com.rath.tagm.metrics.RuleSet;

/**
 * The classic panel swapping experience that everyone is familiar with.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class ClassicPlayState extends PlayState {

  /** A collection of game mechanic specifications unique to this game type. */
  private static final RuleSet RULE_SET = new ClassicRuleSet();

  /**
   * Default Constructor.
   */
  public ClassicPlayState(final GamePanel g) {
    super(g, new Board(RULE_SET), RULE_SET, new GameStats(RULE_SET));
  }

  @Override
  public RuleSet getRuleSet() {

    return RULE_SET;
  }

  @Override
  public void doGameTick() {

    // TODO Auto-generated method stub

  }

  @Override
  public void draw(Graphics g) {

    // TODO Auto-generated method stub

  }

  @Override
  public void onUp() {

    // TODO Auto-generated method stub

  }

  @Override
  public void onDown() {

    // TODO Auto-generated method stub

  }

  @Override
  public void onLeft() {

    // TODO Auto-generated method stub

  }

  @Override
  public void onRight() {

    // TODO Auto-generated method stub

  }

  @Override
  public void onSelect() {

    // TODO Auto-generated method stub

  }

  @Override
  public void onBack() {

    // TODO Auto-generated method stub

  }

}
