package enderpet.examplemod.creativetab;

import enderpet.examplemod.init.ModItems;
import enderpet.examplemod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModCreativeTabs
{
	public static final CreativeTabs EXAMPLE_TAB = new CreativeTabs(Reference.MODID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.basicItem;
		}
	};
}
