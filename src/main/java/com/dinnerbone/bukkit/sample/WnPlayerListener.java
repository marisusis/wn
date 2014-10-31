
package com.dinnerbone.bukkit.sample;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * Handle events for all Player related events
 * @author Dinnerbone
 */
public class WnPlayerListener implements Listener {
    private final WnPlugin plugin;

    public WnPlayerListener(WnPlugin instance) {
        plugin = instance;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        plugin.getLogger().info(event.getPlayer().getName() + " joined the server! :D");
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        plugin.getLogger().info(event.getPlayer().getName() + " left the server! :'(");
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
    	Player p = event.getPlayer();
    	if (plugin.isCloud(p)) {
    	Location l = p.getLocation(); //Gets the players location
    	ParticleEffect.CLOUD.display(1, 1, 1, 2, 5, l, 3); //Displays cloud particles
    	}
        if (plugin.isDebugging(event.getPlayer())) {
            Location from = event.getFrom();
            Location to = event.getTo();
            //plugin.getLogger().info(String.format("From %.2f,%.2f,%.2f to %.2f,%.2f,%.2f", from.getX(), from.getY(), from.getZ(), to.getX(), to.getY(), to.getZ()));
        }
    }
}
