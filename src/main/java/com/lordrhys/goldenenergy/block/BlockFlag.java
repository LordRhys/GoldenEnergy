package com.lordrhys.goldenenergy.block;

import net.minecraft.creativetab.CreativeTabs;

/**
 * GoldenEnergy Created by Frank on 5/13/2016.
 */
public class BlockFlag extends BlockGE
{
  public BlockFlag()
  {
    super();
    this.setBlockName("flag");
    this.setCreativeTab(CreativeTabs.tabDecorations);
    this.setBlockTextureName("flag");
    this.setHardness(0.5f);
    this.setLightLevel(0.65f);
  }
}
