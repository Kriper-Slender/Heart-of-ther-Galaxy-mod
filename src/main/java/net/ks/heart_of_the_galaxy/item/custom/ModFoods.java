package net.ks.heart_of_the_galaxy.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class  ModFoods {
    public static final FoodProperties skint_infected_flesh = new FoodProperties.Builder().meat().nutrition(2)
            .saturationMod(2).effect(() -> new MobEffectInstance(MobEffects.WEAKNESS,  200), 1.0f).build();
}