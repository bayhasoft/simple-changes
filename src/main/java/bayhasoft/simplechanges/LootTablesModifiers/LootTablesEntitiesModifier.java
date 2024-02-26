package bayhasoft.simplechanges.LootTablesModifiers;

import bayhasoft.simplechanges.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.LootingEnchantLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class LootTablesEntitiesModifier {
    
    private static final Identifier PIG_ID
    = new Identifier("minecraft", "entities/pig");
    private static final Identifier BLAZE_ID
    = new Identifier("minecraft", "entities/blaze");
    private static final Identifier HUSK_ID
    = new Identifier("minecraft", "entities/husk");
    
    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(PIG_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .with(ItemEntry.builder(ModItems.pig_skin))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 2.0f)).build())
                    .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0, 1)));
                tableBuilder.pool(poolBuilder.build());
            }

            if(BLAZE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .with(ItemEntry.builder(Items.GLOWSTONE_DUST))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 2.0f)).build())
                    .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0, 1)));
                tableBuilder.pool(poolBuilder.build());
            }
            
            if(HUSK_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(.20f))
                    .with(ItemEntry.builder(Items.SAND))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                    .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0, 1)));
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}
