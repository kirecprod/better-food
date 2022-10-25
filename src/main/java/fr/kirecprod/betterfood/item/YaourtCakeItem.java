package fr.kirecprod.betterfood.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class YaourtCakeItem extends Item
{
    public YaourtCakeItem()
    {
        super(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(7).saturationMod(0.6f).build()).durability(8));
    }
}
