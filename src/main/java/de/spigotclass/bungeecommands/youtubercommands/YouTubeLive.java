package de.spigotclass.bungeecommands.youtubercommands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.plugin.Command;

public class YouTubeLive extends Command {
    public YouTubeLive() {
        super("live", "spigotclass.admin", "bclive");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        ProxyServer.getInstance().broadcast(new TextComponent("§7§m----------------------------------"));
        ProxyServer.getInstance().broadcast(new TextComponent("§f§l"));
        ProxyServer.getInstance().broadcast(new TextComponent("§f§l" + sender.getName() + "§7 ist jetzt Live auf YouTube!"));
        ProxyServer.getInstance().broadcast(new TextComponent("§f§lSchaue jetzt vorbei!"));
        ProxyServer.getInstance().broadcast(new TextComponent("§7"));
        ProxyServer.getInstance().broadcast(new TextComponent("§5§l" + sender.getName() + " §7bei §f§lYouTube!"));
        ProxyServer.getInstance().broadcast(new TextComponent("§7"));
        ProxyServer.getInstance().broadcast(new TextComponent("§7§m----------------------------------"));



    }
}
