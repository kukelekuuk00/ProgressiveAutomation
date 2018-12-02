package com.vanhal.progressiveautomation.items.upgrades;

import java.util.List;

import com.vanhal.progressiveautomation.PAConfig;
import com.vanhal.progressiveautomation.items.PAItems;
import com.vanhal.progressiveautomation.upgrades.UpgradeType;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ItemWitherUpgrade extends ItemUpgrade {
	public ItemWitherUpgrade() {
		super("WitherUpgrade", UpgradeType.WITHER);
	}

	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer player, List<String> list, boolean par) {
		list.add(TextFormatting.GRAY + "Multiplies the range of a machine by "+PAConfig.witherMultiplier);
       
    }
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack itemStack) {
        return true;
    }
}
