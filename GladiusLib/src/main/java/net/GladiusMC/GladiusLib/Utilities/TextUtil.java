package net.GladiusMC.GladiusLib.Utilities;

import org.bukkit.ChatColor;

public class TextUtil {

    public static String parse(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

}
