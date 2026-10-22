package bayhasoft.simplechanges.util;

import bayhasoft.simplechanges.SimpleChanges;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

        // none

        @SuppressWarnings("unused")
        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(SimpleChanges.MOD_ID, name));
        }
    }

    public static class Items {

        // none

        @SuppressWarnings("unused")
        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(SimpleChanges.MOD_ID, name));
        }
    }

    public static class DamageTypes {

        public static final TagKey<DamageType> IS_FIRE_OR_EXPLOSION = createTag("is_fire_or_explosion");

        private static TagKey<DamageType> createTag(String name) {
            return TagKey.create(Registries.DAMAGE_TYPE, Identifier.fromNamespaceAndPath(SimpleChanges.MOD_ID, name));
        }
    }
}