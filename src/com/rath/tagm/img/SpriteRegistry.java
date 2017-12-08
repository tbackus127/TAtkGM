package com.rath.tagm.img;

import java.awt.image.BufferedImage;
import java.util.HashMap;

import com.rath.tagm.util.ThemeFileFetcher;

/**
 * This class contains a map with pre-loaded sprites.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class SpriteRegistry {

  /** The sprite map. */
  private static final HashMap<String, BufferedImage> spriteMap = new HashMap<String, BufferedImage>();

  /**
   * Gets a sprite from the sprite map.
   * 
   * @param type the type of sprite to get.
   * @return a BufferedImage of the sprite.
   */
  public static final BufferedImage getSprite(final SpriteType type) {

    return spriteMap.get(type.getFileName());
  }

  /**
   * Loads a sprite into the sprite map.
   * 
   * @param tff the ThemeFileFetcher object already constructed with a given theme.
   * @param type the sprite type to load.
   */
  public static final void loadSprite(final ThemeFileFetcher tff, final SpriteType type) {

    spriteMap.put(type.getFileName(), tff.getImageFile(type));
  }

}
