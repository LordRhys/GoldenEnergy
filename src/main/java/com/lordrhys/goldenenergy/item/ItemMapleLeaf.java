package com.lordrhys.goldenenergy.item;

import com.lordrhys.goldenenergy.reference.Names;
import net.minecraft.creativetab.CreativeTabs;

/**
 * GoldenEnergy Created by Frank on 5/13/2016.
 */
public class ItemMapleLeaf extends ItemGE
{
  public ItemMapleLeaf()
  {
    super();
    this.setMaxStackSize(64);
    this.setUnlocalizedName(Names.Items.MAPLE_LEAF);
    this.setCreativeTab(CreativeTabs.tabDecorations);
  }
}
