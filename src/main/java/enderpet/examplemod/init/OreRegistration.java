package enderpet.examplemod.init;

import net.minecraftforge.oredict.OreDictionary;

public class OreRegistration
{
	public static void init()
	{
		OreDictionary.registerOre("stickWood", ModItems.basicItem);
	}
}
