package de.spigotclass.bungeecommands.admincommands;

import de.dytanic.cloudnet.api.CloudAPI;
import de.dytanic.cloudnet.bridge.CloudServer;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

import static de.spigotclass.bungeecommands.BungeeCommands.prefix;

public class InfoCommand extends Command {
    public InfoCommand() {
        super("info", "spigotclass.admin", "sinfo");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        ServerInfo serverInfo = ProxyServer.getInstance().getServerInfo(args[0]);

        sender.sendMessage(new TextComponent(prefix + "§7Aktuell sind §f§l" + ProxyServer.getInstance().getOnlineCount() + "§7 Spieler auf dem Netzwerk"));

    }
}
