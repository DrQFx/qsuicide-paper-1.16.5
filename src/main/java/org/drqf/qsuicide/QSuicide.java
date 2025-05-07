package org.drqf.qsuicide;

import org.bukkit.plugin.java.JavaPlugin;

public class QSuicide extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("suicide").setExecutor(new SuicideCommand());
    }
}
