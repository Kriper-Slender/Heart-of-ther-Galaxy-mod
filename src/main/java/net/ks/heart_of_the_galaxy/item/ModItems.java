package net.ks.heart_of_the_galaxy.item;

import net.ks.heart_of_the_galaxy.item.custom.ModFoods;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, net.ks.heart_of_the_galaxy.Heart_of_the_Galaxy.MOD_ID);

    ///item
    public static final RegistryObject<Item> old_book = ITEMS.register("old_book",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> karas = ITEMS.register("karas",
            () -> new Item(new Item.Properties()));

    ///skint - raw
    public static final RegistryObject<Item> raw_grain_of_skint = ITEMS.register("raw_grain_of_skint",
            () -> new Item(new Item.Properties()));
    ///skint - not raw
    public static final RegistryObject<Item> grain_of_skint = ITEMS.register("grain_of_skint",
            () -> new Item(new Item.Properties()));
    ///sword
    public static final RegistryObject<Item> fine_sword = ITEMS.register("fine_sword",
            () -> new SwordItem(ModToolTiers.Skint,3,1, new Item.Properties()));

    ///food
    public static final RegistryObject<Item> skint_infected_flesh = ITEMS.register("skint_infected_flesh",
            () -> new Item(new Item.Properties().food(ModFoods.skint_infected_flesh).durability(2)));
    ///armor

    public static final RegistryObject<Item> worldwalker_chestplate = ITEMS.register("worldwalker_chestplate",
            () -> new ArmorItem(ModArmorMaterials.worldwalker, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> worldwalker_leggings = ITEMS.register("worldwalker_leggings",
            () -> new ArmorItem(ModArmorMaterials.worldwalker, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> worldwalker_boots = ITEMS.register("worldwalker_boots",
            () -> new ArmorItem(ModArmorMaterials.worldwalker, ArmorItem.Type.BOOTS, new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
