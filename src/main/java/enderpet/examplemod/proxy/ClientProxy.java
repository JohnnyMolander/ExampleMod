package enderpet.examplemod.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import enderpet.examplemod.client.settings.KeyBindings;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerKeyBindings()
	{
		ClientRegistry.registerKeyBinding(KeyBindings.charge);
		ClientRegistry.registerKeyBinding(KeyBindings.release);
	}
}