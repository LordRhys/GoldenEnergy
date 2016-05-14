package com.lordrhys.goldenenergy.handler;

import com.lordrhys.goldenenergy.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * GoldenEnergy Created by Frank on 5/10/2016.
 */
public class ConfigurationHandler
{
  public static Configuration configuration;
  private static boolean testValue = false;

  public static void init(File configFile)
  {
    // Create the configuration object from the given configuration file
    if (configuration == null)
    {
      configuration = new Configuration(configFile, true);
      loadConfiguration();
    }
  }

  @SubscribeEvent
  public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
  {
    if (event.modID.equalsIgnoreCase(Reference.MODID))
    {
      loadConfiguration();
    }
  }

  private static void loadConfiguration()
  {
    // Read in properties from configuration file
    testValue = configuration.getBoolean("configValue", "mycraft", false, "This is an example config value");

    // Save the configuration file
    if (configuration.hasChanged())
    {
      configuration.save();
    }
  }
}
