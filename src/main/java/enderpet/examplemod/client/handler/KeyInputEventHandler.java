package enderpet.examplemod.client.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import enderpet.examplemod.client.settings.KeyBindings;
import enderpet.examplemod.reference.Key;
import enderpet.examplemod.utility.LogHelper;

public class KeyInputEventHandler
{
	private static Key getPressedKeyBinding()
	{
		if (KeyBindings.charge.isPressed())
		{
			return Key.CHARGE;
		}
		else if (KeyBindings.release.isPressed())
		{
			return Key.RELEASE;
		}
		
		return Key.UNKNOWN;
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
	{
		LogHelper.info("Key Pressed: " + getPressedKeyBinding());
	}
}