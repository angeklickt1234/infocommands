package de.spigotclass.bungeecommands.helpcommands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class Help extends Command {
    public Help() {
        super("hilfe");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        sender.sendMessage("§f§lSpigotClass §8- §7Hilfe");
        sender.sendMessage("§a");
        sender.sendMessage("§f§lSpielerklärungen §8- §7/gameinfo");
        sender.sendMessage("§f§lDiscord §8- §7/discord");
        sender.sendMessage("§f§lWebsite §8- §7/web");
        sender.sendMessage("§f§lYouTube §8- §7/youtube");
        sender.sendMessage("§5§lYouTuber Rang? §8- §7/youtuber");
        sender.sendMessage("§6§lPremium+ Rang? §8- §7/premium+");
        sender.sendMessage("§f§lAktuelle News? §8- §7/news");
        sender.sendMessage("§a");
        sender.sendMessage("§f§lSpigotClass §8- §7Hilfe");

    }
}
