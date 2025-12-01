package me.truedarklord.invisibleFrames;

import me.truedarklord.invisibleFrames.listeners.ClickListener;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public final class InvisibleFrames extends JavaPlugin {

    @Override
    public void onEnable() {
        new Metrics(this, 28184);

        advertise();

        new ClickListener(this);
    }

    @Override
    public void onDisable() {}

    private void advertise() {
        this.getServer().getConsoleSender().sendMessage(
                """
  
 §#00AA00================================§#ee2222

 _____            _     _ _     _     \s
|_   _|          (_)   (_) |   | |    \s
  | |  _ ____   ___ ___ _| |__ | | ___\s
  | | | '_ \\ \\ / / / __| | '_ \\| |/ _ \\
 _| |_| | | \\ V /| \\__ \\ | |_) | |  __/
|_____|_| |_|\\_/ |_|___/_|_.__/|_|\\___|
|  ____|                              \s
| |__ _ __ __ _ _ __ ___   ___  ___   \s
|  __| '__/ _` | '_ ` _ \\ / _ \\/ __|  \s
| |  | | | (_| | | | | | |  __/\\__ \\  \s
|_|  |_|  \\__,_|_| |_| |_|\\___||___/  \s

§#f5da2aBy TrueDarkLord.
§#00AA00================================
§#f5da2aFeel free to buy me a coffee:  §#00AA00|
§bhttps://ko-fi.com/truedarklord §#00AA00|
§#00AA00================================
                        """
        );
    }

}
