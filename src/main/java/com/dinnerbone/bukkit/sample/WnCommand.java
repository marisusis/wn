package com.dinnerbone.bukkit.sample;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class WnCommand implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		String wnp = "[WN] ";
		// TODO Auto-generated method stub
		if (cmd.getName().equalsIgnoreCase("wn")) {
			
			if (args[0].equalsIgnoreCase("")) {
				sender.sendMessage(ChatColor.GOLD + wnp + ChatColor.DARK_AQUA + "Do /wn help for help.");
			}
			if (args[0].equalsIgnoreCase("help")) {
				sender.sendMessage(ChatColor.GOLD + wnp + ChatColor.LIGHT_PURPLE + "Use /bukkit:help wnplugin for help.");
			}
				
			else if (args[0].equalsIgnoreCase("hello")) {
				Bukkit.broadcastMessage(ChatColor.GOLD + wnp + ChatColor.GREEN + "Hello everyone!");
			}
				
			else if (args[0].equalsIgnoreCase("welcome")) {
				Bukkit.broadcastMessage(ChatColor.GOLD + wnp + ChatColor.RED + "Welcome everyone!");
			}
				
			else if (args[0].equalsIgnoreCase("crap")) {
				sender.sendMessage(ChatColor.GOLD + wnp + ChatColor.MAGIC + "crap" + ChatColor.RESET + " = " + ChatColor.GRAY + "crap");
			}

		}
		
		return false;
	}

}
