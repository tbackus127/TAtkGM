package com.rath.tagm.util;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ConfigFetcher {

  private static final String PATH = "TAtkGM.conf";
  private static final HashMap<String, String> configMap = new HashMap<String, String>();

  public static final void buildMap() {

    final File cfile = new File(PATH);
    Scanner fscan = null;
    try {
      fscan = new Scanner(cfile);
      buildMap(fscan);
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }

    fscan.close();

  }

  public static final String getValue(final String name) {

    return configMap.get(name);
  }

  private static final void buildMap(Scanner fscan) {

    int lineNum = 1;

    while (fscan.hasNextLine()) {
      final String line = fscan.nextLine();
      final String[] tokens = line.split(":");
      if (tokens.length != 2) {
        System.err.println("Config error on line " + lineNum + "!");
      }
      configMap.put(tokens[0].trim().toLowerCase(), tokens[1].trim().toLowerCase());
      lineNum++;
    }

  }

}
