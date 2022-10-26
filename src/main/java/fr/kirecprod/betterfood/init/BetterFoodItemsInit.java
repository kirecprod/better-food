package fr.kirecprod.betterfood.init;

import fr.kirecprod.betterfood.BetterFood;
import fr.kirecprod.betterfood.item.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BetterFoodItemsInit
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterFood.MODID);

    public static final RegistryObject<Item> RICE = ITEMS.register("rice", () -> new RiceItem());
    public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate", () -> new ChocolateItem());
    public static final RegistryObject<Item> FRIED_EGGS = ITEMS.register("fried_eggs", () -> new FriedEggsItem());
    public static final RegistryObject<Item> SUSHI = ITEMS.register("sushi", () -> new SushiItem());
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new CheeseItem());
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new TomatoItem());
    public static final RegistryObject<Item> SALAD = ITEMS.register("salad", () -> new SaladItem());
    public static final RegistryObject<Item> POPCORN = ITEMS.register("pop_corn", () -> new PopCornItem());
    public static final RegistryObject<Item> WRAP = ITEMS.register("wrap", () -> new WrapItem());
    public static final RegistryObject<Item> BURGER = ITEMS.register("burger", () -> new BurgerItem());
    public static final RegistryObject<Item> YAOURT_CAKE = ITEMS.register("yaourt_cake", () -> new YaourtCakeItem());
    public static final RegistryObject<Item> CHOCOLATE_CAKE = ITEMS.register("chocolate_cake", () -> new ChocolateCakeItem());
    public static final RegistryObject<Item> PANCAKES = ITEMS.register("pancakes", () -> new PancakesItem());
    public static final RegistryObject<Item> FRIES = ITEMS.register("fries", () -> new FriesItem());
    public static final RegistryObject<Item> NUGGETS = ITEMS.register("nuggets", () -> new NuggetsItem());
    public static final RegistryObject<Item> CORN = ITEMS.register("corn", () -> new CornItem());
    public static final RegistryObject<Item> PASTA = ITEMS.register("pasta", () -> new PastasItem());
    public static final RegistryObject<Item> PASTA_BOLOGNESE = ITEMS.register("pasta_bolognese", () -> new PastaBologneseItem());
    public static final RegistryObject<Item> ALGAE = ITEMS.register("algae", () -> new AlgaeItem());
}
