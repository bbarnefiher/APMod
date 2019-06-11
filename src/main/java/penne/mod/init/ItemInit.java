package penne.mod.init;

import java.util.ArrayList;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import penne.mod.objects.Item.ItemBase;
import penne.mod.objects.armour.ArmourBase;
import penne.mod.objects.tools.ToolAxe;
import penne.mod.objects.tools.ToolHoe;
import penne.mod.objects.tools.ToolPickaxe;
import penne.mod.objects.tools.ToolShovel;
import penne.mod.objects.tools.ToolSword;
import penne.mod.util.Reference;

public class ItemInit {
	
	public static final ArrayList<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial TOOL_OBSIDIAN = EnumHelper.addToolMaterial("tool_obsidian", 3, 1800, 9.0f, 4.0f, 12);
	public static final ArmorMaterial ARMOUR_OBSIDIAN = EnumHelper.addArmorMaterial("armour_obsidian", Reference.MODID + ":obsidian", 35, new int[] {4, 7, 9, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0f);
	
	public static final ToolMaterial TOOL_COBALT = EnumHelper.addToolMaterial("tool_cobalt", 3, 1800, 9.0f, 4.0f, 12);
	public static final ArmorMaterial ARMOUR_COBALT = EnumHelper.addArmorMaterial("armour_cobalt", Reference.MODID + ":cobalt", 35, new int[] {4, 7, 9, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0f);
	
	//Items
	public static final Item INGOT_OBSIDIAN = new ItemBase("ingot_obsidian");
	public static final Item INGOT_COBALT = new  ItemBase("ingot_cobalt");
	
	//Tools
	public static final Item AXE_OBSIDIAN = new ToolAxe("axe_obsidian", TOOL_OBSIDIAN);
	public static final Item HOE_OBSIDIAN = new ToolHoe("hoe_obsidian", TOOL_OBSIDIAN);
	public static final Item PICKAXE_OBSIDIAN = new ToolPickaxe("pickaxe_obsidian", TOOL_OBSIDIAN);
	public static final Item SHOVEL_OBSIDIAN = new ToolShovel("shovel_obsidian", TOOL_OBSIDIAN);
	public static final Item SWORD_OBSIDIAN = new ToolSword("sword_obsidian", TOOL_OBSIDIAN);
	
	public static final Item AXE_COBALT = new ToolAxe("axe_cobalt", TOOL_COBALT);
	public static final Item HOE_COBALT = new ToolHoe("hoe_cobalt", TOOL_COBALT);
	public static final Item PICKAXE_COBALT = new ToolPickaxe("pickaxe_cobalt", TOOL_COBALT);
	public static final Item SHOVEL_COBALT = new ToolShovel("shovel_cobalt", TOOL_COBALT);
	public static final Item SWORD_COBALT = new ToolSword("sword_cobalt", TOOL_COBALT);
	
	//Armour
	public static final Item HELMET_OBSIDIAN = new ArmourBase("helmet_obsidian", ARMOUR_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_OBSIDIAN = new ArmourBase("chestplate_obsidian", ARMOUR_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_OBSIDIAN = new ArmourBase("leggings_obsidian", ARMOUR_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_OBSIDIAN = new ArmourBase("boots_obsidian", ARMOUR_OBSIDIAN, 1, EntityEquipmentSlot.FEET);
	
	public static final Item HELMET_COBALT = new ArmourBase("helmet_cobalt", ARMOUR_COBALT, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_COBALT = new ArmourBase("chestplate_cobalt", ARMOUR_COBALT, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_COBALT = new ArmourBase("leggings_cobalt", ARMOUR_COBALT, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_COBALT = new ArmourBase("boots_cobalt", ARMOUR_COBALT, 1, EntityEquipmentSlot.FEET);
	
}
