package net.ks.heart_of_the_galaxy.item;

import net.ks.heart_of_the_galaxy.Heart_of_the_Galaxy;
import net.ks.heart_of_the_galaxy.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier Skint = TierSortingRegistry.registerTier(
            new ForgeTier(5,-1 ,5f,1f,25,
                    ModTags.Blocks.NEEDS_SKINT_TOOL, () -> Ingredient.of(ModItems.grain_of_skint.get())),
            new ResourceLocation(Heart_of_the_Galaxy.MOD_ID, "skint"), List.of(Tiers.NETHERITE),List.of());
}
