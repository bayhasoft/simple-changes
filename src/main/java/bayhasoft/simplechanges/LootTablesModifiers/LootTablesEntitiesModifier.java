package bayhasoft.simplechanges.LootTablesModifiers;

import bayhasoft.simplechanges.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.EnchantedCountIncreaseLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;


public class LootTablesEntitiesModifier {
    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if(EntityType.PIG.getLootTableId() == key) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .with(ItemEntry.builder(ModItems.pig_skin))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 2.0f)).build())
                    //.apply(EnchantedCountIncreaseLootFunction.builder(null, UniformLootNumberProvider.create(0.0F, 1.0F)))/*TODO: make this line work(looting Enchantment) */
                    /*.apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0, 1)))*/;
                tableBuilder.pool(poolBuilder.build());
            }

            if(EntityType.BLAZE.getLootTableId() == key) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .with(ItemEntry.builder(Items.GLOWSTONE_DUST))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 2.0f)).build())
                    /* .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0, 1)))*/;
                tableBuilder.pool(poolBuilder.build());
            }
            
            
            if(EntityType.HUSK.getLootTableId() == key) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(.20f))
                    .with(ItemEntry.builder(Items.SAND))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                    /*.apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0, 1)))*/;
                tableBuilder.pool(poolBuilder.build());
            }
            /*---------------------------------------------------------- */

            /*---------------------------------------------------------- */
        });
    }
    /*---------------------------------------------------------- */

    /*---------------------------------------------------------- */
}
