package net.ks.heart_of_the_galaxy.datagen;

import net.ks.heart_of_the_galaxy.Heart_of_the_Galaxy;
import net.ks.heart_of_the_galaxy.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Heart_of_the_Galaxy.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem();
        simpleBlock(ModBlocks.SKINT_COVERED_ANVIL.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/skint_covered_anvil")));
    }

    private void blockWithItem() {
        simpleBlockWithItem(ModBlocks.Deepslate_avi_sign.get(), cubeAll(ModBlocks.Deepslate_avi_sign.get()));
    }
}