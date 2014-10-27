package com.dinnerbone.bukkit.sample;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class WnArgsCommand implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		String wnp = "[WitherNetwork]";
		// TODO Auto-generated method stub
		if (cmd.getName().equalsIgnoreCase("wn")) {
			if (args[0].equalsIgnoreCase("help")) {
				Bukkit.broadcastMessage(ChatColor.BOLD + wnp + ChatColor.LIGHT_PURPLE + "Use /bukkit:help wnplugin for help.");
			}
				
			else if (args[0].equalsIgnoreCase("hello")) {
				Bukkit.broadcastMessage(ChatColor.BOLD + wnp + ChatColor.GREEN + "Hello everyone!");
			}
				
			else if (args[0].equalsIgnoreCase("welcome")) {
				Bukkit.broadcastMessage(ChatColor.BOLD + wnp + ChatColor.RED + "Welcome everyone!");
			}
				
			else if (args[0].equalsIgnoreCase("crap")) {
				Bukkit.broadcastMessage(ChatColor.BOLD + wnp + ChatColor.MAGIC + "crap" + ChatColor.RESET + " =" + ChatColor.GRAY + "crap");
			}

		}
		
		return false;
	}

}
