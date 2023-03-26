package net.simple_changes;

import net.fabricmc.api.ModInitializer;
import net.simple_changes.LootTablesModifiers.LootTablesEntitiesModifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleChanges implements ModInitializer {
	public static final String MOD_ID ="simple_changes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		
		LootTablesEntitiesModifier.modifyLootTables();

	}
}
