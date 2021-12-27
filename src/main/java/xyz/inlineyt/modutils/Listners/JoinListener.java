package xyz.inlineyt.modutils.Listners;

import org.bukkit.ChatColor;

import org.bukkit.GameMode;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


import java.io.File;



public class JoinListener implements Listener   {
    static File customYml = new File("/customYmlFile.yml");



    static FileConfiguration customConfig = YamlConfiguration.loadConfiguration(customYml);


    @EventHandler
    public void OnJoin(PlayerJoinEvent event) {
    event.setJoinMessage(ChatColor.GREEN + "Join |" +"%luckperms_prefix% | " + event.getPlayer().getName());

    if (InventoryClick.getGM()== 3) {
    event.getPlayer().setGameMode(GameMode.SPECTATOR);
    } else if (InventoryClick.getGM() == 1) {
        event.getPlayer().setGameMode(GameMode.CREATIVE);
    } else if (InventoryClick.getGM() == 0) {
        event.getPlayer().setGameMode(GameMode.SURVIVAL);
    } else if (InventoryClick.getGM() == 2) {
        event.getPlayer().setGameMode(GameMode.ADVENTURE);

    } else {return;}
    }





}
