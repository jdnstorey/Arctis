package me.BlackThunder.arctis.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Help implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("help")) {
                player.sendMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Arctis Main Help Menu");
                player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "/help >>" + ChatColor.GREEN + " Brings up this menu");
                player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "/jobs >>" + ChatColor.GREEN + " Brings up the job menu");
                player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "/kits >>" + ChatColor.GREEN + " Brings up the kits menu");
                player.sendMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                return true;
            }
        }
        return false;
    }
}
