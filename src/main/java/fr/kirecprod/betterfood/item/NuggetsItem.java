package fr.kirecprod.betterfood.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class NuggetsItem extends Item
{
    public NuggetsItem()
    {
        super(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(8).saturationMod(0.4f).build()));
    }
}
