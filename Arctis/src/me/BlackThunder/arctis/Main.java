package me.BlackThunder.arctis;

import me.BlackThunder.arctis.commands.Help;
import me.BlackThunder.arctis.commands.Jobs;
import me.BlackThunder.arctis.commands.Kits;
import me.BlackThunder.arctis.kits.*;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Arctis Enabled!");

        this.getCommand("help").setExecutor(new Help());
        this.getCommand("jobs").setExecutor(new Jobs());
        this.getCommand("kits").setExecutor(new Kits());

        this.getCommand("miner").setExecutor(new Jobs());
        this.getCommand("fisherman").setExecutor(new Jobs());
        this.getCommand("farmer").setExecutor(new Jobs());

        this.getCommand("kit").setExecutor(new Mercury());
        this.getCommand("kit").setExecutor(new Venus());
        this.getCommand("kit").setExecutor(new Earth());
        this.getCommand("kit").setExecutor(new Mars());
        this.getCommand("kit").setExecutor(new Star());
    }
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Arctis Disabled!");
    }

}
