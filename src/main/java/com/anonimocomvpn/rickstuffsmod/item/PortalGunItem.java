package com.anonimocomvpn.rickstuffsmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class PortalGunItem extends Item {
    public PortalGunItem() {
        super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
    }
}