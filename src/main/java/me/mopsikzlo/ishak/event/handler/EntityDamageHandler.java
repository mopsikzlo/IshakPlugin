package me.mopsikzlo.ishak.event.handler;

import cn.nukkit.Player;
import cn.nukkit.entity.Entity;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.entity.EntityDamageByEntityEvent;
import cn.nukkit.event.entity.EntityDamageEvent;
import cn.nukkit.math.Vector3;
import cn.nukkit.utils.Utils;
import me.mopsikzlo.ishak.entity.list.Ishak;
import me.mopsikzlo.ishak.event.EventRegistry;

public class EntityDamageHandler implements Listener{

    @EventHandler
    public void handleEntityDamage(EntityDamageByEntityEvent event){
        if (!(event.getDamager() instanceof Player)) return;
        Player damager = (Player) event.getDamager();

        if (!(event.getEntity() instanceof Ishak)) return;
        Ishak entity = (Ishak) event.getEntity();

        float entityHealth = entity.getHealth();
        float entityMaxHealth = entity.getMaxHealth();

        int rand = Utils.rand(0, 2);

        EntityDamageByEntityEvent damageEvent = new EntityDamageByEntityEvent((Entity) entity, (Entity) damager, EntityDamageEvent.DamageCause.ENTITY_ATTACK, (float) Utils.rand(2F, 6F));
        if(rand == 0){
            damager.attack(damageEvent);
            damager.setOnFire(3);
        }else if(rand == 1){
            damager.attack(damageEvent);
            damager.setMotion(new Vector3(damager.x, damager.y + 2, damager.z));
        }else{
            damager.attack(damageEvent);
        }
        damager.sendPopup("§l§cСРАЖЕНИЕ С ИШАКОМ" +
                "\n§r§fЗдоровье ишака: §c" + entityHealth + "§f/§a" + entityMaxHealth + "§r" +
                "\n§r§7-*- §l§bshop.ironmine.fun §r§7-*-");

    }
}
