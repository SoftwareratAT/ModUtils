package xyz.inlineyt.modutils.ui;

import me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import xyz.inlineyt.modutils.Listners.InventoryClick;
import xyz.inlineyt.modutils.builder.ItemBuilder;

public class Setup implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Inventory inventory = Bukkit.createInventory(null, 5 * 9, ChatColor.GREEN + "Mod | " + ChatColor.GRAY +"Setup");
        inventory.setItem(20, new ItemBuilder(Material.RED_CONCRETE).setDisplayname("Whitelist Ausschalten").setLocalizedName("WL off").build());
        inventory.setItem(21, new ItemBuilder(Material.GREEN_CONCRETE).setDisplayname("Whitelist Anschalten").setLocalizedName("WL on").build());
        inventory.setItem(22, new ItemBuilder(Material.COMPASS).setDisplayname("alle den GameMode Spectator setzen").setLocalizedName("AllGmSpec").build());
        inventory.setItem(23, new ItemBuilder(Material.BEDROCK).setDisplayname("alle den GameMode Creative setzen").setLocalizedName("AllGmCreative").build());
        inventory.setItem(24, new ItemBuilder(Material.GREEN_DYE).setDisplayname("alle den GameMode Survival setzen").setLocalizedName("AllGmSurvival").build());
        inventory.setItem(25, new ItemBuilder(Material.IRON_SWORD).setDisplayname("alle den Gamemode Adventure setzen").setLocalizedName("AllGmAdventure").build());
        inventory.setItem(0, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
        inventory.setItem(1, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
        inventory.setItem(2, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
        inventory.setItem(3, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
        inventory.setItem(4, new ItemBuilder(Material.LIGHT_GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("Placeholder").build());
        if (InventoryClick.getGM()== 3) {
            inventory.setItem(5, new ItemBuilder(Material.COMPASS).setDisplayname("Gamemode | Spectator "+ InventoryClick.getGM()).setLocalizedName("Placeholder").build());
        } else if (InventoryClick.getGM()== 2) {
            inventory.setItem(5, new ItemBuilder(Material.IRON_SWORD).setDisplayname("Gamemode | Adventure "+ InventoryClick.getGM()).setLocalizedName("Placeholder").build());
        } else if (InventoryClick.getGM()== 1) {
            inventory.setItem(5, new ItemBuilder(Material.BEDROCK).setDisplayname("Gamemode | Creative "+ InventoryClick.getGM()).setLocalizedName("Placeholder").build());
        } if (InventoryClick.getGM()== 0) {
            inventory.setItem(5, new ItemBuilder(Material.DIAMOND_PICKAXE).setDisplayname("Gamemode | Survival "+ InventoryClick.getGM()).setLocalizedName("Placeholder").build());
        }


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
