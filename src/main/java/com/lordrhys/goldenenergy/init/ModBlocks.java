package com.lordrhys.goldenenergy.init;

import com.lordrhys.goldenenergy.block.BlockFlag;
import com.lordrhys.goldenenergy.block.BlockGE;
import com.lordrhys.goldenenergy.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * GoldenEnergy Created by Frank on 5/13/2016.
 */
@GameRegistry.ObjectHolder(Reference.MODID)
public class ModBlocks
{
  public static final BlockGE flag = new BlockFlag();

  public static void init()
  {
    GameRegistry.registerBlock(flag, "flag");
  }
}
