package penne.mod.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(BlockInit.ORE_OVERWORLD, new ItemStack(ItemInit.INGOT_COBALT, 1), 1.5f);
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ItemInit.INGOT_OBSIDIAN, 1), 1.5f);
	}
	
}
