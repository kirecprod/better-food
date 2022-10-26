package fr.kirecprod.betterfood.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class AlgaeItem extends Item
{
    public AlgaeItem()
    {
        super(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(2).saturationMod(0.0f).build()));
    }
}
