package com.rath.tagm.gui;

import java.util.HashMap;

import com.rath.tagm.util.ConfigFetcher;
import com.rath.tagm.util.DP;

/**
 * This class handles keybinds.
 * 
 * @author Tim Backus tbackus127@gmail.com
 */
public class KeyBindings {

  /** A table mapping from KeyType to VKey. */
  private static final int[] keyTypeTable = new int[KeyType.values().length];

  /** A map from a binded VKey to its KeyType. */
  private static final HashMap<Integer, KeyType> vkeyMap = new HashMap<Integer, KeyType>();

  /**
   * Loads the key bindings from the config file.
   */
  public static final void loadKeyBindings() {

    DP.l("Loading key bindings...");
    
    for (final KeyType kt : KeyType.values()) {
      DP.l("Getting binding for " + kt.name() + ".");
      final String keyConfig = ConfigFetcher.getValue(kt.getConfigVal());
      DP.l("Value: \"" + keyConfig + "\".");
      final int keyID = Integer.parseInt(keyConfig);
      rebindKey(kt, keyID);
    }
  }

  /**
   * Gets the virtual key ID for the given key type.
   * 
   * @param kt the KeyType to get the VKey for.
   * @return the VKey ID as an int.
   */
  public static final int getVKey(final KeyType kt) {

    return keyTypeTable[kt.ordinal()];
  }

  /**
   * Rebinds a key.
   * 
   * @param kt the KeyType to rebind.
   * @param vkey the virtual key ID to rebind the key type to.
   */
  public static final void rebindKey(final KeyType kt, final int vkey) {

    keyTypeTable[kt.ordinal()] = vkey;
    setKeyType(vkey, kt);
  }

  /**
   * Gets the type of key a virtual key is bound to, if any. Returns null if no binding exists.
   * 
   * @param vkey the virtual key to check.
   * @return a KeyType value.
   */
  public static final KeyType getKeyType(final int vkey) {

    return vkeyMap.get(vkey);
  }

  /**
   * Associates a virtual key ID with a key type.
   * 
   * @param vkey the VKey to associate.
   * @param kt the KeyType to associate.
   */
  private static final void setKeyType(final int vkey, final KeyType kt) {

    vkeyMap.put(vkey, kt);
  }
}
