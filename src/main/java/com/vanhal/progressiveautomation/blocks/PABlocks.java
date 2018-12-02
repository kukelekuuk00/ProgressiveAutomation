package com.vanhal.progressiveautomation.blocks;

import java.util.ArrayList;
import java.util.List;

import com.vanhal.progressiveautomation.PAConfig;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class PABlocks {

	public static void preInit() {
		//create the blocks
		for (int i = 0; i <= 3; i++) {
			if (PAConfig.allowLevel(i)) {
				if (PAConfig.chopperEnabled) chopper.add(new BlockChopper(i));
				if (PAConfig.planterEnabled) planter.add(new BlockPlanter(i));
				if (PAConfig.crafterEnabled) crafter.add(new BlockCrafter(i));
				if (PAConfig.farmerEnabled) farmer.add(new BlockFarmer(i));
			}
		}

		//preInit
		for (BlockChopper blockChopper : chopper) {
			blockChopper.preInit();
		}
		
		for (BlockPlanter blockPlanter : planter) {
			blockPlanter.preInit();
		}
		
		for (BlockCrafter blockCrafter : crafter) {
			blockCrafter.preInit();
		}

		for (BlockFarmer blockFarmer : farmer) {
			blockFarmer.preInit();
		}
	}

	public static void init() {
		for (BlockChopper blockChopper : chopper) {
			blockChopper.init();
		}
		
		for (BlockPlanter blockPlanter : planter) {
			blockPlanter.init();
		}

		for (BlockCrafter blockCrafter : crafter) {
			blockCrafter.init();
		}

		for (BlockFarmer blockfarmer : farmer) {
			blockfarmer.init();
		}
	}

	public static void postInit() {
		for (BlockChopper blockChopper : chopper) {
			blockChopper.postInit();
		}
		
		for (BlockPlanter blockPlanter : planter) {
			blockPlanter.postInit();
		}

		for (BlockCrafter blockCrafter : crafter) {
			blockCrafter.postInit();
		}

		for (BlockFarmer blockfarmer : farmer) {
			blockfarmer.postInit();
		}
	}

	//blocks

	//choppers
	public static List<BlockChopper> chopper = new ArrayList<BlockChopper>(4);

	//planters
	public static List<BlockPlanter> planter = new ArrayList<BlockPlanter>(4);

	//crafters
	public static List<BlockCrafter> crafter = new ArrayList<BlockCrafter>(4);

	//farmers
	public static List<BlockFarmer> farmer = new ArrayList<BlockFarmer>(4);

}
