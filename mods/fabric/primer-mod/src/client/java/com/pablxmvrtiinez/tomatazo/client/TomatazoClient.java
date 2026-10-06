package com.pablxmvrtiinez.tomatazo.client;

import com.pablxmvrtiinez.tomatazo.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;

public class TomatazoClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.TOMATE_PROYECTIL, ThrownItemRenderer::new);
    }
}
