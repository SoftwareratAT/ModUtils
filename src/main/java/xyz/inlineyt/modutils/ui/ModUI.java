/*
 * Copyright (c) 2021.
 */

package xyz.inlineyt.modutils.ui;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import xyz.inlineyt.modutils.builder.ItemBuilder;


public class ModUI implements CommandExecutor {



    private String gamemode;
@Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {



        //
        // Sets The Gamemode for all Players including new Joins
        //





    if(args[1].equalsIgnoreCase("ui")) {
// Creates the UI
        Player player = (Player) sender;
        Inventory inventory = Bukkit.createInventory(null, 3 * 9, "Admin Tools");
        //checks the Gamemode and Switches the Items
        if (player.getGameMode() == GameMode.CREATIVE) {
        inventory.setItem(11, new ItemBuilder(Material.GREEN_CONCRETE).setDisplayname("OP selber Geben").setLocalizedName("Op ").build());
    inventory.setItem(10, new ItemBuilder(Material.GREEN_DYE).setDisplayname("Gamemode Survival").build());
    inventory.setItem(11, new ItemBuilder(Material.COMPASS).setDisplayname("Gamemode Spectator").setLocalizedName("Spectator").build());
} else if (player.getGameMode() == GameMode.SPECTATOR) {
    inventory.setItem(10, new ItemBuilder(Material.GREEN_DYE).setDisplayname("Gamemode Survival").build());
    inventory.setItem(11, new ItemBuilder(Material.BEDROCK).setDisplayname("Gamemode Creative").build());
} else if (player.getGameMode() == GameMode.SURVIVAL) {
    inventory.setItem(10, new ItemBuilder(Material.BEDROCK).setDisplayname("Gamemode Creative").setLocalizedName("Creative").build());
    inventory.setItem(11, new ItemBuilder(Material.COMPASS).setDisplayname("Gamemode Spectator").setLocalizedName("Spectator").build());
} else {
    inventory.setItem(11, new ItemBuilder(Material.GRAY_DYE).setDisplayname("Gamemode Kann zur Zeit nicht gewechselt werden").setLocalizedName("gmnotchangeable").build());
}



}
    else if(args[1].equalsIgnoreCase("Setup")) {
        Player player = (Player) sender;
        Inventory inventory = Bukkit.createInventory(null, 3 * 9, "Server Einstellungen");
        inventory.setItem(10, new ItemBuilder(Material.RED_CONCRETE).setDisplayname("Whitelist Ausschalten").setLocalizedName("WL off ").build());
        inventory.setItem(19, new ItemBuilder(Material.GREEN_CONCRETE).setDisplayname("Whitelist Anschalten").setLocalizedName("WL on ").build());
        inventory.setItem(12, new ItemBuilder(Material.COMPASS).setDisplayname("alle den GameMode Sepctator setzen").setLocalizedName("AllGmSpec").build());
        inventory.setItem(21, new ItemBuilder(Material.BEDROCK).setDisplayname("alle den GameMode Creative setzen").setLocalizedName("AllGmCreative").build());
        inventory.setItem(11, new ItemBuilder(Material.GREEN_DYE).setDisplayname("alle den GameMode Survival setzen").setLocalizedName("AllGmSurvival").build());
    }




        return true;}





}
