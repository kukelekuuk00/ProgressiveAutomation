package com.vanhal.progressiveautomation.blocks;

import com.vanhal.progressiveautomation.entities.farmer.TileFarmer;
import com.vanhal.progressiveautomation.entities.farmer.TileFarmerDiamond;
import com.vanhal.progressiveautomation.entities.farmer.TileFarmerIron;
import com.vanhal.progressiveautomation.entities.farmer.TileFarmerStone;
import com.vanhal.progressiveautomation.ref.ToolHelper;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class BlockFarmer extends BaseBlock {

	public BlockFarmer(int level) {
		super("Farmer", level);
		this.rangeCount = 1;
	}
	@Override
	public TileEntity createNewTileEntity(World world, int var2) {
		if (blockLevel >= ToolHelper.LEVEL_DIAMOND) return new TileFarmerDiamond();
		else if (blockLevel == ToolHelper.LEVEL_IRON) return new TileFarmerIron();
		else if (blockLevel == ToolHelper.LEVEL_STONE) return new TileFarmerStone();
		else return new TileFarmer();
	}
}
