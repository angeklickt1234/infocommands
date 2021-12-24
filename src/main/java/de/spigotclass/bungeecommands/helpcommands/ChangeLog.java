package de.spigotclass.bungeecommands.helpcommands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

import static de.spigotclass.bungeecommands.BungeeCommands.prefix;

public class ChangeLog extends Command {
    public ChangeLog() {
        super("changelog", null, "changes");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        sender.sendMessage(prefix + "§f§lAdventskalender §8- §701.12.2021");
        sender.sendMessage(prefix + "§a");
        sender.sendMessage(prefix + "§8[§a»§8] §7Adventskalender umgesetzt :D");
        sender.sendMessage(prefix + "§8[§a»§8] §7TSBW Update");
        sender.sendMessage(prefix + "§8[§a»§8] §7Neues Forum online §8(§f§lhttp://spigotclass.de§8)");
        // sender.sendMessage(prefix + "§8[§a»§8] Neue Discord Channel und Discord angepasst");
        sender.sendMessage(prefix + "§8[§a»§8] §7Statsübersicht in der Lobby geplant");
        sender.sendMessage(prefix + "§8[§c«§8] §7/news Command entfernt");
        sender.sendMessage(prefix + "§8[§c«§8] §7Story of SpigotClass erstmal entfernt :c");
        sender.sendMessage(prefix + "§8[§e●§8] §7Bald /story Command");
        sender.sendMessage(prefix + "§8[§a»§8] §7Viele weitere Updates (23) folgen");
        sender.sendMessage(prefix + "§8");
        sender.sendMessage(prefix + "§8[§a»§8] §8= §7Feature hinzugefügt");
        sender.sendMessage(prefix + "§8[§e●§8] §8= §7Bugfix ");
        sender.sendMessage(prefix + "§8[§c«§8] §8= §7Feature entfernt");

    }
}
