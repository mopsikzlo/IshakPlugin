package me.mopsikzlo.ishak;

import cn.nukkit.plugin.PluginBase;
import me.mopsikzlo.ishak.command.CommandRegistry;
import me.mopsikzlo.ishak.entity.EntityRegistry;
import me.mopsikzlo.ishak.event.EventRegistry;
import me.mopsikzlo.ishak.helper.Helper;

public class Main extends PluginBase{

    @Override
    public void onEnable(){
        this.getServer().getLogger().info(Helper.PLUGIN_PREFIX + "Плагин IshakPlugin включен!");
        this.getServer().getLogger().info(Helper.PLUGIN_PREFIX + "Автор: §cvk.com/mopsikzlo");
        this.getServer().getLogger().info(Helper.PLUGIN_PREFIX + "GitHub: §cgithub.com/mopsikzlo");
        this.getServer().getLogger().info(Helper.PLUGIN_PREFIX + "Поддержать автора: §bshop.ironmine.fun");
        this.getServer().getLogger().info(Helper.PLUGIN_PREFIX + "-----------------------------------");
        this.getServer().getLogger().info(Helper.PLUGIN_PREFIX + "§l§aЛучший игровой сервер Minecraft: BE");
        this.getServer().getLogger().info(Helper.PLUGIN_PREFIX + "§l§eIP: §dIronMine.FUN§e, порт: §d19132");
        this.getServer().getLogger().info(Helper.PLUGIN_PREFIX + "§l§eВерсия игры: §bот 1.1.5 до 1.20.1 §a(любая)");

        CommandRegistry.init();
        EntityRegistry.init();
        EventRegistry.init(this);
    }
}
