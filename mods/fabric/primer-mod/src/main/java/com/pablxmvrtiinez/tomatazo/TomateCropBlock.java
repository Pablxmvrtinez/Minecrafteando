package com.pablxmvrtiinez.tomatazo;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class TomateCropBlock extends CropBlock {
    public TomateCropBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.SEMILLAS_TOMATE;
    }
}
