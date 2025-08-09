package bayhasoft.simplechanges;

import bayhasoft.simplechanges.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bayhasoft.simplechanges.LootTablesModifiers.LootTablesEntitiesModifier;
import bayhasoft.simplechanges.util.CustomTrades;
import bayhasoft.simplechanges.util.ItemComponentEvents;
import bayhasoft.simplechanges.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class SimpleChanges implements ModInitializer {
	public static final String MOD_ID ="simplechanges";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
		
		LootTablesEntitiesModifier.modifyLootTables();

		ModRegistries.registerModThings();
		CustomTrades.registerCustomTrades();
		ItemComponentEvents.ModifyItemComponents();
		

	}

	public static Identifier id(String path) {
    	return Identifier.of(MOD_ID, path);
    }
}
