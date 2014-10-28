package com.dinnerbone.bukkit.sample;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WnBroadcastCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			if (cmd.equals("wnb")) {
				if (args.length == 1) {
					Player player = (Player) sender;
					String p = player.getDisplayName();
					bcm(ChatColor.BLUE + p + ChatColor.BOLD + " - " + args[0]);
				}

			}
		}
		return false;
	}
	/*else if (args.length == 1 && args[0].equalsIgnoreCase("say")) {
		Player player = (Player) sender;
		bcm(ChatColor.BLUE + "" + ChatColor.BOLD + "" + player +);
	}*/
	public void bcm(String message) {
		Bukkit.broadcastMessage(message);
	}
}

