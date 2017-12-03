package com.rath.tagm.img;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;

import com.rath.tagm.util.ThemeFileFetcher;

public class SpriteRegistry {

  private static final String SPRITE_PATH = "Themes/";

  private static final HashMap<String, BufferedImage> spriteMap = new HashMap<String, BufferedImage>();

  public static final BufferedImage getSprite(final String imgName) {

    return spriteMap.get(imgName);
  }

  public static final BufferedImage loadSprite(ThemeFileFetcher tff, final String name) throws IOException {

    return tff.getImageFile(name);
  }

}
