package com.example.examplemod;

//import com.example.examplemod.lists.BlockList;
import com.example.examplemod.lists.ItemList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

public class ExampleModItemGroup extends ItemGroup {

    public ExampleModItemGroup(){
        super("tutorial");
    }

    @Override
    public ItemStack createIcon(){
        return new ItemStack(ItemList.winston);
    }
}
