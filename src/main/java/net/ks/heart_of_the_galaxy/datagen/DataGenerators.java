package net.ks.heart_of_the_galaxy.datagen;

import net.ks.heart_of_the_galaxy.Heart_of_the_Galaxy;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Heart_of_the_Galaxy.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // Recept
        generator.addProvider(event.includeServer(),
                new ModRecipeProvider(packOutput));

        // Loot tables
        generator.addProvider(event.includeServer(),
                new ModLootTableProvider(packOutput));

        // block state
        generator.addProvider(event.includeClient(),
          new ModBlockStateProvider(packOutput, existingFileHelper));

        // Item models
        generator.addProvider(event.includeClient(),
                new ModItemModelProvider(packOutput, existingFileHelper));

        //tags
        ModBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
               new ModBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));

        generator.addProvider(event.includeServer(),
                new ModItemTagGenerator(packOutput,
                        lookupProvider,
                        blockTagGenerator.contentsGetter(),
                        existingFileHelper));

        // loca.
        generator.addProvider(event.includeClient(),
                new ModLanguageProvider(packOutput, "en_us"));
    }
}
