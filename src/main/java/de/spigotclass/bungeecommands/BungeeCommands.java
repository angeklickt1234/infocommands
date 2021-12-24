package de.spigotclass.bungeecommands;

import de.spigotclass.bungeecommands.admincommands.BroadcastRestart;
import de.spigotclass.bungeecommands.admincommands.InfoCommand;
import de.spigotclass.bungeecommands.admincommands.kickall;
import de.spigotclass.bungeecommands.helpcommands.*;
import de.spigotclass.bungeecommands.newscommands.News;
import de.spigotclass.bungeecommands.playercommands.Spaß;
import de.spigotclass.bungeecommands.vipinfocommands.PremiumPlus;
import de.spigotclass.bungeecommands.vipinfocommands.YouTuber;
import de.spigotclass.bungeecommands.youtubercommands.YouTubeLive;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Plugin;

public final class BungeeCommands extends Plugin {

    public static String prefix = "§f§lProxy §8- §7";

    @Override
    public void onEnable() {
        // Plugin startup logic
        String prefix = "§f§lPrefixe sind toll §8- §7";

        getProxy().getPluginManager().registerCommand(this, new kickall());
        getProxy().getPluginManager().registerCommand(this, new BroadcastRestart());
        getProxy().getPluginManager().registerCommand(this, new YouTubeLive());
        getProxy().getPluginManager().registerCommand(this, new InfoCommand());
        getProxy().getPluginManager().registerCommand(this, new Spaß());
        getProxy().getPluginManager().registerCommand(this, new Discord());
        getProxy().getPluginManager().registerCommand(this, new Forum());
        getProxy().getPluginManager().registerCommand(this, new Help());
        getProxy().getPluginManager().registerCommand(this, new Webseite());
        getProxy().getPluginManager().registerCommand(this, new YouTube());
        getProxy().getPluginManager().registerCommand(this, new News());
        getProxy().getPluginManager().registerCommand(this, new PremiumPlus());
        getProxy().getPluginManager().registerCommand(this, new YouTuber());
        getProxy().getPluginManager().registerCommand(this, new ChangeLog());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
