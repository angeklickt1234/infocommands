package de.spigotclass.bungeecommands.vipinfocommands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class PremiumPlus extends Command {
    public PremiumPlus() {
        super("premium+");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        sender.sendMessage("§a");
        sender.sendMessage("§6§lPremium+ §8- §7Anforderungen für den Premium+ Rang");
        sender.sendMessage("§6§lPremium+ §8- §7Um den Rang zu erhalten benötigst");
        sender.sendMessage("§6§lPremium+ §8- §7du §f§l50 Abonnenten");
        sender.sendMessage("§6§lPremium+ §8- §7und du musst ein Video über den Server");
        sender.sendMessage("§6§lPremium+ §8- §7hochladen welches mindestends §f§l3 Minuten");
        sender.sendMessage("§6§lPremium+ §8- §7lang sein sollte.");
        sender.sendMessage("§6§lPremium+ §8- §7Hast du alles erfüllt? Dann melde dich im Forum.");
        sender.sendMessage("§a");
    }
}
