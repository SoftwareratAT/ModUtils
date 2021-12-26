package xyz.inlineyt.modutils.Listners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Chatlistneer implements Listener {

    @EventHandler
    public void chatFormat(AsyncPlayerChatEvent event) {
        event.getFormat();
        Player p = event.getPlayer();
        event.setFormat(ChatColor.GRAY + "%luckperms_prefix% |" + p.getDisplayName() + ChatColor.GRAY + "> " + ChatColor.DARK_GRAY + event.getMessage());
//This is the default layout for Bukkit Chat Format but it has Gray characters on the name instead of White.

    }
}
