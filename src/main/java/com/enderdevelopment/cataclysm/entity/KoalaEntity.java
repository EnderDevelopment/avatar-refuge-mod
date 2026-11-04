package com.enderdevelopment.cataclysm.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;

public class KoalaEntity extends TamableAnimal {
    protected KoalaEntity(EntityType<? extends TamableAnimal> entityType, Level level) {
        super(entityType, level);
    }

    // Additional koala-specific logic
}