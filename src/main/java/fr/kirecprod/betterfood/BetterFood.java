package fr.kirecprod.betterfood;

import fr.kirecprod.betterfood.init.BetterFoodItemsInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(BetterFood.MODID)
public class BetterFood
{
    public static final String MODID = "betterfood";

    public BetterFood()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BetterFoodItemsInit.ITEMS.register(bus);
    }
}
