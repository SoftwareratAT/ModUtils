package xyz.inlineyt.modutils;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.inlineyt.modutils.Listners.InventoryClick;
import xyz.inlineyt.modutils.Listners.JoinListener;
import xyz.inlineyt.modutils.ui.ModUI;
import xyz.inlineyt.modutils.ui.ModUtils;

public final class Main extends JavaPlugin {

    private String gamemode;
    @Override
    public void onEnable() {
        // Plugin startup logic
        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new InventoryClick(), this);
        manager.registerEvents(new JoinListener(), this);
        getCommand("Mod").setExecutor(new ModUI());
        
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }



    public String GetGameMode() {
        return gamemode;
    }




}
