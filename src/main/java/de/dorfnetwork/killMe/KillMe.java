package de.dorfnetwork.killMe;

import de.dorfnetwork.killMe.commands.KillMeCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class KillMe extends JavaPlugin {

    @Override
    public void onEnable() {
        // Hier wird die Command-Klasse zugewiesen
        this.getCommand("killme").setExecutor(new KillMeCommand());
    }
}