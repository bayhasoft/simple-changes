package net.simplechanges;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.simplechanges.Blocks.Modblocks;
import net.simplechanges.LootTablesModifiers.LootTablesEntitiesModifier;
import net.simplechanges.Recipe.ModRecipes;
import net.simplechanges.Screen.ModScreenHandlers;

public class SimpleChanges implements ModInitializer {
	public static final String MOD_ID ="simplechanges";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		Modblocks.registerModBlocks();
		ModScreenHandlers.registerAllScreenHandlers();
		
		LootTablesEntitiesModifier.modifyLootTables();

		ModRecipes.registerRecipes();
	}

}
