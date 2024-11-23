package net.ks.heart_of_the_galaxy.datagen;

import net.ks.heart_of_the_galaxy.Heart_of_the_Galaxy;
import net.ks.heart_of_the_galaxy.block.ModBlocks;
import net.ks.heart_of_the_galaxy.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Heart_of_the_Galaxy.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.Deepslate_avi_sign.get());

        this.tag(ModTags.Blocks.NEEDS_SKINT_TOOL);
                //.add(ModBlocks.Deepslate_avi_sign.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.Deepslate_avi_sign.get());


    }
}