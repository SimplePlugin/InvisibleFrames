package me.truedarklord.invisibleFrames.listeners;

import me.truedarklord.invisibleFrames.InvisibleFrames;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import org.bukkit.event.player.PlayerInteractEntityEvent;


public class ClickListener implements Listener {

    public ClickListener(InvisibleFrames plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onClick(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();

        if (!player.isSneaking()) return;

        if (!(event.getRightClicked() instanceof ItemFrame frame)) return;

        if (!player.hasPermission("invisibleframes.toggle")) return;

        frame.setVisible(!frame.isVisible());
    }

}
