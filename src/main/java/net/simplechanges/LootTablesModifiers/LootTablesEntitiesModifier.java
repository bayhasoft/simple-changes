package net.simplechanges.LootTablesModifiers;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.LootingEnchantLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.simplechanges.ModItems;

public class LootTablesEntitiesModifier {
    
    private static final Identifier PIG_ID
    = new Identifier("minecraft", "entities/pig");

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
        });
    }
}
