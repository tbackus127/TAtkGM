package com.rath.tagm.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.rath.tagm.gamestates.PlayState;
import com.rath.tagm.menu.Controllable;
import com.rath.tagm.util.DP;

/**
 * This class acts as a key listener for the game.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class GameKeyListener implements KeyListener {

  /** A controllable game state. */
  private Controllable gameState;

  /**
   * Default constructor.
   * 
   * @param gs a controllable game state.
   */
  public GameKeyListener(final Controllable gs) {
    this.gameState = gs;
  }

  /**
   * Change the state controlled to the one specified.
   * 
   * @param gs a controllable game state.
   */
  public void changeState(final Controllable gs) {

    this.gameState = gs;
  }

  @Override
  public void keyTyped(KeyEvent ignored) {}

  @Override
  public void keyPressed(KeyEvent e) {

    DP.l("Key pressed.");
    final KeyType key = KeyBindings.getKeyType(e.getKeyCode());
    if (key == null)
      return;

    // If this is a gameplay state, check its respective keys
    if (this.gameState instanceof PlayState) {
      final PlayState ps = (PlayState) this.gameState;
      switch (key) {
        case KEY_PAUSE:
          ps.onPause(true);
        case KEY_UNDO:
          ps.onUndo(true);
        case KEY_STACK_RAISE:
          ps.onRaiseStack(true);
        break;
        default:
      }
    }

    // Check global keys
    switch (key) {
      case KEY_UP:
        DP.l("KeyListener caught UP.");
        this.gameState.onUp(true);
      case KEY_LEFT:
        this.gameState.onLeft(true);
      case KEY_DOWN:
        this.gameState.onDown(true);
      case KEY_RIGHT:
        this.gameState.onRight(true);
      case KEY_BUTTON_1:
        this.gameState.onSelect(true);
      case KEY_BUTTON_2:
        this.gameState.onBack(true);
      break;
      default:
    }

  }

  @Override
  public void keyReleased(KeyEvent e) {

    final KeyType key = KeyBindings.getKeyType(e.getKeyCode());
    if (key == null)
      return;

    if (this.gameState instanceof PlayState) {
      final PlayState ps = (PlayState) this.gameState;
      switch (key) {
        case KEY_PAUSE:
          ps.onPause(false);
        case KEY_UNDO:
          ps.onUndo(false);
        case KEY_STACK_RAISE:
          ps.onRaiseStack(false);
        break;
        default:
      }
    }

    switch (key) {
      case KEY_UP:
        this.gameState.onUp(false);
      case KEY_LEFT:
        this.gameState.onLeft(false);
      case KEY_DOWN:
        this.gameState.onDown(false);
      case KEY_RIGHT:
        this.gameState.onRight(false);
      case KEY_BUTTON_1:
        this.gameState.onSelect(false);
      case KEY_BUTTON_2:
        this.gameState.onBack(false);
      break;
      default:
    }

  }

}
