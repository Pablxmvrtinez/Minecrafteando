package com.pablxmvrtiinez.tomatazo;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.throwableitemprojectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class TomateProjectileEntity extends ThrowableItemProjectile {
    public TomateProjectileEntity(EntityType<? extends ThrowableItemProjectile> type, Level level) {
        super(type, level);
    }

    public TomateProjectileEntity(Level level, LivingEntity owner, ItemStack itemStack) {
        super(ModEntities.TOMATE_PROYECTIL, owner, level, itemStack);
    }

    public TomateProjectileEntity(Level level, double x, double y, double z, ItemStack itemStack) {
        super(ModEntities.TOMATE_PROYECTIL, x, y, z, level, itemStack);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.TOMATE;
    }

    @Override
    protected void onHitEntity(EntityHitResult hitResult) {
        super.onHitEntity(hitResult);

        Entity entity = hitResult.getEntity();

        if (entity instanceof LivingEntity livingEntity) {
            double hitY = hitResult.getLocation().y;
            double headY = livingEntity.getEyeY();

            boolean golpeEnLaCabeza = hitY >= headY - 0.75D;

            if (golpeEnLaCabeza) {
                livingEntity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 0));
                livingEntity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 60, 0));

                TomatazoMod.LOGGER.info("Tomatazo en la cabeza: entidad cegada y marcada 3 segundos.");
            } else {
                TomatazoMod.LOGGER.info("Tomatazo golpeó entidad, pero no suficientemente alto.");
            }
        }
    }

    @Override
    protected void onHit(HitResult hitResult) {
        super.onHit(hitResult);
        this.discard();
    }
}
