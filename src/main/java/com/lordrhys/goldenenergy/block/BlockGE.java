package com.lordrhys.goldenenergy.block;

import com.lordrhys.goldenenergy.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * GoldenEnergy Created by Frank on 5/13/2016.
 */
public class BlockGE extends Block
{
  public BlockGE(Material material)
  {
    super(material);
  }

  public BlockGE()
  {
    this(Material.rock);
  }

  @Override
  public String getUnlocalizedName()
  {
    return String.format("tile.%s%s", Reference.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
  }

  @Override
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister)
  {
    blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
  }

  protected String getUnwrappedUnlocalizedName(String unlocalizedName)
  {
    return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
  }
}
