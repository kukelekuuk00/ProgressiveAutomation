package com.vanhal.progressiveautomation.items.upgrades;

import com.vanhal.progressiveautomation.ref.ToolHelper;
import com.vanhal.progressiveautomation.upgrades.UpgradeType;

public class ItemStoneUpgrade extends ItemTieredUpgrade {
    public ItemStoneUpgrade() {
        super("StoneUpgrade", UpgradeType.STONE, ToolHelper.LEVEL_STONE);
    }
}
