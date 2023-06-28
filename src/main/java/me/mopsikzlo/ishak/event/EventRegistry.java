package me.mopsikzlo.ishak.event;

import cn.nukkit.Server;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.Plugin;
import me.mopsikzlo.ishak.Main;
import me.mopsikzlo.ishak.event.handler.EntityDamageHandler;
import me.mopsikzlo.ishak.helper.Helper;

public class EventRegistry{

    public static void init(Main plugin){
        Server.getInstance().getLogger().info(Helper.EVENT_REGISTRY_PREFIX + "Начинаю регистрацию событий...");

        Server.getInstance().getPluginManager().registerEvents((Listener) new EntityDamageHandler(), plugin);

        Server.getInstance().getLogger().info(Helper.EVENT_REGISTRY_PREFIX + "Все события успешно зарегистрированы!");
    }

}
