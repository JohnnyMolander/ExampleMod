package enderpet.examplemod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
	public static void init()
	{
		/*
		GameRegistry.addRecipe(new ItemStack(ModItems.basicItem), " S ", "SSS", " S ", 'S', new ItemStack(Items.stick));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.basicBlock), new ItemStack(ModItems.basicItem), new ItemStack(ModItems.basicItem));
		*/
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.basicItem), " S ", "SSS", " S ", 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.basicBlock), new ItemStack(ModItems.basicItem), new ItemStack(ModItems.basicItem)));
	}
}