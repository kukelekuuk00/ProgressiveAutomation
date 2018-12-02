package com.vanhal.progressiveautomation.items.upgrades;

import com.vanhal.progressiveautomation.ref.ToolHelper;
import com.vanhal.progressiveautomation.upgrades.UpgradeType;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ItemWoodUpgrade extends ItemTieredUpgrade {
	
	public ItemWoodUpgrade() {
		super("WoodUpgrade", UpgradeType.WOODEN, ToolHelper.LEVEL_WOOD);
	}
}
