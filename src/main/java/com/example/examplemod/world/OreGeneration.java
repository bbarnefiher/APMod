package com.example.examplemod.world;

import com.example.examplemod.lists.BlockList;
import com.sun.jna.platform.win32.WinUser;
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.CompositeFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MinableConfig;
import net.minecraft.world.gen.placement.CountRange;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraftforge.event.terraingen.WorldTypeEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
    public static void setupOreGeneration()
    {
        for (Biome biome: ForgeRegistries.BIOMES){
            CountRangeConfig tutorial_ore_placement = new CountRangeConfig(25, 20, 20, 100);
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.cobalt_ore.getDefaultState(), 20), new CountRange(), tutorial_ore_placement));
        }

    }
}
