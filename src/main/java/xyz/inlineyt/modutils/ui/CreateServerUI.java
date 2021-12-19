/*
 * Copyright (c) 2021.
 */

package xyz.inlineyt.modutils.ui;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import xyz.inlineyt.modutils.builder.ItemBuilder;


public class CreateServerUI {
    void CreateServerGui(CommandSender sender) {

        Player player =(Player) sender;
        Inventory inventory = Bukkit.createInventory(null , 3*5, "Admin Tools");

        inventory.setItem(11,  new ItemBuilder(Material.GREEN_CONCRETE ).setDisplayname("OP selber Geben").setLocalizedName("Op ").build());

        if (player.getGameMode() == GameMode.CREATIVE) {
            inventory.setItem(10,  new ItemBuilder(Material.GREEN_DYE ).setDisplayname("Gamemode Survival").build());
            inventory.setItem(11,  new ItemBuilder(Material.COMPASS ).setDisplayname("Gamemode Spectator").setLocalizedName("Spectator").build());
        } else if (player.getGameMode() == GameMode.SPECTATOR) {
            inventory.setItem(10,  new ItemBuilder(Material.GREEN_DYE ).setDisplayname("Gamemode Survival").build());
            inventory.setItem(11,  new ItemBuilder(Material.BEDROCK ).setDisplayname("Gamemode Creative").build());
        }else if (player.getGameMode() == GameMode.SURVIVAL) {
            inventory.setItem(10,  new ItemBuilder(Material.BEDROCK ).setDisplayname("Gamemode Creative").setLocalizedName("Creative").build());
            inventory.setItem(11,  new ItemBuilder(Material.COMPASS ).setDisplayname("Gamemode Spectator").setLocalizedName("Spectator").build());
        } else {
            inventory.setItem(11,  new ItemBuilder(Material.GRAY_DYE ).setDisplayname("Gamemode Kann zur Zeit nicht gewechselt werden").setLocalizedName("gmnotchangeable").build());
        }

    }
}
