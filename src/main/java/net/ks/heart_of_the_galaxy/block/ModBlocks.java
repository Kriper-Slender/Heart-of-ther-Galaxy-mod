package net.ks.heart_of_the_galaxy.block;

import net.ks.heart_of_the_galaxy.block.custom.SkintCoveredAnvilBlock;
import net.ks.heart_of_the_galaxy.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, net.ks.heart_of_the_galaxy.Heart_of_the_Galaxy.MOD_ID);

    public static final RegistryObject<Block> Deepslate_avi_sign = registryObject("deepslate_avi_sign",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));

    public static final RegistryObject<Block> SKINT_COVERED_ANVIL = registryObject("skint_covered_anvil",
            () -> new SkintCoveredAnvilBlock(BlockBehaviour.Properties.copy(Blocks.ANVIL).noCollission()));


    private  static <T extends Block> RegistryObject<T> registryObject(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
