/*
 * Copyright (c) 2021.
 */

package xyz.inlineyt.modutils.Listners;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClick implements Listener {
    @EventHandler
    public void onInvClick(InventoryClickEvent event) {

        if (event.getCurrentItem() == null) return;

        if (event.getView().getTitle() == "Admin Tools") {
            Player player = (Player) event.getWhoClicked();
            event.setCancelled(true);
            if (event.getCurrentItem().getItemMeta().hasLocalizedName()) {
                switch (event.getCurrentItem().getItemMeta().getLocalizedName()) {
                    case "Creative":
                        player.setGameMode(GameMode.CREATIVE);
                        player.closeInventory();
                        break;
                    case "Survival":
                        player.setGameMode(GameMode.SURVIVAL);
                        player.closeInventory();
                        break;
                    case "Spectator":
                        player.setGameMode(GameMode.SPECTATOR);
                        player.closeInventory();
                        break;
                    case "Op" :
                        player.setOp(true);

                }
            }
        }
    }
}
