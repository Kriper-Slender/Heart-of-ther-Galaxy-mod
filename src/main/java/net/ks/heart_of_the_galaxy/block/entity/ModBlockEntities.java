package net.ks.heart_of_the_galaxy.block.entity;

import net.ks.heart_of_the_galaxy.Heart_of_the_Galaxy;
import net.ks.heart_of_the_galaxy.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Heart_of_the_Galaxy.MOD_ID);

    public static final RegistryObject<BlockEntityType<SkintCoveredAnvilBlockEntity>> SKINT_COVERED_ANVIL_BE =
            BLOCK_ENTITIES.register("skint_covered_anvil_be", () -> {
                return BlockEntityType.Builder.of(SkintCoveredAnvilBlockEntity::new,
                        ModBlocks.SKINT_COVERED_ANVIL.get()).build(null);
            });


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}