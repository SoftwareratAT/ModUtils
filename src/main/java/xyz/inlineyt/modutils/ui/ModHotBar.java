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

public class ModHotBar implements CommandExecutor {

    private String gamemode;
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if (sender instanceof Player) {
            if(args[0].equalsIgnoreCase("ui")) {


                Inventory inventory = ((Player) sender).getInventory();
                if (player.getGameMode() == GameMode.CREATIVE) {
                    inventory.setItem(5, new ItemBuilder(Material.GREEN_CONCRETE).setDisplayname("OP selber Geben").setLocalizedName("Op ").build());
                    inventory.setItem(1, new ItemBuilder(Material.GREEN_DYE).setDisplayname("Gamemode Survival").setLocalizedName("Survival").build());
                    inventory.setItem(7, new ItemBuilder(Material.COMPASS).setDisplayname("Gamemode Spectator").setLocalizedName("Spectator").build());
                } else if (player.getGameMode() == GameMode.SPECTATOR) {
                    inventory.setItem(1, new ItemBuilder(Material.GREEN_DYE).setDisplayname("Gamemode Survival").setLocalizedName("Survival").build());
                    inventory.setItem(7, new ItemBuilder(Material.BEDROCK).setDisplayname("Gamemode Creative").setLocalizedName("Creative").build());
                } else if (player.getGameMode() == GameMode.SURVIVAL) {
                    inventory.setItem(1, new ItemBuilder(Material.BEDROCK).setDisplayname("Gamemode Creative").setLocalizedName("Creative").build());
                    inventory.setItem(7, new ItemBuilder(Material.COMPASS).setDisplayname("Gamemode Spectator").setLocalizedName("Spectator").build());
                } else {
                    inventory.setItem(1&7, new ItemBuilder(Material.GRAY_DYE).setDisplayname("Gamemode Kann zur Zeit nicht gewechselt werden").setLocalizedName("gmnotchangeable").build());
                }



            }
            else if(args[0].equalsIgnoreCase("Setup")) {

                Inventory inventory = ((Player) sender).getInventory();
                inventory.clear();
                inventory.setItem(1, new ItemBuilder(Material.RED_CONCRETE).setDisplayname("Whitelist Ausschalten").setLocalizedName("WL off").build());
                inventory.setItem(2, new ItemBuilder(Material.GREEN_CONCRETE).setDisplayname("Whitelist Anschalten").setLocalizedName("WL on").build());
                inventory.setItem(6, new ItemBuilder(Material.COMPASS).setDisplayname("alle den GameMode Sepctator setzen").setLocalizedName("AllGmSpec").build());
                inventory.setItem(7, new ItemBuilder(Material.BEDROCK).setDisplayname("alle den GameMode Creative setzen").setLocalizedName("AllGmCreative").build());
                inventory.setItem(8, new ItemBuilder(Material.GREEN_DYE).setDisplayname("alle den GameMode Survival setzen").setLocalizedName("AllGmSurvival").build());

            }
        } else if(args[1].equalsIgnoreCase("wl")) {
            if(args[2].equalsIgnoreCase("add")) {
                if(args[3].equals(Bukkit.getPlayer(args[3])) ) {
                    Bukkit.getPlayer(args[3]).setWhitelisted(true);
                    sender.sendMessage(args[3] + "wurde gewhitelisted");
                }
            } }else {
            return true;
        }
        //
        // Sets The Gamemode for all Players including new Joins
        //










        return false;}
}
