package me.BlackThunder.arctis.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Jobs implements CommandExecutor{

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("jobs")) {
                player.sendMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                player.sendMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "Arctis Job Menu");
                player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "/miner >>" + ChatColor.BLUE + " Sets your job as a miner");
                player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "/fisherman >>" + ChatColor.BLUE + " Sets your job as a fisherman");
                player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "/farmer >>" + ChatColor.BLUE + " Sets your job as a farmer");
                player.sendMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                return true;
            }

            if (cmd.getName().equalsIgnoreCase("miner")) {

                player.sendMessage(ChatColor.GREEN + "You have selected the miner role!");

                ItemStack miner = new ItemStack(Material.DIAMOND_PICKAXE, 1);
                ItemMeta minermeta = miner.getItemMeta();
                minermeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "MINER'S " + ChatColor.YELLOW + "" + ChatColor.BOLD + "PICKAXE");
                List<String> minerlore = Arrays.asList("The pickaxe given upon joining the miner role!");
                minermeta.setLore(minerlore);
                minermeta.addEnchant(Enchantment.DURABILITY, 10, false);
                minermeta.addEnchant(Enchantment.DIG_SPEED, 3, false);
                minermeta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 2, false);
                miner.setItemMeta(minermeta);
                player.getInventory().addItem(miner);

                return true;
            }

            if (cmd.getName().equalsIgnoreCase("fisherman")) {
                player.sendMessage(ChatColor.GREEN + "You have selected the fisherman role!");

                ItemStack fisherman = new ItemStack(Material.FISHING_ROD, 1);
                ItemMeta fishermanmeta = fisherman.getItemMeta();
                fishermanmeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "FISHERMAN'S " + ChatColor.YELLOW + "" + ChatColor.BOLD + "ROD");
                List<String> fishermanlore = Arrays.asList("The rod given upon joining the fisherman role!");
                fishermanmeta.setLore(fishermanlore);
                fishermanmeta.addEnchant(Enchantment.DURABILITY, 10, false);
                fishermanmeta.addEnchant(Enchantment.LUCK, 2, false);
                fishermanmeta.addEnchant(Enchantment.LURE, 2, false);
                fisherman.setItemMeta(fishermanmeta);
                player.getInventory().addItem(fisherman);

                return true;
            }

            if (cmd.getName().equalsIgnoreCase("farmer")) {

                player.getInventory().removeItem(miner);

                player.sendMessage(ChatColor.GREEN + "You have selected the farmer role!");

                ItemStack farmer = new ItemStack(Material.FISHING_ROD, 1);
                ItemMeta farmermeta = farmer.getItemMeta();
                farmermeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "FARMER'S " + ChatColor.YELLOW + "" + ChatColor.BOLD + "HOE");
                List<String> farmerlore = Arrays.asList("The rod given upon joining the fisherman role!");
                farmermeta.setLore(farmerlore);
                farmermeta.addEnchant(Enchantment.DURABILITY, 10, false);
                farmer.setItemMeta(farmermeta);
                player.getInventory().addItem(farmer);

                return true;
            }

        }

        return false;
    }
}