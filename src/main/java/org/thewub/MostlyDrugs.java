package org.thewub;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MostlyDrugs implements ModInitializer {

    public static final String MOD_ID = "mostlydrugs";
    public static final String MOD_NAME = "MostlyDrugs";

    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing...");
    }

    public static void log(Level level, String message){
        LOGGER.log(level, String.format("[%s] %s", MOD_NAME, message));
    }
}