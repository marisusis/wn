package com.dinnerbone.bukkit.sample;

import org.bukkit.EntityEffect;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;

public class WnEggListener implements Listener {

	private final WnPlugin plugin;
	public WnEggListener(WnPlugin instance) {
		plugin = instance;
	}
	@EventHandler
	public void onEggThrow(PlayerEggThrowEvent event) {
		Egg egg = event.getEgg();
		event.setHatchingType(EntityType.MINECART);
		egg.setBounce(true);
		egg.playEffect(EntityEffect.WOLF_HEARTS);
		Cow cow = (Cow) egg.getWorld().spawnEntity(egg.getLocation(), EntityType.COW);
		egg.setPassenger(cow);
	}
}
