package me.BlackThunder.arctis.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kits implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("kits")) {
                player.sendMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Arctis Kit Menu");
                player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "/kit mercury >> Mercury Kit");
                player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "/kit venus >>" + ChatColor.GREEN + " Venus Kit");
                player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "/kit earth >>" + ChatColor.GREEN + " Earth Kit");
                player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "/kit mars >>" + ChatColor.GREEN + " Mars Kit");
                player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "/kit star >>" + ChatColor.GREEN + " Star Kit");
                player.sendMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                return true;
            }

            if (cmd.getName().equalsIgnoreCase("kit")){
                if(args.length > 0){
                    String kit = args[0];

                    if(args[0].equalsIgnoreCase("mercury")){
                    }
                    if(args[0].equalsIgnoreCase("venus")){

                    }
                    if(args[0].equalsIgnoreCase("earth")){

                    }
                    if(args[0].equalsIgnoreCase("mars")){

                    }
                    if(args[0].equalsIgnoreCase("star")){

                    }

                }
            }

        }
        return true;
    }
}
