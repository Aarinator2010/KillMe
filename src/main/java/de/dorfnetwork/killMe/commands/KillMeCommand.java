package de.dorfnetwork.killMe.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

// WICHTIG: Kein "extends JavaPlugin" hier!
public class KillMeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player player) {
            player.setHealth(0);
            player.sendMessage("You have eliminated yourself.");
        }
        return true;
    }
}