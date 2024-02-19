package net.simplechanges;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

    }
    
    public static class Items {
        public static final TagKey<Item> TAG_TEST =
            createTag("tag_test"); 
            
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(SimpleChanges.MOD_ID, name));
        }
    } 
}
