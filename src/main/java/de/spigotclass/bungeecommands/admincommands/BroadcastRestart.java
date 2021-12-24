package de.spigotclass.bungeecommands.admincommands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class BroadcastRestart extends Command {
    public BroadcastRestart() {
        super("bcstop", "spigotclass.admin", "bcend");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        ProxyServer.getInstance().broadcast(new TextComponent("§7§m----------------------------------"));
        ProxyServer.getInstance().broadcast(new TextComponent("§f§l"));
        ProxyServer.getInstance().broadcast(new TextComponent("§f§lWichtige Nachricht:"));
        ProxyServer.getInstance().broadcast(new TextComponent("§7"));
        ProxyServer.getInstance().broadcast(new TextComponent("§7Der §f§lProxy §7startet gleich neu."));
        ProxyServer.getInstance().broadcast(new TextComponent("§7Das dauert natürlich nicht lange."));
        ProxyServer.getInstance().broadcast(new TextComponent("§7"));
        ProxyServer.getInstance().broadcast(new TextComponent("§7§m----------------------------------"));

    }
}
