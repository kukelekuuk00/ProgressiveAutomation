package com.vanhal.progressiveautomation.core;

import com.vanhal.progressiveautomation.ProgressiveAutomation;
import com.vanhal.progressiveautomation.entities.chopper.TileChopper;
import com.vanhal.progressiveautomation.entities.chopper.TileChopperDiamond;
import com.vanhal.progressiveautomation.entities.chopper.TileChopperIron;
import com.vanhal.progressiveautomation.entities.chopper.TileChopperStone;
import com.vanhal.progressiveautomation.entities.crafter.TileCrafter;
import com.vanhal.progressiveautomation.entities.crafter.TileCrafterDiamond;
import com.vanhal.progressiveautomation.entities.crafter.TileCrafterIron;
import com.vanhal.progressiveautomation.entities.crafter.TileCrafterStone;
import com.vanhal.progressiveautomation.entities.farmer.TileFarmer;
import com.vanhal.progressiveautomation.entities.farmer.TileFarmerDiamond;
import com.vanhal.progressiveautomation.entities.farmer.TileFarmerIron;
import com.vanhal.progressiveautomation.entities.farmer.TileFarmerStone;
import com.vanhal.progressiveautomation.entities.planter.TilePlanter;
import com.vanhal.progressiveautomation.entities.planter.TilePlanterDiamond;
import com.vanhal.progressiveautomation.entities.planter.TilePlanterIron;
import com.vanhal.progressiveautomation.entities.planter.TilePlanterStone;
import com.vanhal.progressiveautomation.ref.Ref;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Proxy {

	public void registerEntities() {
		//chopper
		GameRegistry.registerTileEntity(TileChopper.class, new ResourceLocation(Ref.MODID,"TileChopper"));
		GameRegistry.registerTileEntity(TileChopperStone.class, new ResourceLocation(Ref.MODID,"TileChopperStone"));
		GameRegistry.registerTileEntity(TileChopperIron.class, new ResourceLocation(Ref.MODID,"TileChopperIron"));
		GameRegistry.registerTileEntity(TileChopperDiamond.class, new ResourceLocation(Ref.MODID,"TileChopperDiamond"));
		
		//planter
		GameRegistry.registerTileEntity(TilePlanter.class, new ResourceLocation(Ref.MODID,"TilePlanter"));
		GameRegistry.registerTileEntity(TilePlanterStone.class, new ResourceLocation(Ref.MODID,"TilePlanterStone"));
		GameRegistry.registerTileEntity(TilePlanterIron.class, new ResourceLocation(Ref.MODID,"TilePlanterIron"));
		GameRegistry.registerTileEntity(TilePlanterDiamond.class, new ResourceLocation(Ref.MODID,"TilePlanterDiamond"));

		//crafter
		GameRegistry.registerTileEntity(TileCrafter.class, new ResourceLocation(Ref.MODID,"TileCrafter"));
		GameRegistry.registerTileEntity(TileCrafterStone.class, new ResourceLocation(Ref.MODID,"TileCrafterStone"));
		GameRegistry.registerTileEntity(TileCrafterIron.class, new ResourceLocation(Ref.MODID,"TileCrafterIron"));
		GameRegistry.registerTileEntity(TileCrafterDiamond.class, new ResourceLocation(Ref.MODID,"TileCrafterDiamond"));

		//farmer
		GameRegistry.registerTileEntity(TileFarmer.class, new ResourceLocation(Ref.MODID,"TileFarmer"));
		GameRegistry.registerTileEntity(TileFarmerStone.class, new ResourceLocation(Ref.MODID,"TileFarmerStone"));
		GameRegistry.registerTileEntity(TileFarmerIron.class, new ResourceLocation(Ref.MODID,"TileFarmerIron"));
		GameRegistry.registerTileEntity(TileFarmerDiamond.class, new ResourceLocation(Ref.MODID,"TileFarmerDiamond"));
	}
	
	public int registerGui(String guiName) {
		return registerGui(guiName, guiName);
	}
	
	public int registerGui(String guiName, String containerName) {
		Class<?> gui = null;
		Class<?> container = null;
		try {
			gui = Proxy.class.getClassLoader().loadClass("com.vanhal.progressiveautomation.gui.client.GUI" + guiName);
		} catch (ClassNotFoundException e) {
			
		}
		try {
			container = Proxy.class.getClassLoader().loadClass("com.vanhal.progressiveautomation.gui.container.Container" + containerName);
		} catch (ClassNotFoundException e) {
			return -1;
		}
		if (gui == null) {
			return ProgressiveAutomation.guiHandler.registerServerGui(container);
		} else {
			return ProgressiveAutomation.guiHandler.registerGui(gui, container);
		}
		
	}
	
	public boolean isClient() {
		return false;
	}
	
	public boolean isServer() {
		return true;
	}

	
	public void preInit() {
		
	}
	
	public void init() {
		
	}
	
	public void postInit() {
		
	}
}
