package com.anonimocomvpn.rickstuffsmod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class PortalBlock extends Block {
    public PortalBlock() {
        super(BlockBehaviour.Properties.of(Material.PORTAL).noCollission().noOcclusion());
    }
}