package xyz.inlineyt.modutils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.inlineyt.modutils.Listners.Chatlistener;
import xyz.inlineyt.modutils.Listners.InventoryClick;
import xyz.inlineyt.modutils.Listners.JoinListener;
import xyz.inlineyt.modutils.permissions.PermissionCommand;
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
        System.out.println(ChatColor.UNDERLINE + "                            ");
        System.out.println("              Mod Utils ");
        System.out.println("        Plugin wurde aktiviert");
        System.out.println(ChatColor.UNDERLINE + "                             ");
        getCommand("Rank").setExecutor(new PermissionCommand());





        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            manager.registerEvents(new Chatlistener(), this);
        } else {
            /*
             * We inform about the fact that PlaceholderAPI isn't installed and then
             * disable this plugin to prevent issues.
             */
            Bukkit.getPluginManager().disablePlugin(this);
        }





    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }



    public String GetGameMode() {
        return gamemode;
    }




}
