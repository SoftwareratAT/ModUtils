/*
 * Copyright (c) 2021.
 */

package xyz.inlineyt.modutils.ui;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import xyz.inlineyt.modutils.builder.ItemBuilder;

//
//Template for creating Arg CommandExecutors
//Arg = if in an Command Space has been Pressed an new Atribute is beginning
//
public class Settings implements CommandExecutor {
@Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    Player player = (Player) sender;
    Inventory inventory = Bukkit.createInventory(null, 5* 9, ChatColor.GREEN + "Mod | " + ChatColor.GRAY +"Einstellungen");
    //checks the Gamemode and Switches the Items
    if (player.getGameMode() == GameMode.CREATIVE) {
        inventory.setItem(20, new ItemBuilder(Material.GREEN_DYE).setDisplayname("Gamemode Survival").setLocalizedName("Survival").build());
        inventory.setItem(21, new ItemBuilder(Material.COMPASS).setDisplayname("Gamemode Spectator").setLocalizedName("Spectator").build());
    } else if (player.getGameMode() == GameMode.SPECTATOR) {
        inventory.setItem(20, new ItemBuilder(Material.GREEN_DYE).setDisplayname("Gamemode Survival").setLocalizedName("Survival").build());
        inventory.setItem(21, new ItemBuilder(Material.BEDROCK).setDisplayname("Gamemode Creative").setLocalizedName("Creative").build());
    } else if (player.getGameMode() == GameMode.SURVIVAL) {
        inventory.setItem(20, new ItemBuilder(Material.BEDROCK).setDisplayname("Gamemode Creative").setLocalizedName("Creative").build());
        inventory.setItem(21, new ItemBuilder(Material.COMPASS).setDisplayname("Gamemode Spectator").setLocalizedName("Spectator").build());

    } else {
        inventory.setItem(21, new ItemBuilder(Material.GRAY_DYE).setDisplayname("Gamemode Kann zur Zeit nicht gewechselt werden").setLocalizedName("gmnotchangeable").build());
    }

    inventory.setItem(0, new ItemBuilder(Material.GRASS_BLOCK).setDisplayname("Bauserver Joinen ").setLocalizedName("Bauserver").build());

    //inventory.setItem(0, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
    inventory.setItem(1, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
    inventory.setItem(2, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
    inventory.setItem(3, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
    inventory.setItem(4, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
    inventory.setItem(5, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
    inventory.setItem(6, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
    inventory.setItem(7, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
    inventory.setItem(8, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
    inventory.setItem(36, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
    inventory.setItem(37, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
    inventory.setItem(38, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
    inventory.setItem(39, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
    inventory.setItem(40, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
    inventory.setItem(41, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
    inventory.setItem(42, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
    inventory.setItem(43, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
    inventory.setItem(44, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());


    player.openInventory(inventory);

    return false;
}

}
