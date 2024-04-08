package dev.aztecsolutions.inventorylevel.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;
import org.jetbrains.annotations.NotNull;

public class InventoryOpenListener implements Listener {
    @EventHandler
    public void onPlayerOpeningEnderchest(InventoryOpenEvent e){

        @NotNull InventoryType playerInventory = e.getPlayer().getInventory().getType();
        Player player = (Player) e.getPlayer();

        if (!playerInventory.equals(InventoryType.ENDER_CHEST)) {
            if (player.hasPermission("aztecsolutions.levels.1")) {
                player.getInventory().close();
            }

    }


    }
}
