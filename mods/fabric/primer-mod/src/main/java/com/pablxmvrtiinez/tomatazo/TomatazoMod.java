package com.pablxmvrtiinez.tomatazo;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TomatazoMod implements ModInitializer {
    public static final String MOD_ID = "tomatazo";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.initialize();
        LOGGER.info("Tomatazo se ha cargado correctamente.");
    }
}
