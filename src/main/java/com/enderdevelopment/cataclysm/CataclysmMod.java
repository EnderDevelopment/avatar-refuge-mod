package com.enderdevelopment.cataclysm;

import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("cataclysm")
public class CataclysmMod {
    private static final long CATACLYSM_DELAY = 3 * 24 * 60 * 60 * 20; // 3 days in ticks
    private long worldTime = 0;

    public CataclysmMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onWorldTick(TickEvent.WorldTickEvent event) {
        if (event.phase == TickEvent.Phase.END && event.world.dimension() == Level.OVERWORLD) {
            worldTime++;
            if (worldTime >= CATACLYSM_DELAY) {
                triggerCataclysm(event.world);
            }
        }
    }

    private void triggerCataclysm(Level world) {
        // Logic to trigger the cataclysm
    }
}