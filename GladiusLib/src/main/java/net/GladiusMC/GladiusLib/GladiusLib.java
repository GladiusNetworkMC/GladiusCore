package net.GladiusMC.GladiusLib;

import net.GladiusMC.HubCore.HubCore;

public class GladiusLib {

    private final HubCore plugin;

    public GladiusLib(HubCore plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginCommand("example").setExecutor(new ExampleCommand());
    }

}
