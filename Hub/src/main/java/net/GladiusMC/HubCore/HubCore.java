package net.GladiusMC.HubCore;

import net.GladiusMC.GladiusLib.GladiusLib;
import net.GladiusMC.GladiusLib.Utilities.TextUtil;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class HubCore extends JavaPlugin {

    private GladiusLib gladiusLib;
    private ConsoleCommandSender console;

    public void onEnable() {
        long start = System.nanoTime();

        this.gladiusLib = new GladiusLib(this);
        this.console = getServer().getConsoleSender();

        console.sendMessage(TextUtil.parse("&3Enabled &cHubCore &3in " + (System.nanoTime() - start) + " milliseconds!"));
    }

    public void onDisable() {
        long start = System.nanoTime();
        console.sendMessage(TextUtil.parse("&cDisabled &3HubCore &cin " + (System.nanoTime() - start) + " milliseconds!"));
    }

}
