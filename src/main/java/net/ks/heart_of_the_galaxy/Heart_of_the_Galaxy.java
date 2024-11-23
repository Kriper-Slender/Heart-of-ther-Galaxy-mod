package net.ks.heart_of_the_galaxy;

import net.ks.heart_of_the_galaxy.block.ModBlocks;
import net.ks.heart_of_the_galaxy.block.entity.ModBlockEntities;
import net.ks.heart_of_the_galaxy.datagen.DataGenerators;
import net.ks.heart_of_the_galaxy.item.ModCreativeModTabs;
import net.ks.heart_of_the_galaxy.item.ModItems;
import net.ks.heart_of_the_galaxy.screen.ModMenuTypes;
import net.ks.heart_of_the_galaxy.screen.SkintCoveredAnvilScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Heart_of_the_Galaxy.MOD_ID)
public class Heart_of_the_Galaxy
{

    public static final String MOD_ID = "heart_of_the_galaxy";

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventSubscriber {

        @SubscribeEvent
        public static void onGatherData(GatherDataEvent event) {
            DataGenerators.gatherData(event);
        }
    }


    public Heart_of_the_Galaxy()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            MenuScreens.register(ModMenuTypes.Skint_Covered_Anvil_Menu.get(), SkintCoveredAnvilScreen::new);

        }
    }
}
