package dev.sillyangel.more_spear_enchantments;

import com.mojang.logging.LogUtils;
import dev.sillyangel.more_spear_enchantments.enchantment.ModEnchantmentEffects;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MoreSpearEnchantments.MOD_ID)
public final class MoreSpearEnchantments {
    public static final String MOD_ID = "more_spear_enchantments";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MoreSpearEnchantments(FMLJavaModLoadingContext context) {
        var modBusGroup = context.getModBusGroup();
        FMLCommonSetupEvent.getBus(modBusGroup).addListener(this::commonSetup);
        ModEnchantmentEffects.ENCHANTMENT_ENTITY_EFFECTS.register(modBusGroup);
        LOGGER.info("Registered {} enchantment effect types", ModEnchantmentEffects.ENCHANTMENT_ENTITY_EFFECTS.getEntries().size());
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Initializing More Spear Enchantments");
    }
}
