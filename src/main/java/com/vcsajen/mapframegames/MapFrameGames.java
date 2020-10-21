package com.vcsajen.mapframegames;

import org.bukkit.plugin.java.JavaPlugin;

public final class MapFrameGames extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getLogger().info("My plugin werks lel");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
