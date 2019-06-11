package penne.mod.init;

import java.awt.List;
import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import penne.mod.objects.blocks.BlockBase;
import penne.mod.objects.blocks.CustomBlockLogs;
import penne.mod.objects.blocks.BlockOres;
import penne.mod.objects.blocks.CustomBlockPlanks;
import penne.mod.objects.blocks.CustomBlockSaplings;

public class BlockInit {
	
	public static final ArrayList<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	
	public static final Block PLANKS = new CustomBlockPlanks("planks");
	public static final Block LOGS = new CustomBlockLogs("planks");
	public static final Block LEAVES = new BlockLeaves("planks");
	public static final Block SAPLINGS = new CustomBlockSaplings("planks");
	
}
