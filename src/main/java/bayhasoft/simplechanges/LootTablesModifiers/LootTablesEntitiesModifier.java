package bayhasoft.simplechanges.LootTablesModifiers;

import bayhasoft.simplechanges.ModItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.EnchantedCountIncreaseFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.floats.ContextFloatProviders;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;


public class LootTablesEntitiesModifier {
    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            
            if(Identifier.fromNamespaceAndPath("minecraft", "entities/pig").equals(key.identifier())) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .add(LootItem.lootTableItem(ModItems.PIG_SKIN))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(0, 2)).build())
                    .apply(EnchantedCountIncreaseFunction.lootingMultiplier(registries.lookupOrThrow(Enchantments.LOOTING.registryKey()), ContextFloatProviders.between(0.0f, 1.0f)));
                tableBuilder.pool(poolBuilder.build());
            }

            if(Identifier.fromNamespaceAndPath("minecraft", "entities/blaze").equals(key.identifier())) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .add(LootItem.lootTableItem(Items.GLOWSTONE_DUST))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(0, 2)).build())
                    .apply(EnchantedCountIncreaseFunction.lootingMultiplier(registries.lookupOrThrow(Enchantments.LOOTING.registryKey()), ContextFloatProviders.between(0.0f, 1.0f)));
                tableBuilder.pool(poolBuilder.build());
            }
            
            if(Identifier.fromNamespaceAndPath("minecraft", "entities/husk").equals(key.identifier())) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(.50f))
                    .add(LootItem.lootTableItem(Items.SAND))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(1, 2)).build())
                    .apply(EnchantedCountIncreaseFunction.lootingMultiplier(registries.lookupOrThrow(Enchantments.LOOTING.registryKey()), ContextFloatProviders.between(0.0f, 1.0f)));
                tableBuilder.pool(poolBuilder.build());
            }            
        });
    }
}
