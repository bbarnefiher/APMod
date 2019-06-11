package penne.mod.objects.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import penne.mod.Main;
import penne.mod.init.ItemInit;
import penne.mod.util.interfaces.IHasModel;

public class ArmourBase extends ItemArmor implements IHasModel {
	public ArmourBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.pennetab);
		
		ItemInit.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}


}
