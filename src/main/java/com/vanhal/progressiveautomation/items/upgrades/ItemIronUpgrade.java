package com.vanhal.progressiveautomation.items.upgrades;

import com.vanhal.progressiveautomation.items.PAItems;
import com.vanhal.progressiveautomation.ref.ToolHelper;
import com.vanhal.progressiveautomation.upgrades.UpgradeType;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ItemIronUpgrade extends ItemTieredUpgrade {
	public ItemIronUpgrade() {
		super("IronUpgrade", UpgradeType.IRON, ToolHelper.LEVEL_IRON);
		//this.setTextureName(Ref.MODID+":Iron_Upgrade");
	}
}
