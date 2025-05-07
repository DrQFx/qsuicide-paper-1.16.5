package org.drqf.qsuicide;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SuicideCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("§cOnly for players!");
            return true;
        }

        Player player = (Player) sender;

        if (!player.hasPermission("qsuicide.suicide")) {
            player.sendMessage("§cSorry, but you don't have permissions to do that!");
            return true;
        }

        player.setHealth(0);

        String suicideMessage = "§5§l" + player.getName() + " §5Commited suicide...";
        Bukkit.broadcastMessage(suicideMessage);

        return true;
    }
}
