package com.vanhal.progressiveautomation.items;

import java.util.List;

import com.vanhal.progressiveautomation.blocks.BlockChopper;
import com.vanhal.progressiveautomation.blocks.BlockFarmer;
import com.vanhal.progressiveautomation.blocks.BlockPlanter;
import com.vanhal.progressiveautomation.entities.BaseTileEntity;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBlockMachine extends ItemBlock {

	public ItemBlockMachine(Block baseBlock) {
		super(baseBlock);
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer player, List<String> list, boolean par) {
		if (this.block instanceof BlockFarmer) {
			list.add(TextFormatting.GRAY + "Used to breed animals");
			list.add(TextFormatting.GRAY + "Use upgrades for shearing and milking");
			list.add(TextFormatting.GRAY + "Place on the same level as the animals");
		} else if (this.block instanceof BlockPlanter) {
			list.add(TextFormatting.GRAY + "Can plant and harvest all types of crops");
			list.add(TextFormatting.GRAY + "Machine should be placed one block below the ground");
		} else if (this.block instanceof BlockChopper) {
			list.add(TextFormatting.GRAY + "Can plant and harvest all types of tree");
			list.add(TextFormatting.GRAY + "Machine should be placed on the same level as saplings");
		}
		
		if ( (!itemStack.isEmpty()) && (itemStack.getTagCompound() != null) ) {
			list.add(TextFormatting.GRAY + "Pre-Configured");
		}
		
    }
	
	@Override
	public boolean placeBlockAt(ItemStack itemStack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ, IBlockState newState) {	
		boolean result = super.placeBlockAt(itemStack, player, world, pos, side, hitX, hitY, hitZ, newState);
		if (result) {
			if (!world.isRemote) {
				if (world.getTileEntity(pos) instanceof BaseTileEntity) {
					BaseTileEntity tileEntity = (BaseTileEntity) world.getTileEntity(pos);
					tileEntity.readFromItemStack(itemStack);
				}
			}
		}
		return result;
    }

}
