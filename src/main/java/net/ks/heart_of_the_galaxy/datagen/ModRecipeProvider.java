package net.ks.heart_of_the_galaxy.datagen;

import net.ks.heart_of_the_galaxy.block.ModBlocks;
import net.ks.heart_of_the_galaxy.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput){
        super(pOutput);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> pWriter){
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Deepslate_avi_sign.get(), 8)
                .pattern("DDD")
                .pattern("DSD")
                .pattern("DDD")
                .define('S', ModItems.grain_of_skint.get())
                .define('D', Items.DEEPSLATE_BRICKS)
                .unlockedBy(getHasName(ModItems.grain_of_skint.get()),has(ModItems.grain_of_skint.get()))
                .save(pWriter);
    }


}
