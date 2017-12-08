package com.rath.tagm.util;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * This class handles fetching and getting game config values.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class ConfigFetcher {

  /** The path and name of the config file. */
  private static final String PATH = "TAtkGM.conf";

  /** The map storing config names and values as a String. */
  private static HashMap<String, String> configMap = null;

  /**
   * Builds the config map.
   */
  public static final void buildMap() {

    DP.l("Building config table...");

    final File cfile = new File(PATH);
    if (!cfile.exists()) {
      System.err.println("Cannot find file \"" + cfile.getAbsolutePath() + "\".");
    }

    Scanner fscan = null;
    try {
      fscan = new Scanner(cfile);
      buildMap(fscan);
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }

    fscan.close();

  }

  /**
   * Builds the map if it does not already exist, and then gets the specified config value.
   * 
   * @param name the title of the config value.
   * @return the String value of the config exactly as it appears in the file.
   */
  public static final String getValue(final String name) {

    if (configMap == null) {
      buildMap();
    }
    return configMap.get(name);
  }

  /**
   * Builds the map.
   * 
   * @param fscan a Scanner already opened on the config file.
   */
  private static final void buildMap(final Scanner fscan) {

    configMap = new HashMap<String, String>();
    int lineNum = 1;

    while (fscan.hasNextLine()) {
      final String line = fscan.nextLine();
      DP.l("Config file line: \"" + line + "\".");
      final String[] tokens = line.split(":");
      if (tokens.length != 2) {
        System.err.println("Config error on line " + lineNum + "!");
      }
      configMap.put(tokens[0].trim().toLowerCase(), tokens[1].trim().toLowerCase());
      lineNum++;
    }

  }

}
