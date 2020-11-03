package net.GladiusMC.GladiusLib;

import org.bukkit.plugin.java.JavaPlugin;

public class GladiusLib {

    private final JavaPlugin plugin;

    public GladiusLib(JavaPlugin plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginCommand("example").setExecutor(new ExampleCommand());
    }

    public JavaPlugin getPlugin() {
        return plugin;
    }
}
