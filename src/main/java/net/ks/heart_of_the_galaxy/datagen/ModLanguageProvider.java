package net.ks.heart_of_the_galaxy.datagen;

import net.ks.heart_of_the_galaxy.Heart_of_the_Galaxy;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(PackOutput output, String locale) {
        super(output, Heart_of_the_Galaxy.MOD_ID, locale);
    }


    @Override
    protected void addTranslations() {
        add("item.heart_of_the_galaxy.raw_grain_of_skint", "Raw, unprocessed material.");
        add("item.heart_of_the_galaxy.skint_infected_flesh", "food or not");
        add("item.heart_of_the_galaxy.fine_sword", "just a fine sword");
        add("item.heart_of_the_galaxy.old_book", "A pages was eaten of skin-eater");
    }
}