package com.lordrhys.goldenenergy.handler;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * GoldenEnergy Created by Frank on 5/10/2016.
 */
public class ConfigurationHandler
{
  public static Configuration configuration;

  public static void init(File configFile)
  {
    // Create the configuration object from the given configuration file
    Configuration configuration = new Configuration(configFile);
    boolean configValue = false;
    int configValue2 = 125;

    try
    {
      // Load the configuration file
      configuration.load();

      // Read in properties from configuration file
      configValue = configuration.getBoolean("configValue", "ForgeCraft", true, "This is an example config value");
      configValue2 = configuration.getInt("configValue2", "MyCraft", 45, 0, 100, "This is an example config value");
    }
    catch (Exception e)
    {
      // Log the exception
    }
    finally
    {
      // Save the configuration file
      if (configuration.hasChanged())
      {
        configuration.save();
      }
    }

    System.out.println("Configuration Test: " + configValue);
    System.out.println("Configuration Test2: " + configValue2);
  }
}
