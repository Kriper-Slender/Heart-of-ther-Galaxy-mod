package net.ks.heart_of_the_galaxy.util;

import net.ks.heart_of_the_galaxy.Heart_of_the_Galaxy;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_SKINT_TOOL = tag();

        private static TagKey<Block> tag(){
            return BlockTags.create(new ResourceLocation(Heart_of_the_Galaxy.MOD_ID, "needs_skint_tool"));
        }
    }

    public static class Items{

        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(Heart_of_the_Galaxy.MOD_ID, name));
        }
    }

}
