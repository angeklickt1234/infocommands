package de.spigotclass.bungeecommands.helpcommands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

import static de.spigotclass.bungeecommands.BungeeCommands.prefix;

public class Webseite extends Command {
    public Webseite() {
        super("web");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        String message = prefix + "§7Unsere Webseite ereichst du unter §f§lSpigotClass.DE";;


        sender.sendMessage(message);

    }
}
