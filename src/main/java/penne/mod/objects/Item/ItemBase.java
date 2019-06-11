package penne.mod.objects.Item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import penne.mod.Main;
import penne.mod.init.ItemInit;
import penne.mod.util.interfaces.IHasModel;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name) 
	{
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
