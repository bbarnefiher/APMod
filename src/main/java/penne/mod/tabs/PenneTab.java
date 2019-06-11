package penne.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import penne.mod.init.ItemInit;

public class PenneTab extends CreativeTabs
{
		public PenneTab (String label) { super("pennetab");
		this.setBackgroundImageName("penne.png"); }
		public ItemStack getTabIconItem() { return new ItemStack(ItemInit.INGOT_COBALT);}
}