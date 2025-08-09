package bayhasoft.simplechanges.util;

import bayhasoft.simplechanges.SimpleChanges;
import net.minecraft.block.Block;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        // none

        @SuppressWarnings("unused")
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(SimpleChanges.MOD_ID, name));
        }
    }

    public static class Items {

        // none

        @SuppressWarnings("unused")
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(SimpleChanges.MOD_ID, name));
        }
    }    
    
    public static class DamageTypes {

        public static final TagKey<DamageType> IS_FIRE_OR_EXPLOSION = createTag("is_fire_or_explosion");

        private static TagKey<DamageType> createTag(String name) {
            return TagKey.of(RegistryKeys.DAMAGE_TYPE, Identifier.of(SimpleChanges.MOD_ID, name));
        }
    }
}