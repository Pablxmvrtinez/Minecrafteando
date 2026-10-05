package com.pablxmvrtiinez.tomatazo;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item TOMATE = register(
            "tomate",
            TomateItem::new,
            new Item.Properties().stacksTo(16)
    );

    public static final Item SEMILLAS_TOMATE = register(
            "semillas_tomate",
            settings -> new BlockItem(ModBlocks.CULTIVO_TOMATE, settings),
            new Item.Properties().stacksTo(64)
    );

    private static Item register(String name, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        ResourceKey<Item> itemKey = ResourceKey.create(
                Registries.ITEM,
                Identifier.fromNamespaceAndPath(TomatazoMod.MOD_ID, name)
        );

        Item item = itemFactory.apply(settings.setId(itemKey));

        return Registry.register(BuiltInRegistries.ITEM, itemKey, item);
    }

    public static void initialize() {
        TomatazoMod.LOGGER.info("Registrando objetos de Tomatazo.");
    }
}
