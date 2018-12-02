package com.vanhal.progressiveautomation.gui;

import java.util.Set;

import com.vanhal.progressiveautomation.gui.client.PAGuiConfig;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

public class PAGuiFactory implements IModGuiFactory {
	
	@Override
	public boolean hasConfigGui() {
        return true;
    }

	@Override
	public void initialize(Minecraft minecraftInstance) {
		// TODO Auto-generated method stub
	}

	public GuiScreen createConfigGui(GuiScreen parentScreen) {
		return new PAGuiConfig(parentScreen);
	}


	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
		// TODO Auto-generated method stub
		return null;
	}
}
