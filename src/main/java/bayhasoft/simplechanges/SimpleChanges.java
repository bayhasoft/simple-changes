package bayhasoft.simplechanges;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bayhasoft.simplechanges.LootTablesModifiers.LootTablesEntitiesModifier;
import bayhasoft.simplechanges.util.CustomTrades;
import bayhasoft.simplechanges.util.ModRegisteries;
import net.fabricmc.api.ModInitializer;

public class SimpleChanges implements ModInitializer {
	public static final String MOD_ID ="simplechanges";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
		
		LootTablesEntitiesModifier.modifyLootTables();

		ModRegisteries.registerModThings();
		CustomTrades.registerCustomTrades();
		

	}
}
