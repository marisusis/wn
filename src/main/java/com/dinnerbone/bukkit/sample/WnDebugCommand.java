package com.dinnerbone.bukkit.sample;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Handler for the /debug sample command.
 * @author SpaceManiac
 */
public class WnDebugCommand implements CommandExecutor {
    private final WnPlugin plugin;

    public WnDebugCommand(WnPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] split) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            plugin.setDebugging(player, !plugin.isDebugging(player));

            return true;
        } else {
        	Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "Wither" + ChatColor.DARK_PURPLE + "Network" + ChatColor.RED + ChatColor.BOLD + " main plugin enabled!");
            return true;
        }
    }
}
