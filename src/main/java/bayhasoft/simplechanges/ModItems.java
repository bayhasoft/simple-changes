package bayhasoft.simplechanges;

import java.util.function.Function;

import bayhasoft.simplechanges.util.ModTags;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.ChargedProjectiles;
import net.minecraft.world.item.component.DamageResistant;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

public class ModItems {
    
    public static final Item PIG_SKIN = registerItem("pig_skin", Item::new);

    public static final Item CROSSBOW_TEST = registerItem("crossbow_test",  setting -> new CrossbowItem(setting
        .stacksTo(1)
        .durability(256)
        .component(DataComponents.CHARGED_PROJECTILES, ChargedProjectiles.EMPTY)
        .enchantable(1)
            .delayedComponent(DataComponents.DAMAGE_RESISTANT, (context) -> new DamageResistant(context.getOrThrow(ModTags.DamageTypes.IS_FIRE_OR_EXPLOSION)))
            )
    );

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(SimpleChanges.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(SimpleChanges.MOD_ID, name)))));
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(CreativeModeTabs.INGREDIENTS, PIG_SKIN);
    }

    private static void addToItemGroup(ResourceKey<CreativeModeTab> group, Item item) {
        CreativeModeTabEvents.modifyOutputEvent(group).register(entries -> entries.accept(item));
    }
    
    public static void registerModItems() {
        SimpleChanges.LOGGER.info("Registering Potions for " + SimpleChanges.MOD_ID);
    
        addItemsToItemGroup();
    }
}
  