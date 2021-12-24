package de.spigotclass.bungeecommands.admincommands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.TabExecutor;
import net.md_5.bungee.api.scheduler.GroupedThreadFactory;

import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import static de.spigotclass.bungeecommands.BungeeCommands.prefix;

public class kickall extends Command implements TabExecutor {
    public kickall() {
        super("kickall", "spigotclass.admin", "ka");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        if (args.length != 1) {
            sender.sendMessage(new TextComponent(prefix + ChatColor.RED + "Usage: kickall <server>"));
            return;
        }
        ServerInfo serverInfo = ProxyServer.getInstance().getServerInfo(args[0]);

        if (serverInfo == null) {
            sender.sendMessage(new TextComponent(prefix + ChatColor.RED + "Der Server existiert nicht."));
            return;

        }

        serverInfo.getPlayers().forEach(proxiedPlayer -> proxiedPlayer.disconnect(new TextComponent(prefix + "§7Es wurden alle vom Server gekickt §8(§7auch du xD§8)")));
    }

    @Override
    public Iterable<String> onTabComplete(CommandSender sender, String[] args) {
        if (args.length != 1){
            return Collections.emptyList();
        }

        return ProxyServer.getInstance().getServers().values().stream()
                .map(ServerInfo::getName)
                .filter(s -> s.startsWith(args[0]))
                .collect(Collectors.toList());
    }
}
