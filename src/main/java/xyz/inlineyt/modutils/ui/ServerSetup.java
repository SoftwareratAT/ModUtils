package xyz.inlineyt.modutils.ui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import xyz.inlineyt.modutils.builder.ItemBuilder;

public class ServerSetup implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
//
//        Player player = (Player) sender;
//        Inventory inventory = Bukkit.createInventory(null, 3 * 9, "Server Setup");
//        inventory.setItem(10, new ItemBuilder(Material.RED_CONCRETE).setDisplayname("Whitelist Ausschalten").setLocalizedName("WL off ").build());
//        inventory.setItem(19, new ItemBuilder(Material.GREEN_CONCRETE).setDisplayname("Whitelist Anschalten").setLocalizedName("WL on ").build());
//        inventory.setItem(12, new ItemBuilder(Material.COMPASS).setDisplayname("alle den GameMode Sepctator setzen").setLocalizedName("AllGmSpec").build());
//        inventory.setItem(21, new ItemBuilder(Material.BEDROCK).setDisplayname("alle den GameMode Creative setzen").setLocalizedName("AllGmCreative").build());
//        inventory.setItem(11, new ItemBuilder(Material.GREEN_DYE).setDisplayname("alle den GameMode Survival setzen").setLocalizedName("AllGmSurvival").build());
//
        return false;
    }
}
