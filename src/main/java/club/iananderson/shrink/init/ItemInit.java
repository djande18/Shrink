package club.iananderson.shrink.init;

import club.iananderson.shrink.creativeTab.ModCreativeTab;
import net.minecraft.world.entity.projectile.EyeOfEnder;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.EggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static club.iananderson.shrink.Shrink.MODID;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> JEWEL = ITEMS.register("jewel", () -> new Item(new Item.Properties().tab(ModCreativeTab.INSTANCE)
            .food(new FoodProperties.Builder().nutrition(4).saturationMod(2).build())));

}
