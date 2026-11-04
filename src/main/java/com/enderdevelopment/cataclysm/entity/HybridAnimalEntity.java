package com.enderdevelopment.cataclysm.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;

public class HybridAnimalEntity extends Animal {
    protected HybridAnimalEntity(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    // Additional hybrid animal logic
}