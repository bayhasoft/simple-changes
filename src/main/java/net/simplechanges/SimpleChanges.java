package net.simplechanges;

import net.fabricmc.api.ModInitializer;
import net.simplechanges.LootTablesModifiers.LootTablesEntitiesModifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleChanges implements ModInitializer {
	public static final String MOD_ID ="simplechanges";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
		
		LootTablesEntitiesModifier.modifyLootTables();

		ModRegisteries.registerModThings();
		

	}
}
