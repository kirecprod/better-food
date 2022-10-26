package fr.kirecprod.betterfood.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CornItem extends Item
{
    public CornItem()
    {
        super(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(4).saturationMod(0.5f).build()));
    }
}
