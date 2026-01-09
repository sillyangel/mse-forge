package dev.sillyangel.more_spear_enchantments;

import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = MoreSpearEnchantments.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {
    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
    }
}
