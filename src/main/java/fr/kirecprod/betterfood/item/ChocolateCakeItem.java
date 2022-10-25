package fr.kirecprod.betterfood.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ChocolateCakeItem extends Item
{
    public ChocolateCakeItem()
    {
        super(new Item.Properties().durability(8).tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(7).saturationMod(0.6f).build()));
    }
}
