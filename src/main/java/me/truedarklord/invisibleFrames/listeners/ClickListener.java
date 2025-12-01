package me.truedarklord.invisibleFrames.listeners;

import me.truedarklord.invisibleFrames.InvisibleFrames;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class ClickListener implements Listener {

    public ClickListener(InvisibleFrames plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        if (!event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) return;
        if (!player.isSneaking()) return;

        Block block = event.getClickedBlock();

        if (block == null) return;
        if (!block.getType().equals(Material.ITEM_FRAME)) return;
        if (!player.hasPermission("invisibleframes.toggle")) return;

        ItemFrame frame = (ItemFrame) block.getState();

        frame.setVisible(!frame.isVisible());
    }

}
