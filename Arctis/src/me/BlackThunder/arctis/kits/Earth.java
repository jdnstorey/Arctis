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

public class Earth implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta swordmeta = sword.getItemMeta();
        swordmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Earth Sword");
        swordmeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        swordmeta.addEnchant(Enchantment.DURABILITY, 2, true);
        sword.setItemMeta(swordmeta);

        ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta helmetmeta = helmet.getItemMeta();
        helmetmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Earth Helmet");
        helmetmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        helmetmeta.addEnchant(Enchantment.DURABILITY, 2, true);
        helmet.setItemMeta(helmetmeta);

        ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta chestplatemeta = chestplate.getItemMeta();
        chestplatemeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Earth Chestplate");
        chestplatemeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        chestplatemeta.addEnchant(Enchantment.DURABILITY, 2, true);
        chestplate.setItemMeta(chestplatemeta);

        ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta leggingsmeta = leggings.getItemMeta();
        leggingsmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Earth Leggings");
        leggingsmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        leggingsmeta.addEnchant(Enchantment.DURABILITY, 2, true);
        leggings.setItemMeta(leggingsmeta);

        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta bootsmeta = boots.getItemMeta();
        bootsmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Earth Boots");
        bootsmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        bootsmeta.addEnchant(Enchantment.DURABILITY, 2, true);
        boots.setItemMeta(bootsmeta);

        ItemStack bow = new ItemStack(Material.BOW);
        ItemMeta bowmeta = bow.getItemMeta();
        bowmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Earth Bow");
        bowmeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
        bowmeta.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
        bowmeta.addEnchant(Enchantment.DURABILITY, 2, true);
        bow.setItemMeta(bowmeta);

        ItemStack arrows = new ItemStack(Material.ARROW, 64);
        ItemStack shield = new ItemStack(Material.SHIELD, 1);
        ItemStack gapples = new ItemStack(Material.GOLDEN_APPLE, 16);
        ItemStack crapples = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 2);


        if(sender instanceof Player){
            Player player = (Player) sender;
            Player target = Bukkit.getPlayer(args[1]);
            if(cmd.getName().equalsIgnoreCase("kit earth")) {
                if (player.hasPermission("earth.use")) {
                    if (args.length == 1) {

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
                    } else if (args.length == 2) {

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
                    player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "You do not have permission to use Earth Kit");
                }
            }
        } else {
            sender.sendMessage(ChatColor.RED + "You are not a player!");
        }
        return true;
    }

}
