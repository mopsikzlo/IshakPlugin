package me.mopsikzlo.ishak.nbt;

import cn.nukkit.Player;
import cn.nukkit.nbt.tag.CompoundTag;
import cn.nukkit.nbt.tag.DoubleTag;
import cn.nukkit.nbt.tag.FloatTag;
import cn.nukkit.nbt.tag.ListTag;

public class NBTUtils {

    public static CompoundTag createNBT(Player player){
        return new CompoundTag()
                .putList(new ListTag<>("Pos")
                        .add(new DoubleTag("", player.x))
                        .add(new DoubleTag("", player.y))
                        .add(new DoubleTag("", player.z)))
                .putList(new ListTag<DoubleTag>("Motion")
                        .add(new DoubleTag("", 0))
                        .add(new DoubleTag("", 0))
                        .add(new DoubleTag("", 0)))
                .putList(new ListTag<FloatTag>("Rotation")
                        .add(new FloatTag("", (float) player.yaw))
                        .add(new FloatTag("", (float) player.pitch)));
    }
}
