package dev.sillyangel.more_spear_enchantments.enchantment;

import com.mojang.serialization.MapCodec;
import dev.sillyangel.more_spear_enchantments.MoreSpearEnchantments;
import dev.sillyangel.more_spear_enchantments.enchantment.effect.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantmentEffects {
    // Deferred register for enchantment effect types
    public static final DeferredRegister<MapCodec<? extends EnchantmentEntityEffect>> ENCHANTMENT_ENTITY_EFFECTS =
            DeferredRegister.create(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, MoreSpearEnchantments.MOD_ID);

    // Register enchantment effect types
    public static final RegistryObject<MapCodec<LightningEnchantmentEffect>> LIGHTNING_EFFECT =
            ENCHANTMENT_ENTITY_EFFECTS.register("lightning", () -> LightningEnchantmentEffect.CODEC);
    public static final RegistryObject<MapCodec<PoisonEnchantmentEffect>> POISON_EFFECT =
            ENCHANTMENT_ENTITY_EFFECTS.register("poison", () -> PoisonEnchantmentEffect.CODEC);
    public static final RegistryObject<MapCodec<WitheringEnchantmentEffect>> WITHERING_EFFECT =
            ENCHANTMENT_ENTITY_EFFECTS.register("withering", () -> WitheringEnchantmentEffect.CODEC);
    public static final RegistryObject<MapCodec<CripplingEnchantmentEffect>> CRIPPLING_EFFECT =
            ENCHANTMENT_ENTITY_EFFECTS.register("crippling", () -> CripplingEnchantmentEffect.CODEC);
}

