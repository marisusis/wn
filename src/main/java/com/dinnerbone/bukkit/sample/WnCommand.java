package com.dinnerbone.bukkit.sample;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WnCommand implements CommandExecutor{

	public boolean onCommand(final CommandSender sender, Command cmd, String label, String[] args) {

		String wnp = "[WN] ";
		// TODO Auto-generated method stub
		if (cmd.getName().equalsIgnoreCase("wn")) {
			
			if (args[0].equalsIgnoreCase("help")) {
				helpMessage(sender);
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
			else {
				helpMessage(sender);
			}

		}
		
		return false;
	}
	public void helpMessage(CommandSender sender) {
		String wnp = "[WN] ";
		sender.sendMessage(wnp + "--------[Help]--------" );
		sender.sendMessage(wnp + "Use /wn help for help");
		sender.sendMessage(wnp + "Use /wn hello to say hello");
	}

}
