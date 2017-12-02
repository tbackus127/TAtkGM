
package com.rath.tagm.gamestates;

import com.rath.tagm.board.Board;
import com.rath.tagm.metrics.GameStats;
import com.rath.tagm.metrics.RuleSet;

/**
 * Any state with panel-swapping gameplay.
 * 
 * @author Tim Backus tbackus127@gmail.com
 *
 */
public abstract class PlayState extends GameState {
  
  /** The grid of panels. */
  protected final Board board;
  
  /** The score, speed level, and other metrics that update while the game is playing. */
  protected final GameStats stats;
  
  /** The object containing the rules this game type follows. */
  protected final RuleSet rules;
  
  /**
   * Default contructor.
   * 
   * @param b the Board this state will use.
   * @param s the GameStats object this state will update.
   */
  protected PlayState(final Board b, final RuleSet r, final GameStats s) {
    this.board = b;
    this.rules = r;
    this.stats = s;
  }
  
  /**
   * Gets the current rule set for this game.
   * 
   * @return a RuleSet object containing game mode metrics.
   */
  public abstract RuleSet getRuleSet();
  
}
