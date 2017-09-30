package com.rath.tagm.gamestates;

import com.rath.tagm.board.Board;
import com.rath.tagm.metrics.GameStats;
import com.rath.tagm.metrics.RuleSet;

public abstract class PlayState extends GameState {

  protected final Board board;
  protected final GameStats stats;

  protected PlayState(final Board b, final GameStats s) {
    this.board = b;
    this.stats = s;
  }

  public abstract RuleSet getRuleSet();

}
