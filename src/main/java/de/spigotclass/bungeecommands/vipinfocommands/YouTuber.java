package de.spigotclass.bungeecommands.vipinfocommands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class YouTuber extends Command {
    public YouTuber() {
        super("youtuber");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        sender.sendMessage("§a");
        sender.sendMessage("§5§lYouTuber §8- §7Anforderungen für den YTber Rang");
        sender.sendMessage("§5§lYouTuber §8- §7Um den Rang zu erhalten benötigst");
        sender.sendMessage("§5§lYouTuber §8- §7du §f§l200 Abonnenten");
        sender.sendMessage("§5§lYouTuber §8- §7und du musst ein Video über den Server");
        sender.sendMessage("§5§lYouTuber §8- §7hochladen welches mindestends §f§l3 Minuten");
        sender.sendMessage("§5§lYouTuber §8- §7lang sein sollte.");
        sender.sendMessage("§5§lYouTuber §8- §7Hast du alles erfüllt? Dann melde dich im Forum.");
        sender.sendMessage("§a");

    }
}
