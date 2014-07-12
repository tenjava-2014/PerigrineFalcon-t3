package io.github.PerigrineFalcon;

import org.bukkit.plugin.java.JavaPlugin;

public class RandomEvents extends JavaPlugin {
    public RandomEvents plugin;
    @Override
    public void onEnable() {
        plugin = this;
        getServer().getPluginCommand("meteorshower").setExecutor(new RandomEventsCommandExecutor());
    }
}
