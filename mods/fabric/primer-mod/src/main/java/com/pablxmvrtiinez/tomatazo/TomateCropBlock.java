package com.pablxmvrtiinez.tomatazo;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TomateCropBlock extends CropBlock {
    public TomateCropBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.SEMILLAS_TOMATE;
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> drops = new ArrayList<>();

        if (this.isMaxAge(state)) {
            int cantidadTomates = ThreadLocalRandom.current().nextInt(2, 6);
            int cantidadSemillas = ThreadLocalRandom.current().nextInt(1, 4);

            drops.add(new ItemStack(ModItems.TOMATE, cantidadTomates));
            drops.add(new ItemStack(ModItems.SEMILLAS_TOMATE, cantidadSemillas));
        } else {
            drops.add(new ItemStack(ModItems.SEMILLAS_TOMATE, 1));
        }

        return drops;
    }
}
