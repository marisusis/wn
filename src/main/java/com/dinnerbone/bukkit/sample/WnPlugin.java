
package com.dinnerbone.bukkit.sample;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Sample plugin for Bukkit
 *
 * @author Dinnerbone
 */
public class WnPlugin extends JavaPlugin {
    private final WnPlayerListener playerListener = new WnPlayerListener(this);
    private final WnBlockListener blockListener = new WnBlockListener();
    private final WnEggListener eggListener = new WnEggListener(this);
    private final HashMap<Player, Boolean> debugees = new HashMap<Player, Boolean>();
    @Override
    public void onDisable() {
        // TODO: Place any custom disable code here

        // NOTE: All registered events are automatically unregistered when a plugin is disabled

        // EXAMPLE: Custom code, here we just output some info so we can check all is well
        getLogger().info("Goodbye world!");
    }

    @Override
    public void onEnable() {
        // TODO: Place any custom enable code here including the registration of any events
    	Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "Wither" + ChatColor.DARK_PURPLE + "Network" + ChatColor.RED + ChatColor.BOLD + " main plugin enabled!");
        // Register our events
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(playerListener, this);
        pm.registerEvents(blockListener, this);
        pm.registerEvents(eggListener, this);
        Location l = new Location(Bukkit.getWorld("newspawn"), 516, 5, 103);
        ParticleEffect.ANGRY_VILLAGER.display(1, 1, 1, 1, 1, l, 5);
       
        // Register our commands
        getCommand("pos").setExecutor(new WnPosCommand());
        getCommand("debug").setExecutor(new WnDebugCommand(this));
        getCommand("wn").setExecutor(new WnCommand(this));
        getCommand("wnb").setExecutor(new WnBroadcastCommand());
        

        // EXAMPLE: Custom code, here we just output some info so we can check all is well
        PluginDescriptionFile pdfFile = this.getDescription();
        getLogger().info( pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled!" );
    }

    public boolean isDebugging(final Player player) {
        if (debugees.containsKey(player)) {
            return debugees.get(player);
        } else {
            return false;
        }
    }
    public boolean isCloud(final Player player) {
        if (debugees.containsKey(player)) {
            return debugees.get(player);
        } else {
            return false;
        }
    }

    public void setDebugging(final Player player, final boolean value) {
        debugees.put(player, value);
    }

    public void setCloud(final Player player, final boolean value) {
        debugees.put(player, value);
    }
}
