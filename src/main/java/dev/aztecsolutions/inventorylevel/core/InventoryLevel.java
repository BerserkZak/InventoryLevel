package dev.aztecsolutions.inventorylevel.core;

import dev.aztecsolutions.inventorylevel.listeners.InventoryOpenListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class InventoryLevel extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new InventoryOpenListener(), this);
    }

    @Override
    public void onDisable() {
    }
}
