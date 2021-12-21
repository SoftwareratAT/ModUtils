/*
 * Copyright (c) 2021.
 */

package xyz.inlineyt.modutils.Template;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
//
//Template for creating Arg CommandExecutors
//Arg = if in an Command Space has been Pressed an new Atribute is beginning
//
public class CommandExecutorTwoArgTemplate implements CommandExecutor {
@Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    Player player = (Player) sender;
    if(args[1].equalsIgnoreCase("arg1")) {
}
    else if(args[1].equalsIgnoreCase("arg2")) {
    }
        return true;}
}
