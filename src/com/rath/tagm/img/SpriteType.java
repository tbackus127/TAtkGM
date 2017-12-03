package com.rath.tagm.img;

public enum SpriteType {

// @formatter:off
  CURSOR("cursor"),
  PANEL_NORM("panel-norm"),
  PANEL_SHOCK("panel-shock"),
  PANEL_GARBAGE("panel-garbage"),
  PANEL_SHOCK_GARBAGE("panel-shock-garbage"),
  PANEL_POP_PARTICLE("panel-pop-particle"),
  PANEL_MATCHED("panel-matched"),
  PANEL_FALLING("panel-falling"),
  FRAME_BOARD("frame-board"),
  FRAME_GAME_INFO("frame-game-info"),
  POPUP_BG_COMBO("popup-bg-combo"),
  POPUP_BG_CHAIN("popup-bg-chain"),
  FONT_POPUP("font-popup"),
  FONT_GAME_INFO("font-game-info"),
  FONT_STOP("font-stop"),
  BG_PLAY_AREA("bg-play-area"),
  BG_TITLE("bg-title");
// @formatter:on

  private String fileName;

  private SpriteType(final String fileName) {
    this.fileName = fileName;
  }

  public String getFileName() {

    return this.fileName;
  }
}
