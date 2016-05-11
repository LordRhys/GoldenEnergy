package com.lordrhys.goldenenergy.client.gui;

import com.lordrhys.goldenenergy.handler.ConfigurationHandler;
import com.lordrhys.goldenenergy.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * GoldenEnergy Created by Frank on 5/10/2016.
 */
public class ModGuiConfig extends GuiConfig
{

  public ModGuiConfig(GuiScreen guiScreen)
  {
    super(guiScreen,
          new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
          Reference.MODID,
          false,
          false,
          GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));

  }
}
