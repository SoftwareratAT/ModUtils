package xyz.inlineyt.modutils.permissions;

import de.dytanic.cloudnet.driver.CloudNetDriver;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PermissionCommand implements CommandExecutor {
    @Override


    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
  //         if (Bukkit.getPlayer(args[0]) == null) {
         //       sender.sendMessage("Dieser Spieler ist nicht Online");
    //        }
    //        if(args[1].equalsIgnoreCase("add")) {
//
 //               Player player = Bukkit.getPlayer(args[0]);
   //             CloudNetDriver.getInstance().getPermissionManagement().modifyUser(player.getUniqueId(), permissionUser -> {
     //               permissionUser.addGroup(args[2]);

       //             sender.sendMessage("der Spieler" + player + "ist nun in der :" + args[2] + "Gruppe");

         //       });
           // }
            //else if(args[1].equalsIgnoreCase("remove")) {
            //    Player player = Bukkit.getPlayer(args[0]);
            //    CloudNetDriver.getInstance().getPermissionManagement().modifyUser(player.getUniqueId(), permissionUser -> {
             //       permissionUser.removeGroup(args[2]);
             //       sender.sendMessage("der Spieler" + player + "ist nun nicht mehr in der :" + args[2] + "Gruppe");
              //  });
        //    }
        return false;
    }




}
