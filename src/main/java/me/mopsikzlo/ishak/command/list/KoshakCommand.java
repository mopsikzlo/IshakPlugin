package me.mopsikzlo.ishak.command.list;

import cn.nukkit.Server;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.Player;

import cn.nukkit.entity.Entity;
import me.mopsikzlo.ishak.Main;
import me.mopsikzlo.ishak.entity.list.Ishak;
import me.mopsikzlo.ishak.helper.Helper;
import me.mopsikzlo.ishak.nbt.NBTUtils;

public class KoshakCommand extends Command{

    public KoshakCommand(String name){
        super(
                name,
                "Команда, добавляющая Ишака (KoshakMine) на сервер",
                "",
                new String[]{"ishak", "dolbaeb"}
        );

        Server.getInstance().getLogger().info(Helper.KOSHAK_COMMAND_PREFIX + "Команда koshak[ishak,dolbaeb] успешно зарегистрирована!");
    }

    @Override
    public boolean execute(CommandSender sender, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage("§r§c* §r§fПризвать ишака можно только в игре!");
            return false;
        }

        Ishak entity = new Ishak(
                ((Player) sender).getChunk(),
                NBTUtils.createNBT((Player) sender)
        );

        entity.setNameTag(Helper.ISHAK_NAMETAG);
        entity.setMaxHealth(20); entity.setHealth(20);
        entity.setScale(1.5F);
        entity.setImmobile(true);
        entity.spawnToAll();

        sender.sendMessage("§r§7[§l§cИшак§r§7] §r§fВы успешно заспавнили ишака!");
        sender.sendMessage("§r§7[§l§cИшак§r§7] §r§fПри убийстве ишака вы получите:" +
                "\n§r§7- §fот §a500 §fдо §a1000 §fизумрудов" +
                "\n§r§7- §e1 §fтотем бессмертия"
        );

        Server.getInstance().broadcastMessage("§r§7[§l§cИшак§r§7] §r§fИгрок §e" + sender.getName() + " §r§fзаспавнил ИШАКА в мире §b" + ((Player) sender).getLevelName() + " §r§fна координатах §c" + ((Player) sender).x + "§f, §c" + ((Player) sender).y + "§f, §c" + ((Player) sender).z + "§r§f!");

        return true;
    }
}
