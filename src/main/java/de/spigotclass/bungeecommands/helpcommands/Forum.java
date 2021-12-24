package de.spigotclass.bungeecommands.helpcommands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

import static de.spigotclass.bungeecommands.BungeeCommands.prefix;

public class Forum extends Command {
    public Forum() {
        super("forum");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        String message = prefix + "§7Unser Forum erreichst du unter §f§lforum.spigotclass.de";

        sender.sendMessage(message);

    }
}
