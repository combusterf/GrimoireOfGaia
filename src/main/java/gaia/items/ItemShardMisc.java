package gaia.items;

import gaia.Gaia;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemShardMisc extends Item {
	String texture;

	public ItemShardMisc(String texture) {
		this.texture = texture;
        this.setHasSubtypes(true);
        this.setUnlocalizedName("GrimoireOfGaia.ShardMisc");
		this.setCreativeTab(Gaia.tabGaia);
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < 2; i ++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}
}
