package com.mackan.helloworld;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class HelloWorld extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void ModeSwitch (PlayerGameModeChangeEvent event) {
        event.getPlayer().sendMessage(ChatColor.BLUE + "Haha, du bytte gamemode!");
    }

    @EventHandler
    public void DeathMsg (PlayerDeathEvent event) {
        event.getPlayer().sendMessage(ChatColor.RED + "Haha, du dog som fan!");
    }
}