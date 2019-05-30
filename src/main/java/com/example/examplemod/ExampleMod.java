package com.example.examplemod;

import com.example.examplemod.lists.BlockList;
import com.example.examplemod.lists.ItemList;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import java.io.File;

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

                            ItemList.tutorial_block = new ItemBlock(BlockList.tutorial_block, new Item.Properties().group(tutorial)).setRegistryName(new ResourceLocation(modid, "tutorial_block"))
                    );

            logger.info("Items registered");
        }

    }
}

