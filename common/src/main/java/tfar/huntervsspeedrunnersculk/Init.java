package tfar.huntervsspeedrunnersculk;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SculkSensorBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class Init {

    public static final Block SPEEDRUNNER_SCULK_SENSOR = new SpeedrunnerSculkSensorBlock(BlockBehaviour.Properties.copy(Blocks.SCULK_SENSOR));
    public static final BlockEntityType<SpeedrunnerSculkSensorBlockEntity> SPEEDRUNNER_SCULK_SENSOR_E =
            BlockEntityType.Builder.of(SpeedrunnerSculkSensorBlockEntity::new,SPEEDRUNNER_SCULK_SENSOR).build(null);

    public static final Item SPEEDRUNNER_SCULK_SENSOR_I = new BlockItem(SPEEDRUNNER_SCULK_SENSOR,new Item.Properties());

}