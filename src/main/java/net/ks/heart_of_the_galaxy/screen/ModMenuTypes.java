package net.ks.heart_of_the_galaxy.screen;

import net.ks.heart_of_the_galaxy.Heart_of_the_Galaxy;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, Heart_of_the_Galaxy.MOD_ID);

    public static final RegistryObject<MenuType<skintcoveredanvilmenu>> Skint_Covered_Anvil_Menu =
            registerMenuType(skintcoveredanvilmenu::new);


    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory) {
        return MENUS.register("skint_covered_anvil_menu", () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}