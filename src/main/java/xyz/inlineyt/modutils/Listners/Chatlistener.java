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
        if(p.hasPermission("de.craftunity.chat.prefix.player")){
            event.setFormat(ChatColor.DARK_GRAY + "" + ChatColor.GRAY + "MEMBER" + ChatColor.DARK_GRAY + ": " + ChatColor.DARK_GREEN + p.getDisplayName() + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + event.getMessage());
            //This will give the player with that permission node that Chat format.
        }else if(p.hasPermission("de.craftunity.chat.prefix.moderator")){
            event.setFormat(ChatColor.DARK_GRAY + "" + ChatColor.GREEN + "MODERATOR" + ChatColor.DARK_GRAY + ": " + ChatColor.RED + p.getDisplayName() + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + event.getMessage());
            //This will give the player with that permission node that Chat format.
        }else if(p.hasPermission("de.craftunity.chat.prefix.Admin")){
            event.setFormat(ChatColor.DARK_GRAY + "" + ChatColor.DARK_RED + "ADMIN" + ChatColor.DARK_GRAY + ": " + ChatColor.DARK_RED + p.getDisplayName() + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + event.getMessage());
            //This will give the player with that permission node that Chat format.
        }else if(p.hasPermission("de.craftunity.chat.prefix.Content")){
            event.setFormat(ChatColor.DARK_GRAY + "" + ChatColor.RED + "Content" + ChatColor.DARK_GRAY + ": " + ChatColor.DARK_GREEN + p.getDisplayName() + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + event.getMessage());
            //This will give the player with that permission node that Chat format.
        }else if(p.hasPermission("de.craftunity.chat.prefix.Developer")){
            event.setFormat(ChatColor.DARK_GRAY + "" + ChatColor.AQUA + "Dev" + ChatColor.DARK_GRAY + ": " + ChatColor.DARK_GREEN + p.getDisplayName() + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + event.getMessage());
            //This will give the player with that permission node that Chat format.
        }else if(p.hasPermission("de.craftunity.chat.prefix.ContentCreatorI")){
            event.setFormat(ChatColor.DARK_GRAY + "" + ChatColor.DARK_PURPLE + "ContentCreator+" + ChatColor.DARK_GRAY + ": " + ChatColor.DARK_GREEN + p.getDisplayName() + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + event.getMessage());
            //This will give the player with that permission node that Chat format.
        }else if(p.hasPermission("de.craftunity.chat.prefix.ContentCreatorII")){
            event.setFormat(ChatColor.DARK_GRAY + "" + ChatColor.DARK_PURPLE + "ContentCreator" + ChatColor.DARK_GRAY + ": " + ChatColor.DARK_GREEN + p.getDisplayName() + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + event.getMessage());
            //This will give the player with that permission node that Chat format.
        }else if(p.hasPermission("de.craftunity.chat.prefix.Owner")){
            event.setFormat(ChatColor.DARK_GRAY + "" + ChatColor.DARK_RED + "Owner" + ChatColor.DARK_GRAY + ": " + ChatColor.DARK_GREEN + p.getDisplayName() + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + event.getMessage());
            //This will give the player with that permission node that Chat format.
        }else if(p.hasPermission("de.craftunity.chat.prefix.TTV-Mod")){
            event.setFormat(ChatColor.DARK_GRAY + "" + ChatColor.DARK_PURPLE + "Mod" + ChatColor.DARK_GRAY + ": " + ChatColor.DARK_GREEN + p.getDisplayName() + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + event.getMessage());
            //This will give the player with that permission node that Chat format.
        }else         if(p.hasPermission("de.craftunity.chat.prefix.Team")){
            event.setFormat(ChatColor.DARK_GRAY + "" + ChatColor.YELLOW + "Team" + ChatColor.DARK_GRAY + ": " + ChatColor.DARK_GREEN + p.getDisplayName() + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + event.getMessage());
            //This will give the player with that permission node that Chat format.
        }else  if(p.hasPermission("de.craftunity.chat.prefix.Vip")){
            event.setFormat(ChatColor.DARK_GRAY + "" + ChatColor.LIGHT_PURPLE + "Vip" + ChatColor.DARK_GRAY + ": " + ChatColor.DARK_GREEN + p.getDisplayName() + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + event.getMessage());
            //This will give the player with that permission node that Chat format.
        } else  if(p.hasPermission("de.craftunity.chat.prefix.Builder")){
            event.setFormat(ChatColor.DARK_GRAY + "" + ChatColor.GREEN + "Builder" + ChatColor.DARK_GRAY + ": " + ChatColor.DARK_GREEN + p.getDisplayName() + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + event.getMessage());
            //This will give the player with that permission node that Chat format.
        }
    }

}





