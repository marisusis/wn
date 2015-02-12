package com.dinnerbone.bukkit.sample;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WnReportCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			if (cmd.equals("report")) {
				if (args.length == 1) {
					Player player = (Player) sender;
					String p = player.getDisplayName();
					player.sendMessage("The /report command is coming soon.");
				}

			}
		}
		return false;
	}

}
