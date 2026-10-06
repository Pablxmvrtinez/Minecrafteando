package com.pablxmvrtiinez.tomatazo;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ModEntities {
    public static final ResourceKey<EntityType<?>> TOMATE_PROYECTIL_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(TomatazoMod.MOD_ID, "tomate_proyectil")
    );

    public static final EntityType<TomateProjectileEntity> TOMATE_PROYECTIL = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            TOMATE_PROYECTIL_KEY,
            EntityType.Builder.<TomateProjectileEntity>of(TomateProjectileEntity::new, MobCategory.MISC)
                    .sized(0.25F, 0.25F)
                    .clientTrackingRange(4)
                    .updateInterval(10)
                    .build(TOMATE_PROYECTIL_KEY)
    );

    public static void initialize() {
        TomatazoMod.LOGGER.info("Registrando entidades de Tomatazo.");
    }
}
