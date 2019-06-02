package com.example.examplemod.lists;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialList implements IItemTier {
    tutorial(10.0f, 9.0f, 800, 3, 25, ItemList.tutorial_item);

    private float attackDamage, efficiency;
    private int durablity, harvestLevel, enchantability;
    private Item repairMaterial;

    private ToolMaterialList(float attackDamage, float efficiency, int durability, int hardnessLevel, int enchantability, Item repairMaterial ){
            this.attackDamage = attackDamage;
            this.efficiency = efficiency;
            this.durablity = durability;
            this.enchantability = enchantability;
            this.harvestLevel = hardnessLevel;
            this.repairMaterial = repairMaterial;
    }

    @Override
    public float getAttackDamage(){
        return this.attackDamage;
    }

    @Override
    public float getEfficiency(){
        return this.efficiency;
    }

    @Override
    public int getEnchantability(){
        return this.enchantability;
    }

    @Override
    public int getHarvestLevel(){
        return this.harvestLevel;
    }

    @Override
    public int getMaxUses(){
        return this.durablity;
    }

    @Override
    public Ingredient getRepairMaterial(){
        return Ingredient.fromItems(this.repairMaterial);
    }
}
