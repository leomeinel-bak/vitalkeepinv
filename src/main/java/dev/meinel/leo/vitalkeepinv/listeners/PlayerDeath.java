/*
 * File: PlayerDeath.java
 * Author: Leopold Meinel (leo@meinel.dev)
 * -----
 * Copyright (c) 2022 Leopold Meinel & contributors
 * SPDX ID: GPL-3.0-or-later
 * URL: https://www.gnu.org/licenses/gpl-3.0-standalone.html
 * -----
 */

package dev.meinel.leo.vitalkeepinv.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeath
		implements Listener {

	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event) {
		Player player = event.getPlayer();
		if (!player.hasPermission("vitalkeepinv.keep")) {
			return;
		}
		event.setKeepInventory(true);
		event.getDrops()
				.clear();
	}
}
