package de.spigotclass.bungeecommands.helpcommands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

import static de.spigotclass.bungeecommands.BungeeCommands.prefix;

public class Discord extends Command {
    public Discord() {
        super("discord");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        String message = prefix + "§7Unseren Discord erreichst du unter dc.SpigotClass.DE";

        sender.sendMessage(message);


    }
}
