package com.example.examplemod;

import com.example.examplemod.items.ItemCustomAxe;
import com.example.examplemod.items.ItemCustomPickaxe;
import com.example.examplemod.lists.BlockList;
import com.example.examplemod.lists.ItemList;
import com.example.examplemod.lists.ToolMaterialList;
import com.example.examplemod.world.OreGeneration;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemLilyPad;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import java.io.File;
import net.minecraft.block.Block;
import com.example.examplemod.world.OreGeneration;

import javax.xml.stream.Location;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("examplemod")
public class ExampleMod {

    public static ExampleMod instance;
    public static final String modid = "examplemod";
    private static final Logger logger = LogManager.getLogger(modid);
    public static final ItemGroup tutorial = new ExampleModItemGroup();

    public ExampleMod() {
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){
        OreGeneration.setupOreGeneration();
        logger.info("Setup method registered.");
    }

    private void clientRegistries(final FMLClientSetupEvent event){
        logger.info("clientRegistries method registered.");
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegsitryEvents {

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll
                    (
                            ItemList.tutorial_item = new Item(new Item.Properties().group(tutorial)).setRegistryName(new ResourceLocation(modid, "tutorial_item")),
                            ItemList.test1 = new Item(new Item.Properties().group(tutorial)).setRegistryName(new ResourceLocation(modid, "test1")),
                            ItemList.winston = new Item(new Item.Properties().group(tutorial)).setRegistryName(new ResourceLocation(modid, "winston")),
                            ItemList.tutorial_ingot = new Item(new Item.Properties().group(tutorial)).setRegistryName(new ResourceLocation(modid, "tutorial_ingot")),

                            ItemList.tutorial_axe = new ItemCustomAxe(ToolMaterialList.tutorial, -1.0f, 6.0f, new Item.Properties().group(tutorial)).setRegistryName(new ResourceLocation(modid,"tutorial_axe")),
                            ItemList.tutorial_hoe = new ItemHoe(ToolMaterialList.tutorial, 6.0f, new Item.Properties().group(tutorial)).setRegistryName(new ResourceLocation(modid,"tutorial_hoe")),
                            ItemList.tutorial_pickaxe = new ItemCustomPickaxe(ToolMaterialList.tutorial, -2, 6.0f, new Item.Properties().group(tutorial)).setRegistryName(new ResourceLocation(modid,"tutorial_pickaxe")),
                            ItemList.tutorial_shovel = new ItemSpade(ToolMaterialList.tutorial, -3.0f, 6.0f, new Item.Properties().group(tutorial)).setRegistryName(new ResourceLocation(modid,"tutorial_shovel")),
                            ItemList.tutorial_sword = new ItemSword(ToolMaterialList.tutorial, 0, 6.0f, new Item.Properties().group(tutorial)).setRegistryName(new ResourceLocation(modid,"tutorial_sword")),

                            ItemList.tutorial_ore = new ItemBlock(BlockList.tutorial_ore, new Item.Properties().group(tutorial)).setRegistryName(new ResourceLocation(modid, "tutorial_ore")),
                            ItemList.tutorial_block = new ItemBlock(BlockList.tutorial_block, new Item.Properties().group(tutorial)).setRegistryName(new ResourceLocation(modid, "tutorial_block")),
                            ItemList.big_winston = new ItemBlock(BlockList.big_winston, new Item.Properties().group(tutorial)).setRegistryName(new ResourceLocation(modid, "big_winston"))

                    );

            logger.info("Items registered");
        }


@SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
            event.getRegistry().registerAll
                    (
                            BlockList.tutorial_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).lightValue(0).sound(SoundType.METAL)).setRegistryName(new ResourceLocation(modid, "tutorial_ore")),
                            BlockList.tutorial_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f,3.0f).lightValue(10).sound(SoundType.SLIME)).setRegistryName(new ResourceLocation(modid,"tutorial_block")),
                            BlockList.big_winston = new Block(Block.Properties.create(Material.CACTUS).hardnessAndResistance(2.0f,3.0f).lightValue(10).sound(SoundType.SLIME)).setRegistryName(new ResourceLocation(modid,"big_winston"))
                    );


            logger.info("Blocks registered");
        }

    }
}

