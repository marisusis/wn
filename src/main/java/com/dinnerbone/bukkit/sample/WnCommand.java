package com.dinnerbone.bukkit.sample;

import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Egg;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerEggThrowEvent;

public class WnCommand implements CommandExecutor{
	
	private final WnPlugin plugin;

    public WnCommand(WnPlugin plugin) {
        this.plugin = plugin;
    }
	public boolean onCommand(final CommandSender sender, Command cmd, String label, String[] args) {
		
		// TODO Auto-generated method stub
		if (cmd.getName().equalsIgnoreCase("wn")) {
			
			if (args.length == 0) {
				helpMessage(sender);
			}
			else if (args.length == 1 && args[0].equalsIgnoreCase("help")){
				helpMessage(sender);
			}
			else if (args.length == 1 && args[0].equalsIgnoreCase("hack")) {
				Player plyr	= sender.getServer().getPlayer(sender.getName());
				plyr.kickPlayer(ChatColor.RED + "You hacked!");				
			}
			else if (args.length == 1 && args[0].equalsIgnoreCase("cloud")) {
				Player player = (Player) sender;
				plugin.setCloud(player, !plugin.isCloud(player));
			}
			/*else if (args.length == 1 && args[0].equalsIgnoreCase("eggs")) {
				Player player = (Player) sender;
				boolean on;
		        if (on = false) {
		        	on = true;
		        	eggThrow(null, true);
		        }
		        else if (on = true) {
		        	on = false;
		        	eggThrow(null, false);
		        }
		    }*/
			/*else if (args.length == 1 && args[0].equalsIgnoreCase("compass")) {
				Player p = (Player) sender;
				Location l = p.getLocation();
				double x = l.getX();
				double y = l.getY();
				double z = l.getZ();
				double y2 = y + 100;
				Location l = 
				p.setCompassTarget(arg0);
			}*/
			/**else if (args.length == 1 && args[0].equalsIgnoreCase("say")) {
				Player player = (Player) sender;
				bcm(ChatColor.BLUE + "" + ChatColor.BOLD + "" + player +);
			}*/
			/*else if (args.length == 1 && args[0].equalsIgnoreCase("config")) {
				lcc(sender, "Creating config file...");
				Player player = (Player) sender;
				Config c = new Config(player.getUniqueId()); //Using "this" only works if it's in the main class, otherwise pass an instance of the main class into the class you're using and use the variable you set it to.
				c.set("are-cookies-good", true);
				c.set("multiple.lines.possible", true);
				c.save();
				boolean cookies = c.getConfig().getBoolean().get("are-cookies-good");
			}*/
			//TODO Add an important say command
			else if (args.length == 1 && args[0] == null) {
				xCmd(sender);
			}
			/**else if (args.length == 1 && args[0].equalsIgnoreCase("funfunfun")) {
				if (args.length == 2 && args[1] == null) {
					xCmd(sender);
				}
				else if (args.length == 2 && args[1].equalsIgnoreCase("byebye")) {
					Player plyr	= sender.getServer().getPlayer(sender.getName());
					plyr.kickPlayer(ChatColor.YELLOW + "Bye Bye.\n" + ChatColor.BOLD + "LOL");	
				}
				else if (args.length == 2 && args[1].equalsIgnoreCase(sender.getName())) {
					sm(sender, ChatColor.MAGIC + "|||||||||||||||");
				}
			}*/
			else if (args.length == 2 && args[0].equalsIgnoreCase("admin") && args[1].equalsIgnoreCase("broadcast")) {
				sm(sender, "Use the " + ChatColor.DARK_GREEN + "/wnb " + ChatColor.RESET + "command.");
			}
			
			
			/*if (args[0] == null) {
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
			}**/

		
		}
		return false;
	}
	public void helpMessage(CommandSender sender) {
		if (sender.isOp()) {
			Bukkit.getLogger().severe("Must create help message for opped players!");
			newfeature(sender);
		}
		else if (sender.isOp() == false) {
			Bukkit.getLogger().severe("Must create help message for normal players!");
			newfeature(sender);
		}
		else {
			Bukkit.getLogger().severe("Must create help message for normal players and opped players as well as CONSOLE!");
			newfeature(sender);
		}
		//else if (sender.)
		lc("Player: " + sender.getName() + " executed wn help command");
	}
	public void bcm(String message) {
		Bukkit.broadcastMessage(message);
	}
	public void newfeature(CommandSender sender) {
		sender.sendMessage(ChatColor.GREEN + "That feature is coming soon!");
	}
	public void xCmd(CommandSender sender) {
		sender.sendMessage(ChatColor.DARK_RED + "Invalid Command");
	}
	public void sm(CommandSender sender, String message) {
		sender.sendMessage(message);
	}
	public void lcc(CommandSender sender, String message) {
		String player = sender.getName();
		Bukkit.getLogger().log(Level.CONFIG, "PLAYER: " + player + " " + message);
	}
	public void lc(String message) {
		Bukkit.getLogger().log(Level.INFO, message);
	}
	
	/*@EventHandler
	public void eggThrow(PlayerEggThrowEvent event, boolean b) {
		Egg egg = event.getEgg();		
		if (b = true) {
		event.setHatchingType(EntityType.SHEEP);
		egg.setBounce(true);
		}
		else if (b = false) {
			event.setHatchingType(EntityType.CHICKEN);
			egg.setBounce(false);
		}
	}*/
}
