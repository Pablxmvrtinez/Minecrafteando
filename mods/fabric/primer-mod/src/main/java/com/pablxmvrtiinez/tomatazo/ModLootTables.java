package com.pablxmvrtiinez.tomatazo;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;

public class ModLootTables {
    public static void initialize() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            String lootTableId = key.toString();

            if (!source.isBuiltin()) {
                return;
            }

            if (lootTableId.contains("chests/village/")) {
                TomatazoMod.LOGGER.info("Añadiendo semillas de tomate a: {}", lootTableId);

                LootPool.Builder semillaUno = LootPool.lootPool()
                        .add(LootItem.lootTableItem(ModItems.SEMILLAS_TOMATE));

                LootPool.Builder semillaDos = LootPool.lootPool()
                        .add(LootItem.lootTableItem(ModItems.SEMILLAS_TOMATE));

                LootPool.Builder semillaExtra = LootPool.lootPool()
                        .add(
                                LootItem.lootTableItem(ModItems.SEMILLAS_TOMATE)
                                        .when(LootItemRandomChanceCondition.randomChance(0.5F))
                        );

                tableBuilder.withPool(semillaUno);
                tableBuilder.withPool(semillaDos);
                tableBuilder.withPool(semillaExtra);
            }
        });
    }
}
