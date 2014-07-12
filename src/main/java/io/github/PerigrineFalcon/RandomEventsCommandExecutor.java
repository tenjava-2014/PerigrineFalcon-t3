package io.github.PerigrineFalcon;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RandomEventsCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("meteorshower")) {
            if (sender instanceof Player) {
                if (args.length >= 1) {
                    long power;
                    try {
                        power = Integer.parseInt(args[0]);
                    } catch (Exception e) {
                        power = 1;
                    }
                    new RandomEventsEvents().meteorShower(((Player) sender).getLocation(), power);
                    return true;
                }
            }
        }
        return false;
    }
}
