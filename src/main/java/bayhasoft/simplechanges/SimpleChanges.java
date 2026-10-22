package bayhasoft.simplechanges;

import bayhasoft.simplechanges.block.ModBlocks;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bayhasoft.simplechanges.LootTablesModifiers.LootTablesEntitiesModifier;
import bayhasoft.simplechanges.util.ItemComponentEvents;
import bayhasoft.simplechanges.util.ModRegistries;
import net.fabricmc.api.ModInitializer;

public class SimpleChanges implements ModInitializer {
	public static final String MOD_ID ="simplechanges";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
		
		LootTablesEntitiesModifier.modifyLootTables();

		ModRegistries.registerModThings();
		ItemComponentEvents.ModifyItemComponents();


	}

	public static Identifier id(String path) {
    	return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
