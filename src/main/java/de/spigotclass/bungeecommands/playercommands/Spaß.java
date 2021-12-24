package de.spigotclass.bungeecommands.playercommands;

import de.dytanic.cloudnet.api.CloudAPI;
import de.dytanic.cloudnet.lib.player.CloudPlayer;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

import static de.spigotclass.bungeecommands.BungeeCommands.prefix;

public class Spaß extends Command {

    public Spaß() {
        super("freunde", null, "fun");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        
        sender.sendMessage(new TextComponent(prefix + "§7Es wird nun ein Freundeaufruf gestartet!"));
        ProxyServer.getInstance().broadcast(new TextComponent("§7§m----------------------------------"));
        ProxyServer.getInstance().broadcast(new TextComponent("§f§l"));
        ProxyServer.getInstance().broadcast(new TextComponent("§f§l" + sender.getName() + "§7 braucht Freunde auf dem Server!"));
        ProxyServer.getInstance().broadcast(new TextComponent("§7"));
        ProxyServer.getInstance().broadcast(new TextComponent("§7§m----------------------------------"));

    }
}
