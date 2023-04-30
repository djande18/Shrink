package club.iananderson.shrink.creativeTab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static club.iananderson.shrink.init.ItemInit.JEWEL;

public class ModCreativeTab extends CreativeModeTab {
    private ModCreativeTab(int index, String label){
        super(index,label);
    }

    @Override
    public ItemStack makeIcon(){
        return new ItemStack(JEWEL.get());
    }

    public static final ModCreativeTab INSTANCE = new ModCreativeTab(CreativeModeTab.TABS.length, "shrink");

}
