
package com.rath.tagm.gamestates;

import java.awt.Graphics;

import com.rath.tagm.board.Board;
import com.rath.tagm.metrics.ClassicRuleSet;
import com.rath.tagm.metrics.GameStats;
import com.rath.tagm.metrics.RuleSet;

/**
 * The classic panel swapping experience that everyone is familiar with.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public class ClassicPlayState extends PlayState {
  
  /** A collection of game mechanic specifications unique to this game type. */
  private static final RuleSet RULES = new ClassicRuleSet();
  
  /**
   * Default Constructor.
   */
  public ClassicPlayState() {
    super(new Board(RULES), new GameStats(RULES));
  }
  
  @Override
  public RuleSet getRuleSet() {
    
    // TODO Auto-generated method stub
    return null;
  }
  
  @Override
  public void doGameTick() {
    
    // TODO Auto-generated method stub
    
  }
  
  @Override
  public void draw(Graphics g) {
    
    // TODO Auto-generated method stub
    
  }
  
}
