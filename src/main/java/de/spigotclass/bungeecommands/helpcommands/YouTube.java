package de.spigotclass.bungeecommands.helpcommands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

import static de.spigotclass.bungeecommands.BungeeCommands.prefix;

public class YouTube extends Command {
    public YouTube() {
        super("youtube");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        String message = prefix + "§7Auf YouTube heiße ich angeklickt";

        sender.sendMessage(message);

    }
}
