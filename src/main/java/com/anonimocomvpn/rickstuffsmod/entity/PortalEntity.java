package com.anonimocomvpn.rickstuffsmod.entity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class PortalEntity extends Entity {
    public PortalEntity(EntityType<?> entityType, Level level) {
        super(entityType, level);
    }
}