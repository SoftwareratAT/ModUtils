/*
 * Copyright Tobias Frauscher (c) 2021.
 */

package xyz.inlineyt.modutils.Listners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClick implements Listener {

    @EventHandler
    public void onInvClick(InventoryClickEvent event) {



        if (event.getCurrentItem() == null) return;

        if (event.getView().getTitle() == "Modmenu") {
            event.setCancelled(true);
            if (event.getCurrentItem().getItemMeta().hasLocalizedName()) {
                Player player = (Player) event.getWhoClicked();
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
                        break;
                    case "Bauserver" :
                        player.chat("/server Bauserver-1");


                }
            }
        } else if (event.getView().getTitle() == "Setup") {
            if (event.getCurrentItem().getItemMeta().hasLocalizedName()) {
                Player player = (Player) event.getWhoClicked();
                event.setCancelled(true);


                switch (event.getCurrentItem().getItemMeta().getLocalizedName()) {
                    case "WL off":
                        Bukkit.setWhitelist(false); //disable whitelist
                        player.sendMessage(ChatColor.RED + "Whitelist "+ ChatColor.GRAY + " | Aus");
                        player.closeInventory();
                        break;
                    case "WL on":
                        Bukkit.setWhitelist(true); //enable whitelist
                        player.sendMessage(ChatColor.GREEN + "Whitelist "+ ChatColor.GRAY + " | An");
                        player.closeInventory();
                        break;
                    case "AllGmSpec" :



                        setGM(3);
                        Bukkit.getOnlinePlayers().forEach(pl -> pl.setGameMode(GameMode.SPECTATOR));

                        player.closeInventory();
                        break;
                    case "AllGmCreative" :
                        setGM(1);


                        Bukkit.getOnlinePlayers().forEach(pl -> pl.setGameMode(GameMode.CREATIVE));

                        player.closeInventory();
                        break;
                    case "AllGmSurvival" :
                        setGM(0);


                        Bukkit.getOnlinePlayers().forEach(pl -> pl.setGameMode(GameMode.SURVIVAL));

                        player.closeInventory();
                        break;


                }



            }
        }




    }


    private static int gm;
    public void setGM(int gm){

        this.gm= gm;

    }
    public static int getGM(){

        return gm;
    }
}
