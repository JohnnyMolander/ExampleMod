package enderpet.examplemod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import enderpet.examplemod.blocks.BasicBlock;
import enderpet.examplemod.blocks.BlockWrapper;
import enderpet.examplemod.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MODID)
public class ModBlocks
{
	public static final BlockWrapper basicBlock = new BasicBlock();
	
	public static void init()
	{
		GameRegistry.registerBlock(basicBlock, "basicBlock");
	}
}
