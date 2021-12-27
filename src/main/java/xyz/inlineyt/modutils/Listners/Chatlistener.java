package xyz.inlineyt.modutils.Listners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Chatlistener implements Listener {
    @EventHandler
    public void chatFormat(AsyncPlayerChatEvent event){
        Player p = event.getPlayer();
        event.setFormat(ChatColor.GRAY + "%luckperms_prefix%" + p.getDisplayName() + ChatColor.GRAY + " | " + ChatColor.WHITE + event.getMessage());
}}

