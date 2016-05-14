package com.lordrhys.goldenenergy.init;

import com.lordrhys.goldenenergy.item.ItemGE;
import com.lordrhys.goldenenergy.item.ItemMapleLeaf;
import com.lordrhys.goldenenergy.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * GoldenEnergy Created by Frank on 5/13/2016.
 */

@GameRegistry.ObjectHolder(Reference.MODID)
public class ModItems
{
  public static final ItemGE mapleLeaf = new ItemMapleLeaf();

  public static void init()
  {
    GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
  }
}
