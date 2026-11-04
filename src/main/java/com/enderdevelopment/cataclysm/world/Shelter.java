package com.enderdevelopment.cataclysm.world;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

public class Shelter {
    private final BlockPos position;
    private final Level level;

    public Shelter(BlockPos position, Level level) {
        this.position = position;
        this.level = level;
    }

    // Additional shelter logic
}