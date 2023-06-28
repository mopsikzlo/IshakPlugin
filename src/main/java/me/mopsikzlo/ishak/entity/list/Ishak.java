package me.mopsikzlo.ishak.entity.list;

import cn.nukkit.entity.passive.EntityDonkey;
import cn.nukkit.item.Item;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;
import cn.nukkit.utils.Utils;

public class Ishak extends EntityDonkey {


    public Ishak(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    @Override
    public Item[] getDrops() {
        return new Item[]{
                Item.get(Item.EMERALD, 0, Utils.rand(500, 1000)),
                Item.get(Item.TOTEM, 0, 1)
        };
    }
}
