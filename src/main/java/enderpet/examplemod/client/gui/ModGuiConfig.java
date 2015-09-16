package enderpet.examplemod.client.gui;

import java.util.List;

import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import enderpet.examplemod.handler.ConfigurationHandler;
import enderpet.examplemod.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

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
