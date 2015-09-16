package enderpet.examplemod.handler;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import enderpet.examplemod.reference.Reference;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler
{

	public static Configuration configuration;
	public static boolean testValue = false;

	public static void init(File configFile)
	{
		// Create the configuration object from the given configuration file
		if (configuration == null)
		{
			configuration = new Configuration(configFile);
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

		testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value.");

		if (configuration.hasChanged())
		{
			configuration.save();
		}
	}

}
