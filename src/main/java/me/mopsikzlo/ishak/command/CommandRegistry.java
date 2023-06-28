package me.mopsikzlo.ishak.command;

import cn.nukkit.Server;
import me.mopsikzlo.ishak.command.list.KoshakCommand;
import me.mopsikzlo.ishak.Main;
import me.mopsikzlo.ishak.helper.Helper;

public class CommandRegistry{

    public static void init(){
        Server.getInstance().getLogger().info(Helper.REGISTRY_PREFIX + "Начинаю регистрацию команд...");

        Server.getInstance().getCommandMap().register("koshak", new KoshakCommand("koshak"));

        Server.getInstance().getLogger().info(Helper.REGISTRY_PREFIX + "Все команды успешно зарегистрированы!");
    }

}
