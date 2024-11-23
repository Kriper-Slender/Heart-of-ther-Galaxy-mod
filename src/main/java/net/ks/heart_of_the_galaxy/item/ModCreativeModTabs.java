package net.ks.heart_of_the_galaxy.item;

import net.ks.heart_of_the_galaxy.Heart_of_the_Galaxy;
import net.ks.heart_of_the_galaxy.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Heart_of_the_Galaxy.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Heart_of_the_Galaxy_Tab = CREATIVE_MODE_TABS.register("heart_of_the_galaxy_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.old_book.get()))
                    .title(Component.translatable("creativetab.Heart_of_the_Galaxy_Tab"))
                    .displayItems((pParatneters, pOutput) -> {
                        ///other item
                        pOutput.accept(ModItems.old_book.get());
                        pOutput.accept(ModItems.karas.get());

                        ///skint - raw
                        pOutput.accept(ModItems.raw_grain_of_skint.get());
                        ///skint - not raw
                        pOutput.accept(ModItems.grain_of_skint.get());

                        ///food
                        pOutput.accept(ModItems.skint_infected_flesh.get());

                        ///sword
                        pOutput.accept(ModItems.fine_sword.get());

                        ///block
                        pOutput.accept(ModBlocks.Deepslate_avi_sign.get());
                        pOutput.accept(ModBlocks.SKINT_COVERED_ANVIL.get());

                        ///armor
                        pOutput.accept(ModItems.worldwalker_chestplate.get());
                        pOutput.accept(ModItems.worldwalker_leggings.get());
                        pOutput.accept(ModItems.worldwalker_boots.get());


                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
