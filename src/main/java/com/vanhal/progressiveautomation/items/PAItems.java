package com.vanhal.progressiveautomation.items;

import com.vanhal.progressiveautomation.PAConfig;
import com.vanhal.progressiveautomation.items.upgrades.ItemDiamondUpgrade;
import com.vanhal.progressiveautomation.items.upgrades.ItemIronUpgrade;
import com.vanhal.progressiveautomation.items.upgrades.ItemMilkerUpgrade;
import com.vanhal.progressiveautomation.items.upgrades.ItemShearingUpgrade;
import com.vanhal.progressiveautomation.items.upgrades.ItemStoneUpgrade;
import com.vanhal.progressiveautomation.items.upgrades.ItemWitherUpgrade;
import com.vanhal.progressiveautomation.items.upgrades.ItemWoodUpgrade;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

public class PAItems {

    public static void preInit() {
        //create items


        if (PAConfig.allowWrench) {
            wrench = new ItemWrench();
            wrench.preInit();
        }

        if (PAConfig.allowWoodenLevel) woodUpgrade = new ItemWoodUpgrade();
        if (PAConfig.allowStoneLevel) stoneUpgrade = new ItemStoneUpgrade();
        if (PAConfig.allowIronLevel) ironUpgrade = new ItemIronUpgrade();
        if (PAConfig.allowDiamondLevel) diamondUpgrade = new ItemDiamondUpgrade();
        if (PAConfig.allowWitherUpgrade) witherUpgrade = new ItemWitherUpgrade();

        if (PAConfig.farmerEnabled) {
            if (PAConfig.allowMilkerUpgrade) milkerUpgrade = new ItemMilkerUpgrade();
            if (PAConfig.allowShearingUpgrade) shearingUpgrade = new ItemShearingUpgrade();
        }

        if (PAConfig.rfSupport) {
            rfEngine = new ItemRFEngine();
        }
        cheatRFEngine = new ItemCreativeRFEngine();

        //preInit them
        Item previousTier = Items.REDSTONE;
        if (woodUpgrade != null) {
            woodUpgrade.preInit(previousTier);
            previousTier = woodUpgrade;
        }
        if (stoneUpgrade != null) {
            stoneUpgrade.preInit(previousTier);
            previousTier = stoneUpgrade;
        }
        if (ironUpgrade != null) {
            ironUpgrade.preInit(previousTier);
            previousTier = ironUpgrade;
        }
        if (diamondUpgrade != null) {
            diamondUpgrade.preInit(previousTier);
        }

        if (witherUpgrade != null) witherUpgrade.preInit();

        if (milkerUpgrade != null) milkerUpgrade.preInit();
        if (shearingUpgrade != null) shearingUpgrade.preInit();

        if (PAConfig.rfSupport) {
            rfEngine.preInit();
        }
        cheatRFEngine.preInit();
    }

    public static void init(FMLInitializationEvent event) {

        if (event.getSide() == Side.CLIENT) {
            if (wrench != null) wrench.init();

            if (woodUpgrade != null) woodUpgrade.init();
            if (stoneUpgrade != null) stoneUpgrade.init();
            if (ironUpgrade != null) ironUpgrade.init();
            if (diamondUpgrade != null) diamondUpgrade.init();
            if (witherUpgrade != null) witherUpgrade.init();
            if (milkerUpgrade != null) milkerUpgrade.init();
            if (shearingUpgrade != null) shearingUpgrade.init();


            if (rfEngine != null) rfEngine.init();
            cheatRFEngine.init();


        }
    }

    public static void postInit() {

    }

    //items
    public static ItemWrench wrench = null;
    public static ItemManual manual = null;

    public static ItemWoodUpgrade woodUpgrade = null;
    public static ItemStoneUpgrade stoneUpgrade = null;
    public static ItemIronUpgrade ironUpgrade = null;
    public static ItemDiamondUpgrade diamondUpgrade = null;

    public static ItemWitherUpgrade witherUpgrade = null;
    public static ItemMilkerUpgrade milkerUpgrade = null;
    public static ItemShearingUpgrade shearingUpgrade = null;


    public static ItemRFEngine rfEngine = null;
    public static ItemRFEngine cheatRFEngine = null;


}
