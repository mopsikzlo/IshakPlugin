package me.mopsikzlo.ishak.entity;


import cn.nukkit.Server;
import cn.nukkit.entity.Entity;
import me.mopsikzlo.ishak.entity.list.Ishak;
import me.mopsikzlo.ishak.Main;
import me.mopsikzlo.ishak.helper.Helper;

public class EntityRegistry{

    public static void init(){
        Server.getInstance().getLogger().info(Helper.ENTITY_REGISTRY_PREFIX + "Начинаю регистрацию энтити...");

        Entity.registerEntity(Ishak.class.getSimpleName(), Ishak.class);

        Server.getInstance().getLogger().info(Helper.ENTITY_REGISTRY_PREFIX + "Все энтити успешно зарегистрированы!");
    }

}
