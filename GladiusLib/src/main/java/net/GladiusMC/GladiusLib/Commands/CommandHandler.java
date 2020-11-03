package net.GladiusMC.GladiusLib.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.Collections;
import java.util.List;

public class CommandHandler implements CommandExecutor, TabCompleter {

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        String commandName = command.getName().substring(0, 1).toUpperCase() + command.getName().substring(1);

            try {
                BaseCommand commandClass = (BaseCommand) Class.forName("net.GladiusMC.GladiusLib.Commands." + commandName).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cUnknown command. Sorry!"));
            }

        return true;
    }

    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return Collections.emptyList();
    }

}
