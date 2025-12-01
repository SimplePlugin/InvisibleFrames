package me.truedarklord.invisibleFrames;

import me.truedarklord.invisibleFrames.listeners.ClickListener;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public final class InvisibleFrames extends JavaPlugin {

    @Override
    public void onEnable() {
        new Metrics(this, 28184);

        new ClickListener(this);
    }

    @Override
    public void onDisable() {}
}
