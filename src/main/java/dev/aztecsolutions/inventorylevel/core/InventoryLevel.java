package dev.aztecsolutions.inventorylevel.core;

import dev.aztecsolutions.inventorylevel.commands.EndInvCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class InventoryLevel extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("endinv").setExecutor(new EndInvCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
