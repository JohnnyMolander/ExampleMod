package enderpet.examplemod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import enderpet.examplemod.items.BasicItem;
import enderpet.examplemod.items.ItemWrapper;
import enderpet.examplemod.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MODID)
public class ModItems
{
	public static final ItemWrapper basicItem = new BasicItem();
	
	public static void init()
	{
		GameRegistry.registerItem(basicItem, "basicItem");
	}
}
