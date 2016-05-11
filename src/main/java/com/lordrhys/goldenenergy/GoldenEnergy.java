package com.lordrhys.goldenenergy;

import com.lordrhys.goldenenergy.handler.ConfigurationHandler;
import com.lordrhys.goldenenergy.proxy.IProxy;
import com.lordrhys.goldenenergy.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * GoldenEnergy Created by Frank on 5/10/2016.
 */

@Mod(modid= Reference.MODID, name=Reference.NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class GoldenEnergy
{
  @Mod.Instance(Reference.MODID)
  public static GoldenEnergy instance;

  @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
  public static IProxy proxy;

  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event)
  {
    ConfigurationHandler.init(event.getSuggestedConfigurationFile());
  }

  @Mod.EventHandler
  public void init(FMLInitializationEvent event)
  {

  }

  @Mod.EventHandler
  public void postInitialization(FMLPostInitializationEvent event)
  {

  }
}
