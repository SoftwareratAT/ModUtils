package xyz.inlineyt.modutils.ui;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import xyz.inlineyt.modutils.builder.ItemBuilder;

public class Mod {  Inventory inventory = Bukkit.createInventory(null, 5* 9, "Modmenu");
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

}
