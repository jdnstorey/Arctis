package me.BlackThunder.arctis.kits;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Venus implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

        ItemStack sword = new ItemStack(Material.IRON_SWORD);
        ItemMeta swordmeta = sword.getItemMeta();
        swordmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Venus Sword");
        swordmeta.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
        swordmeta.addEnchant(Enchantment.DURABILITY, 5, true);
        sword.setItemMeta(swordmeta);

        ItemStack helmet = new ItemStack(Material.IRON_HELMET);
        ItemMeta helmetmeta = helmet.getItemMeta();
        helmetmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Venus Helmet");
        helmetmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
        helmetmeta.addEnchant(Enchantment.DURABILITY, 5, true);
        helmet.setItemMeta(helmetmeta);

        ItemStack chestplate = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta chestplatemeta = chestplate.getItemMeta();
        chestplatemeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Venus Chestplate");
        chestplatemeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
        chestplatemeta.addEnchant(Enchantment.DURABILITY, 5, true);
        chestplate.setItemMeta(chestplatemeta);

        ItemStack leggings = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta leggingsmeta = leggings.getItemMeta();
        leggingsmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Venus Leggings");
        leggingsmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
        leggingsmeta.addEnchant(Enchantment.DURABILITY, 5, true);
        leggings.setItemMeta(leggingsmeta);

        ItemStack boots = new ItemStack(Material.IRON_BOOTS);
        ItemMeta bootsmeta = boots.getItemMeta();
        bootsmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Venus Boots");
        bootsmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
        bootsmeta.addEnchant(Enchantment.DURABILITY, 5, true);
        boots.setItemMeta(bootsmeta);

        ItemStack bow = new ItemStack(Material.BOW);
        ItemMeta bowmeta = bow.getItemMeta();
        bowmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Venus Bow");
        bowmeta.addEnchant(Enchantment.ARROW_DAMAGE, 2, true);
        bowmeta.addEnchant(Enchantment.ARROW_KNOCKBACK, 2, true);
        bowmeta.addEnchant(Enchantment.DURABILITY, 5, true);
        bow.setItemMeta(bowmeta);

        ItemStack arrows = new ItemStack(Material.ARROW, 64);
        ItemStack shield = new ItemStack(Material.SHIELD, 1);
        ItemStack gapples = new ItemStack(Material.GOLDEN_APPLE, 16);
        ItemStack crapples = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 2);


        if(sender instanceof Player){
            Player player = (Player) sender;
            Player target = Bukkit.getPlayer(args[1]);
            if(cmd.getName().equalsIgnoreCase("kit")) {
                if (player.hasPermission("venus.use")) {
                    if (args.length == 1 || args[1].equalsIgnoreCase("venus")) {

                        player.getInventory().clear();
                        player.getInventory().addItem(sword);
                        player.getInventory().addItem(helmet);
                        player.getInventory().addItem(chestplate);
                        player.getInventory().addItem(leggings);
                        player.getInventory().addItem(boots);
                        player.getInventory().addItem(bow);
                        player.getInventory().addItem(arrows);
                        player.getInventory().addItem(arrows);
                        player.getInventory().addItem(shield);
                        player.getInventory().addItem(gapples);
                        player.getInventory().addItem(crapples);
                        return true;
                    } else if (args.length == 2 || args[1].equalsIgnoreCase("venus")) {

                        target.getInventory().clear();
                        target.getInventory().addItem(sword);
                        target.getInventory().addItem(helmet);
                        target.getInventory().addItem(chestplate);
                        target.getInventory().addItem(leggings);
                        target.getInventory().addItem(boots);
                        target.getInventory().addItem(bow);
                        target.getInventory().addItem(arrows);
                        target.getInventory().addItem(arrows);
                        target.getInventory().addItem(shield);
                        target.getInventory().addItem(gapples);
                        target.getInventory().addItem(crapples);
                        return true;
                    } else {
                        player.sendMessage(ChatColor.RED + "Insufficient Arguments");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "You do not have permission to use Venus Kit");
                }
            }
        } else {
            sender.sendMessage(ChatColor.RED + "You are not a player!");
        }
        return true;
    }
}
