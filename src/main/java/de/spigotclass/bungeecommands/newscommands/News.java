package de.spigotclass.bungeecommands.newscommands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

import static de.spigotclass.bungeecommands.BungeeCommands.prefix;

public class News extends Command {
    public News() {
        super("news");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        sender.sendMessage( prefix +  "§cCommand nicht mehr verfügbar §8(§7/changelog§8)");

    }
}
