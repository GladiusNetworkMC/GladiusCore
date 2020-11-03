package net.GladiusMC.HubCore;

import net.GladiusMC.GladiusLib.GladiusLib;
import org.bukkit.plugin.java.JavaPlugin;

public class HubCore extends JavaPlugin {

    GladiusLib lib;

    public void onEnable() {

        // Initialize Library
        lib = new GladiusLib(this);

    }

    public void onDisable() {

    }

}
