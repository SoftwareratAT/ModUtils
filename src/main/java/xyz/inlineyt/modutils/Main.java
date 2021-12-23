package xyz.inlineyt.modutils;


import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.inlineyt.modutils.Listners.InventoryClick;
import xyz.inlineyt.modutils.Listners.JoinListener;
import xyz.inlineyt.modutils.ui.ModHotBar;
import xyz.inlineyt.modutils.ui.ModUI;


public final class Main extends JavaPlugin {


    private String gamemode;
    @Override
    public void onEnable() {
        // Plugin startup logic
        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new InventoryClick(), this);
        manager.registerEvents(new JoinListener(), this);
        getCommand("Mod").setExecutor(new ModUI());
        getCommand("ModHotBar").setExecutor(new ModHotBar());
        
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }



    public String GetGameMode() {
        return gamemode;
    }




}
